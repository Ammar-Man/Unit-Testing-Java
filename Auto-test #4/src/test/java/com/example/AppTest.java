package com.example;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


import java.time.Duration;
/**
 * Unit test for simple App.
 */
public class AppTest {
    private WebDriver driver;

    public Boolean loginErorr(){
        
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1080, 853));
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".login_wrapper-inner"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        driver.findElement(By.cssSelector(".error-message-container")).click();
      
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".error-message-container")));
        String text =  firstResult.getText();
        String getWebsLogoName =   driver.findElement(By.className("login_logo")).getText();

      
      if (text.length() > 0 ){
        return false;
      }
      else return true;
        
    }

    public String  loginTest(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1080, 853));
        driver.findElement(By.id("login_credentials")).click();
        driver.findElement(By.id("login_credentials")).click();
        
          
        {
          WebElement element = driver.findElement(By.id("login_credentials"));
          
          Actions builder = new Actions(driver);
          builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
        driver.findElement(By.cssSelector(".login_password")).click();
        driver.findElement(By.cssSelector(".login_password")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".login_password"));
          Actions builder = new Actions(driver);
          builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        driver.findElement(By.cssSelector("#item_4_title_link > .inventory_item_name")).click();
        driver.findElement(By.cssSelector(".inventory_details_name")).click();
        driver.findElement(By.cssSelector(".inventory_details_name")).click();
        {
          WebElement element = driver.findElement(By.cssSelector(".inventory_details_name"));
          Actions builder = new Actions(driver);
          builder.doubleClick(element).perform();
        }
        driver.findElement(By.cssSelector(".inventory_details_name")).click();

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(By.cssSelector(".inventory_details_name")));

        

        // String title =  driver.findElement(By.id("login_credentials")).getText();
        String text =  firstResult.getText();
    
     
        return text;
        

    }

    @Before
    public void setUp() {
        driver = WebDriverManager.edgedriver().create();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testOne(){
        String getProduktName = loginTest(); 

        boolean loginErorr = loginErorr(); 
        

        assertFalse(loginErorr);

        assertTrue(  getProduktName.length() > 0);


    }
   

   
}
