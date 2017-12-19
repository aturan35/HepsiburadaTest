package com.sahabt;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchTest {
    WebDriver driver;
    FirstTest firstTest = new FirstTest();

    @Test
    public void Start_Search_Test() throws InterruptedException {
        firstTest.setup();
       firstTest.login("turanaykut35@gmail.com", "123456at");

        firstTest.thread(1000);

        firstTest.search();

        System.out.println("Kargo bedava");

        firstTest.click(By.id("addToCart"));

    }

}



