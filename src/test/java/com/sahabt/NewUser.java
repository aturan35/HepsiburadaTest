package com.sahabt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class NewUser {
    WebDriver driver;
    FirstTest firstTest = new FirstTest();


    @Test
    public void create_new_user_weak_password_test() throws InterruptedException {
        firstTest.setup();
        firstTest.createUser("1234", "1234");
        String title = firstTest.getTitle();
        Assert.assertTrue("Create Error", title.contains("Hemen Kayıt Ol!"));
        System.out.println("weak password");
    }
    @Test
    public void crete_user_success_password_test() throws InterruptedException {
        firstTest.setup();
        firstTest.createUser("123456at","123456at");
        String title = firstTest.getTitle();
        Assert.assertTrue("Create Success", title.contains("Türkiye'nin"));
        System.out.println("user created");
    }
}