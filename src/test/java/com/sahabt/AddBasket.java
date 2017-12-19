package com.sahabt;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddBasket {
    WebDriver driver;
    FirstTest firstTest = new FirstTest();

    @Test
    public void Add_Basket_Test() throws InterruptedException {
        firstTest.setup();
        firstTest.login("turanaykut35@gmail.com","123456at");
        firstTest.addbasket();
        firstTest.thread(5000);
        firstTest.gobasket1();
        firstTest.thread(5000);
        firstTest.gobasket2();

}}
