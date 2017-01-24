package pageObjects;


import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class NoteBook extends DriverHolder {

    public NoteBook(WebDriver driver) {

        super(driver);

        PageFactory.initElements(driver, this);

    }

    public TypeNoteBook clickTypeNoteBook(){

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebElement dynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='container']//div[@class='p-auto-block"+
                        " p-auto-block-1'][1]//div[@name='block_with_goods'][1]//h3/a")));

        WebElement noteBook = driver.findElement(By.xpath("//div[@class='container']//div[@class='p-auto-block p-auto-block-1'][1]"+
                "//div[@name='block_with_goods'][1]//h3/a"));

        noteBook.click();

        return new TypeNoteBook(driver);


    }
}


