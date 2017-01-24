package pageObjects;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PhoneAndElectronics extends DriverHolder {

    public PhoneAndElectronics(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver, this);

    }

    public Phones clickPhones(){

        driver.findElement(By.xpath(elPhone)).click();

        return new Phones(driver);

        }
}
