package org.example;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class StepImplementation extends BaseTest {

    Logger logger = LogManager.getLogger(StepImplementation.class);


    @Step("<second> Wait")
    public void waitForSecond(int second) throws InterruptedException {

        Thread.sleep(1000 * second);

    }

    @Step("<ID> Skip Location")
    public void skipLocationButton(String ID) {


        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();


    }

    @Step("<ID> Welcome Page")
    public void skipWelcomePage(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();


    }

    @Step("<ID> Click Decline")
    public void clickDeclineButton(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();

    }


    @Step("<ID> Click Remind Me Later")
    public void clickRemindMeLater(String ID) {


        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
    }


    @Step("<ID> Click Limitless Button")
    public void clickLimitlessButton(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
        logger.info("Click Limitless Button Successfully.");

    }

    @Step("<ID> Click Book Menu")
    public void clickBookMenu(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
        logger.info("Click Book Menu Successfully.");

    }

    @Step("<xpath> Select One Way Trip")
    public void selectOneWay(String xpath) {

        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();

    }

    @Step("<ID> Select From Trip and Write <key>")
    public void selectFromTrip(String ID, String key) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
        element.sendKeys(key);

    }

    @Step("<ID> Select To Trip and Write <key>")
    public void selectToTrip(String ID, String key) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
        element.sendKeys(key);

    }

    @Step("<ID> Click Date")
    public void clickDate(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
    }

    @Step("<xpath> Select Travel")
    public void clickTravelDate(String xpath) {

        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
    }

    @Step("<ID> Click Confirm")
    public void clickConfirm(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
    }

    @Step("<ID> Click Search Flights")
    public void clickSearchFlight(String ID) {

        MobileElement element = appiumDriver.findElement(By.id(ID));
        element.click();
    }

    @Step("<xpath> Select Flight")
    public void selectFlight(String xpath) {

        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.click();
    }


}
