package pageObjects;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RozetkaHome extends DriverHolder {

    public RozetkaHome(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver, this);

    }

    public WebElement getPhoneAndElectronics(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(el)));

        return driver.findElement(By.xpath(el));

    }

    public RozetkaHome homePage(){

        driver.get(homePage);

       // driver.findElement(By.xpath(".//*[@id='language-switcher']/a")).click();

        return new RozetkaHome(driver);

    }

    public PhoneAndElectronics goPhoneAndElectronics(){

        driver.findElement(By.xpath(el)).click();

        return new PhoneAndElectronics(driver);

    }

    public NoteBook goNoteBook(){

        WebElement elNoteBook = driver.findElement(By.xpath("//li[@id='2416']/a"));

        elNoteBook.click();

        if(driver.getCurrentUrl().contains("computers-notebooks") != true){
            String linkNoteBook = elNoteBook.getAttribute("href");
            driver.get(linkNoteBook);
        }

        return new NoteBook(driver);

    }
}




