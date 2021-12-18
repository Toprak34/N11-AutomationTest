package com.n11.utilies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public Driver(){

    }

    private static WebDriver driver;

    public static WebDriver get() {
        if (driver == null){
            String browser = ConfigurationReader.get("browser");
            switch (browser){
                case "chrome":
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("profile.default_content_setting_values.notifications", 2);
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", prefs);
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

            }
        }

        return driver;
    }

    public static void closeDriver(){
        if (driver !=null)  {
            driver.quit();
            driver = null;

        }
    }


}
