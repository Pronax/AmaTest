package pageObjects;


import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.util.LinkedList;
import java.util.List;

public class SmartPhone extends DriverHolder{

    public SmartPhone(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver, this);

    }

    List<String> namePhone = new LinkedList<String>();

    List<String> pricesPhone = new LinkedList<String>();

    public void getPhonesList() {

        for(int i = 0; i<3;i++) {
            driver.findElement(By.xpath(".//*[@id='block_with_goods']//span[@class='g-i-more-link-text']")).click();
        }

        List<WebElement> nameTopPhones = driver.findElements(By.xpath(".//*[@class='g-tag g-tag-icon-middle-popularity sprite']"+
                "/../../..//div[@class='g-i-tile-i-title clearfix']/a"));

        List<WebElement> pricesTopPhones = driver.findElements(By.xpath(".//*[@class='g-tag g-tag-icon-middle-popularity sprite']"+
                "/../../..//div[@class='g-price-uah']"));

        for(int i = 0; i < nameTopPhones.size(); i++){

            namePhone.add(nameTopPhones.get(i).getText());

            pricesPhone.add(pricesTopPhones.get(i).getText());

        }

        for (int i = 0; i< namePhone.size(); i++){

            System.out.println(namePhone.get(i));

            System.out.println(pricesPhone.get(i));

            System.out.println("");

        }
    }








}






