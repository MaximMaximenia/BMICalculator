import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.lang.System;
import org.testng.*;

public class BMICalculatorTestPound {

    WebDriver browser;

    @Test
    public void calculatedKgCmsStarvation() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("68");
        browser.findElement(By.name("ht")).sendKeys(" 213.24");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Starvation", "Неверная категория.");

    }


    @Test
    public void calculatedKgCmsUnderweight() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("69");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Underweight", "Неверная категория.");

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("84");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category2 = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category2, "Your category is Underweight", "Неверная категория.");

    }

    @Test
    public void calculatedKgCmsNormal() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("85");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Normal", "Неверная категория.");

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");

        browser.findElement(By.name("wg")).sendKeys("113");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category2 = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category2, "Your category is Normal", "Неверная категория.");


    }

    @Test
    public void calculatedPoundOverweight() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("114");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category, "Your category is Overweight", "Неверная категория.");

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("136");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category2 = browser.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(category2, "Your category is Overweight", "Неверная категория.");


    }

    @Test
    public void calculatedPoundObese() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("137");
        browser.findElement(By.name("ht")).sendKeys("213.24");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        String SIunits = browser.findElement(By.name("si")).getAttribute("value");
        String USunits = browser.findElement(By.name("us")).getAttribute("value");
        String UKunits = browser.findElement(By.name("uk")).getAttribute("value");

        Assert.assertEquals(category, "Your category is Obese", "Неверная категория.");


    }

    //d
    @Test
    public void checkUnits() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\webdrivers\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("opt1")).click();
        browser.findElement(By.name("opt1")).sendKeys("p");
        browser.findElement(By.name("wg")).sendKeys("70");
        browser.findElement(By.name("ht")).sendKeys("200");
        browser.findElement(By.name("cc")).click();
        String category = browser.findElement(By.name("desc")).getAttribute("value");
        String SIunits = browser.findElement(By.name("si")).getAttribute("value");
        String USunits = browser.findElement(By.name("us")).getAttribute("value");
        String UKunits = browser.findElement(By.name("uk")).getAttribute("value");
        Assert.assertEquals(SIunits, "7.95");
        Assert.assertEquals(USunits, "8.09");
        Assert.assertEquals(UKunits, "50.51");
    }

    @AfterMethod(alwaysRun = true)

    public void closeBrowser() {

        browser.quit();
    }
}
