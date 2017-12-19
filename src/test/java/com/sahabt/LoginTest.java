package com.sahabt;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    WebDriver driver;
    FirstTest firstTest = new FirstTest();

    @Test
    public void true_access_test() throws InterruptedException {
        firstTest.setup();
        firstTest.login("turanaykut35@gmail.com", "123456at");

        firstTest.thread(1000);
        String title = firstTest.getTitle();

        Assert.assertTrue("login Success",title.contains("Türkiye'nin"));
        System.out.println("Login success");
    }

    @Test
    public void Wrong_Or_Empty_Login_Test() throws InterruptedException {
        firstTest.setup();
        firstTest.login("adfgf","123");

        firstTest.thread(1000);
        String title = firstTest.getTitle();

        Assert.assertTrue("login Error",title.contains("Üye Giriş Sayfası"));
        System.out.println("Login Error");

    }

}





