package com.stepdefinitions.com;

import com.commonlibraries.ui.GetWebDriver;
import com.commonlibraries.ui.UIObjectAction;
import com.objectdefinition.com.commonelements.CommonElements;
import com.objectdefinition.com.launchpage.LaunchPage;
import com.objectdefinition.login.LoginScreen;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Locale;

public class CommonActions {


    WebDriver wd = GetWebDriver.getObject();
    LoginScreen ls = LoginScreen.getLoginScreenObject();
    CommonElements ce = CommonElements.getCommonElements();
    LaunchPage lp = LaunchPage.getLauncPageElements();

    HashMap<String, String> objXPath = ls.getObjectXPath();
    HashMap<String, String> objAction = ls.getObjectAction();

    HashMap<String, String> objXPathCommon = ce.getObjectXPath();
    HashMap<String, String> objActionCommon = ce.getObjectAction();

    HashMap<String, String> objXPathLaunch = lp.getObjectXPath();
    HashMap<String, String> objActionLaunch = lp.getObjectAction();

    @When("^User clicks on ([^\"]*) (button|link|Logo)$")
    public void clickButton(String objName, String elementType)
    {
        //Need to change if else
        String xPath = "", xPathAction = "";
        if(objXPath.containsKey(objName)) {
            xPath = objXPath.get(objName);
            xPathAction = objAction.get(objName);
        }
        else if(this.objXPathCommon.containsKey(objName))
        {
            xPath = objXPathCommon.get(objName);
            xPathAction = objActionCommon.get(objName);
        }

        else if(this.objXPathLaunch.containsKey(objName))
        {
            xPath = objXPathLaunch.get(objName);
            xPathAction = objActionLaunch.get(objName);
        }

        UIObjectAction.takeUIAction(xPath, xPathAction);

    }

    @Then("User finds a page with title {string} is displayed")
    public void validatePageTitle(String title)
    {
        String pageTitle = UIObjectAction.getElementCurrentValue(objXPath.get("pageTitle"), "Title");

        Assert.assertEquals(title.toLowerCase(), pageTitle.toLowerCase());
    }

   // @Then("User close the browser")
    @After
    public void closeBrowser()
    {
//        UIObjectAction.takeBrowserAction("quit");
    }

    @Then("^User validates that (button|Link) ([^\"]*) is present on ([^\"]*) page$")
    public void validateButtonPresence(String webelementType, String objName, String pageName)
    {
        String xPath = "", xPathAction = "";
        if(objXPath.containsKey(objName)) {
            xPath = objXPath.get(objName);
            xPathAction = objAction.get(objName);
        }
        else if(this.objXPathCommon.containsKey(objName))
        {
            xPath = objXPathCommon.get(objName);
            xPathAction = objXPathCommon.get(objName);
        }
        else if(this.objXPathLaunch.containsKey(objName))
        {
            xPath = objXPathLaunch.get(objName);
            xPathAction = objActionLaunch.get(objName);
        }

        String buttonText = UIObjectAction.getElementCurrentValue(xPath, "displayed");
        Assert.assertEquals(true, Boolean.parseBoolean(buttonText));
    }

    @Then("User clicks on {string} with text {string}")
    public void clickElementWithText(String elementType, String elementText) {
        String xPath = objXPathCommon.get(elementType).replace("textname", elementText);
        UIObjectAction.takeUIAction(xPath, objActionCommon.get(elementType));
    }

}
