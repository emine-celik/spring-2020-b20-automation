package com.cybertek.tests.day11_utils_review_actions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsPractices {
    /*
    TC #15: Hover Test
    1. Go to http://practice.cybertekschool.com/hovers
    2. Hover over to first image
    3. Assert:
        a. “name: user1” is displayed
    4. Hover over to second image
    5. Assert:
        a. “name: user2” is displayed
    6. Hover over to third image
    7. Confirm:
        a. “name: user3” is displayed
     */
    @Test
    public void hover_over_test(){
        //driver
        //1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//div[@class='figure'])[1]"));

    }

}
