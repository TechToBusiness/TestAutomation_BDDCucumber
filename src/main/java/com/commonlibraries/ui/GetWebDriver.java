package com.commonlibraries.ui;

import com.config.PathVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;


public class GetWebDriver {
    private static WebDriver obj  = null;

    private GetWebDriver()
    {

    }
    public static WebDriver getObject()
    {
        String browserType = PathVariables.browserType;
        if(obj == null)
        {
            if(browserType.equalsIgnoreCase("chrome"))
            {
                System.setProperty("webdriver.chrome.driver", PathVariables.baseDir + "\\Drivers\\chromedriver.exe");
                obj = new ChromeDriver();
            }
            else if(browserType.equalsIgnoreCase("firefox"))
            {
                obj = new FirefoxDriver();
            }
            else if(browserType.equalsIgnoreCase("MSedge"))
            {
                obj = new InternetExplorerDriver();
            }
            obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return obj;
    }
}
