package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;

import java.util.concurrent.TimeUnit;



public class assertTest {

    WebDriver driver;

    @Before

    public void webDriver() {

        System.setProperty("webdriver.gecko.driver", "C://Users/Stanislav/Desktop/практика Регулярка/geckodriver-v0.11.1-win64/geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }




    @Test

   /* public void openWindow(){

        RozetkaHome homeWindow = new RozetkaHome(driver);

        PhoneAndElectronics phoneAndElectronics;

        phoneAndElectronics = homeWindow.homePage().goPhoneAndElectronics();

        Phones phones = phoneAndElectronics.clickPhones();

        SmartPhone smartPhone = phones.clickSmartPhone();

        smartPhone.getPhonesList();



        Assert.assertTrue(driver.getCurrentUrl().contains("rozetka"));

    }*/

    public void getNoteBook(){

        RozetkaHome homeWindow = new RozetkaHome(driver);

        NoteBook noteBook = homeWindow.homePage().goNoteBook();

        TypeNoteBook typeNoteBook = noteBook.clickTypeNoteBook();

        LenovoNoteBook lenovoNoteBook = typeNoteBook.lenovoNoteBook();

        lenovoNoteBook.getCountPage();






    }




    @After

    public void tearDown(){

    }











}
