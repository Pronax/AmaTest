package pageObjects;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Stanislav on 17.01.2017.
 */
public class TypeNoteBook extends DriverHolder{

    public TypeNoteBook (WebDriver driver){

        super(driver);

        PageFactory.initElements(driver, this);

    }

    public LenovoNoteBook lenovoNoteBook(){

        driver.findElement(By.xpath("//div[@class='p-auto-block p-auto-block-1'][2]//div[2]/div[3]//a")).click();

        return new LenovoNoteBook(driver);
    }

}
