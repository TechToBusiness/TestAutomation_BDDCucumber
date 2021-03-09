package com.objectdefinition.com.commonelements;

import com.objectdefinition.login.LoginScreen;

import java.util.HashMap;

public class CommonElements {
    public static CommonElements ce = null;
    private static final String linkElement = "//span[contains(text(),'textname')]";
    private static final String userAccount = "//a[@title='View my customer account']";
    private static final String logoutLink = "//a[@class='logout']";



    private CommonElements()
    {

    }

    public static CommonElements getCommonElements()
    {
        if(ce == null)
            ce = new CommonElements();

        return ce;
    }
    public HashMap<String, String> getObjectXPath()
    {
        HashMap<String, String> objXPath = new HashMap<>();

        objXPath.put("Link" , linkElement);
        objXPath.put("UserAccount" , userAccount);
        objXPath.put("Logout" , logoutLink);

        return objXPath;
    }


    public HashMap<String, String> getObjectAction()
    {
        HashMap<String, String> objAction = new HashMap<>();

        objAction.put("Link" , "click");
        objAction.put("UserAccount" , "click");
        objAction.put("Logout" , "click");

        return objAction;
    }



}
