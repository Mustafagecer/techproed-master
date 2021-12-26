package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_Verify_Page_url {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.techproeducation.com/");
        String expectedUrl="www.techproeducation.com/";
        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("The actual Url and expected Url are same");
        }else {
            System.out.println("The actual Url and expected Url are not same");

        }
        driver.close();
    }}
