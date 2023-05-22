package ru.testsamokat;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumSamokatOrderTest extends Basetest {


    @Test
    public void testOrderSamokatWithHeader() throws InterruptedException {

        pages.clickHeaderOrderButton();
        pages.setMetro();
        pages.fillFirstName("тутМогла");
        pages.fillSecondName("БытьВаша");
        pages.fillAddress("1-ая Реклама");
        pages.fillPhoneNumber("+7911111111");
        pages.clickNextButton();
        pages.setDateCalendar();
        pages.setTimeForUse();
        pages.selectColourBlack();
        pages.clickOnDoOrder();
        pages.clickOnYesButton();
        Assert.assertTrue(pages.getTextAfterOrder());

    }


}
