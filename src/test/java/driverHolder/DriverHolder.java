package driverHolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverHolder {

    protected WebDriver driver;

    public DriverHolder(WebDriver driver){

        this.driver = driver;

    }

    protected String homePage = "http://rozetka.com.ua";

    protected String el = "//*[@id='3361']/a";

    protected String elPhone = "//*[@class='p-auto-block p-auto-block-1'][1]//*[@class='pab-row pab-row-tierce'][1]/div[1]//h3/a";

    protected String elSmartPhone = "//div[@class='p-auto-block p-auto-block-2']//*[@class='pab-cell pab-img-150'][1]//h3/a";


    public WebElement getPhoneAndElectronics(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(el)));

        return driver.findElement(By.xpath(el));
    }
}

