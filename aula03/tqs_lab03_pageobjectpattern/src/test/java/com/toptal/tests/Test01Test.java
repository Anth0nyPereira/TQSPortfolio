package com.toptal.tests;
// Generated by Selenium IDE
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import io.github.bonigarcia.seljup.SeleniumJupiter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.concurrent.TimeUnit;

@ExtendWith(SeleniumJupiter.class)
public class Test01Test {
  @Test
  public void test01(ChromeDriver driver) {
    driver.get("https://www.toptal.com/talent/apply");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.id("talent_create_applicant_full_name")).click();
    driver.findElement(By.id("talent_create_applicant_full_name")).sendKeys("Anthony Pereira");
    driver.findElement(By.id("talent_create_applicant_email")).click();
    driver.findElement(By.id("talent_create_applicant_email")).sendKeys("anthonypereira@ua.pt");
    driver.findElement(By.id("talent_create_applicant_password")).click();
    driver.findElement(By.id("talent_create_applicant_password")).sendKeys("superstrongpassword");
    driver.findElement(By.id("talent_create_applicant_password_confirmation")).click();
    driver.findElement(By.id("talent_create_applicant_password_confirmation")).sendKeys("superstrongpassword");
  }
}
