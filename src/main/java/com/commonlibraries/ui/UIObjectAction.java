package com.commonlibraries.ui;

import io.cucumber.java.hu.Ha;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

public class UIObjectAction {

    public static WebDriver wd = GetWebDriver.getObject();

    public static void takeUIAction(String objXPath, String objAction){
        if(objAction.equalsIgnoreCase("click"))
            wd.findElement(By.xpath(objXPath)).click();
        else if(objAction.equalsIgnoreCase("submit"))
            wd.findElement(By.xpath(objXPath)).submit();

    }


    public static void takeUIAction(String objXPath, String objValue, String objAction){
        if(objAction.equalsIgnoreCase("sendkeys"))
            wd.findElement(By.xpath(objXPath)).sendKeys(objValue);
        else if(objAction.equalsIgnoreCase("select")){
            Select s = new Select(wd.findElement(By.xpath(objXPath)));
            s.selectByVisibleText(objValue);

        }
    }

    public static boolean assertUIValue(String objXPath, String objAction, boolean expectedMatch){
        boolean assertResult = false;

        if(objAction.equalsIgnoreCase("isDisplayed"))
            Assert.assertEquals(expectedMatch, wd.findElement(By.xpath(objXPath)).isDisplayed());


        return assertResult;
    }


    public static String getElementCurrentValue(String objXPath, String expFieldValue){
        String result = "";
        if(expFieldValue.equalsIgnoreCase("title"))
            result = wd.getTitle();
        else if(expFieldValue.equalsIgnoreCase("text"))
            result = wd.findElement(By.xpath(objXPath)).getText();
        else if(expFieldValue.equalsIgnoreCase("displayed"))
            result = String.valueOf(wd.findElement(By.xpath(objXPath)).isDisplayed());
        return result;
    }


    public static void takeBrowserAction(String bwrAction){

        if(bwrAction.equalsIgnoreCase("quit"))
        {
            wd.quit();
        }
    }
}
