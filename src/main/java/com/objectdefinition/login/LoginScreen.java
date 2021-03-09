package com.objectdefinition.login;

import java.util.HashMap;

public class LoginScreen {


    public static LoginScreen ls = null;
    private static String loginButton = "//a[contains(text(),'Sign in')]";
    private static String pageTitle = "//head//title";
    private static String createAccountButton = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]";
    private static String emailAddressTextField = "//input[@id='email_create']";
    private static String newEmail = "//input[@id='email']']";
    private static String userTitle= "//input[@id='id_gender1']";
    private static String firstName= "//input[@id='customer_firstname']";
    private static String lastName= "//input[@id='customer_lastname']";
    private static String password= "//input[@id='passwd']";
    private static String dateOfBirth= "//input[@id='id_gender1']";
    private static String address = "//input[@id='address1']";
    private static String addressFirstName = "//input[@id='firstname']";
    private static String addressLastName = "//input[@id='lastname']";
    private static String company = "//input[@id='company']";
    private static String address2 = "//input[@id='address2']";
    private static String addressCity = "//input[@id='city']";
    private static String addressState = "//select[@id='id_state']";
    private static String addressZip = "//input[@id='postcode']";
    private static String country = "//select[@id='id_country']";
    private static String additionalInfo = "//textarea[@id='other']";
    private static String mobile = "//input[@id='phone_mobile']";
    private static String alias = "//input[@id='alias']";
    private static String registerButton = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]";
    private static String loginId = "//input[@id='email']";
    private static String loginpassword = "//input[@id='passwd']";
    private static String signin = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]";
    private static String textName = "//span[contains(text(),'textname')]";



    private LoginScreen()
    {

    }

    public static LoginScreen getLoginScreenObject()
    {
        if(ls == null)
            ls = new LoginScreen();

        return ls;
    }
    public HashMap<String, String> getObjectXPath()
    {
        HashMap<String, String> objXPath = new HashMap<>();

        objXPath.put("Login" , loginButton);
        objXPath.put("pageTitle" , pageTitle);
        objXPath.put("Create an account" , createAccountButton);
        objXPath.put("emailAddressField" , emailAddressTextField);
        objXPath.put("UserTitle" , userTitle);
        objXPath.put("First Name" , firstName);
        objXPath.put("Last Name" , lastName);
        objXPath.put("Password" , password);
        objXPath.put("Date Of Birth" , dateOfBirth);
        objXPath.put("Address" , address);
        objXPath.put("Address First Name" , addressFirstName);
        objXPath.put("Address Last Name" , addressLastName);
        objXPath.put("Company" , company);
        objXPath.put("Address2" , address2);
        objXPath.put("City" , addressCity);
        objXPath.put("State" , addressState);
        objXPath.put("Zip" , addressZip);
        objXPath.put("Country" , country);
        objXPath.put("Mobile" , mobile);
        objXPath.put("AddressAlias" , alias);
        objXPath.put("AdditionalInfo" , additionalInfo);
        objXPath.put("Register" , registerButton);
        objXPath.put("LoginId" , loginId);
        objXPath.put("LoginPassword" , loginpassword);
        objXPath.put("SignIn" , signin);
        objXPath.put("LinkWithName" , textName);

        return objXPath;
    }


    public HashMap<String, String> getObjectAction()
    {
        HashMap<String, String> objAction = new HashMap<>();

        objAction.put("Login" , "click");
        objAction.put("pageTitle" , "validate");
        objAction.put("Create an account" , "click");
        objAction.put("emailAddressField" , "sendkeys");
        objAction.put("Title" , "radio");
        objAction.put("First Name" , "sendkeys");
        objAction.put("Last Name" , "sendkeys");
        objAction.put("Password" , "sendkeys");
        objAction.put("Date Of Birth" , "select");
        objAction.put("Address" , "sendkeys");
        objAction.put("Address First Name" , "sendkeys");
        objAction.put("Address Last Name" , "sendkeys");
        objAction.put("Company" , "sendkeys");
        objAction.put("Address2" , "sendkeys");
        objAction.put("City" , "sendkeys");
        objAction.put("State" , "select");
        objAction.put("Zip" , "sendkeys");
        objAction.put("Country" , "select");
        objAction.put("Mobile" , "sendkeys");
        objAction.put("AddressAlias" , "sendkeys");
        objAction.put("AdditionalInfo" , "sendkeys");
        objAction.put("Register" , "submit");
        objAction.put("LoginId" , "sendkeys");
        objAction.put("LoginPassword" , "sendkeys");
        objAction.put("SignIn" , "click");
        objAction.put("LinkWithName" , "click");

        return objAction;
    }



}
