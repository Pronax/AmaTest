package pageObjects;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Phones extends DriverHolder {

    public Phones(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver, this);
    }

    public SmartPhone clickSmartPhone(){

        driver.findElement(By.xpath(elSmartPhone)).click();

        return new SmartPhone(driver);
    }


}
