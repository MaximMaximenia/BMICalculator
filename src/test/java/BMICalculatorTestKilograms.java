import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.lang.System;
import org.testng.*;
public class BMICalculatorTestKilograms {

    WebDriver browser;

    @Test
    public void calculatedKgCmsStarvation() {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("15");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation", "Неверная категория.");
    }

    @Test
    public void calculatedKgCmsUnderweight() {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("16");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight", "Неверная категория.");

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("18.5");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category2 = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight", "Неверная категория.");

    }

    @Test
    public void calculatedKgCmsNormal() {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("18.6");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal", "Неверная категория.");
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("25");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category2 = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal", "Неверная категория.");



    }

    @Test
    public void calculatedKgCmsOverweight() {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("26");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight", "Неверная категория.");
        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("30");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category2 = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight", "Неверная категория.");



    }

    @Test
    public void calculatedKgCmsObese() {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("31");
        browser.findElement(By.name("ht")).sendKeys("100");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        String SIunits = browser.findElement(By.name("si")).getAttribute("value");
        String USunits = browser.findElement(By.name("us")).getAttribute("value");
        String UKunits = browser.findElement(By.name("uk")).getAttribute("value");

        Assert.assertEquals(category, "Your category is Obese", "Неверная категория.");



    }

    @Test
    public void checkUnits() {
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("70");
        browser.findElement(By.name("ht")).sendKeys("150");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        String SIunits = browser.findElement(By.name("si")).getAttribute("value");
        String USunits = browser.findElement(By.name("us")).getAttribute("value");
        String UKunits = browser.findElement(By.name("uk")).getAttribute("value");
        Assert.assertEquals(SIunits, "31.11");
        Assert.assertEquals(USunits, "31.63");
        Assert.assertEquals(UKunits, "197.55");}

    @AfterMethod (alwaysRun = true)

    public void closeBrowser() {

        browser.quit();
  }}



