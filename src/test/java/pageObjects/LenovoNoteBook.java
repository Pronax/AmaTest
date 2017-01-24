package pageObjects;

import driverHolder.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stanislav on 24.01.2017.
 */
public class LenovoNoteBook extends DriverHolder {

    public LenovoNoteBook(WebDriver driver){

        super(driver);

        PageFactory.initElements(driver, this);

    }

    List<Integer> pricesNoteBook = new LinkedList<Integer>();

    public LenovoNoteBook getCountPage(){

        List<WebElement> list ;

        list = driver.findElements(By.xpath("//*[@class='clearfix inline']//a"));

        int countPage = Integer.parseInt(list.get(list.size()-1).getText());

        for(int i = 1; i< countPage; i++) {
            driver.findElement(By.xpath(
                    "//*[@class='novisited paginator-catalog-l-link']" +
                            "[text() = '" + i + "']")).click();

            getListPricesNoteBook();

        }


        return new LenovoNoteBook(driver);

    }

    public void getListPricesNoteBook(){

        List<WebElement> pricesNoteBook = driver.findElements
                (By.xpath(".//*[@class='g-i-tile-i-box-desc']//div[@class='g-price-uah']/text()"));

        for(int i = 0; i<pricesNoteBook.size(); i++ ){

            this.pricesNoteBook.add(Integer.parseInt(pricesNoteBook.get(i).getText()));

                if(this.pricesNoteBook.get(i)<15000){

                    System.out.println(this.pricesNoteBook);

                }
        }

    }



}
