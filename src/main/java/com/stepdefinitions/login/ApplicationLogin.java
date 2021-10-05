package com.stepdefinitions.login;

import com.commonlibraries.ui.GetWebDriver;
import com.commonlibraries.nonui.Utils;
import com.commonlibraries.ui.UIObjectAction;
import com.config.PathVariables;
import com.objectdefinition.login.LoginScreen;
import io.cucumber.java.Before;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ApplicationLogin {
    WebDriver wd = GetWebDriver.getObject();
    LoginScreen ls = LoginScreen.getLoginScreenObject();
    HashMap<String, String> objXPath = ls.getObjectXPath();
    HashMap<String, String> objAction = ls.getObjectAction();

    //@Given("The Home page is launched")
    @Before
    public void launchURL()
    {
        wd.get(PathVariables.testURL);
    }

    @Then("User enters values for new user with {string} from {string} of input excel {string} present in {string} folder")
    public void createUsers(String emailID, String sheetName, String ExcelName, String folderName) throws Exception
    {
        String xlPath = PathVariables  .testDataLoc + folderName + "\\" + ExcelName;

        LinkedHashMap<String, String> userDetails = Utils.getNewUserDetails(xlPath, sheetName);

        try
        {
            for (String key: userDetails.keySet()){
                if(objAction.get(key).equals("sendkeys") || objAction.get(key).equalsIgnoreCase("select"))
                    UIObjectAction.takeUIAction(objXPath.get(key), userDetails.get(key), objAction.get(key));
                else if(objAction.get(key).equals("click"))
                    UIObjectAction.takeUIAction(key, objAction.get(key), objAction.get(key));
            }
        }catch(NullPointerException npe)
        {
            System.out.println(npe.getMessage());
        }
        UIObjectAction.takeUIAction(objXPath.get("Register"), "submit");

    }

    @Then("User finds {string} is available")
    public void validateEmailAvailable(String emailID)
    {
        boolean assertResult;
        UIObjectAction.takeUIAction(objXPath.get("emailAddressField"), emailID, objAction.get("emailAddressField"));

        UIObjectAction.takeUIAction(objXPath.get("Create an account"),"click");

        assertResult = Boolean.parseBoolean(UIObjectAction.getElementCurrentValue("//span[contains(text(),'Authentication')]", "displayed"));

        Assert.assertEquals(true, assertResult);
    }


    @Then("User logs in the application by entering {string} and {string}")
    public void userLoginToApplication(String userName, String password) {
        UIObjectAction.takeUIAction(objXPath.get("LoginId"), userName,  objAction.get("LoginId"));

        UIObjectAction.takeUIAction(objXPath.get("LoginPassword"), password, objAction.get("LoginPassword"));

        UIObjectAction.takeUIAction(objXPath.get("SignIn"), objAction.get("SignIn"));

    }
}
