package com.sahabt;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseSearch {
    WebDriver driver;
    FirstTest firstTest = new FirstTest();

    @Test
    public void Mouse_Search_Test() throws InterruptedException {
        firstTest.setup();
        firstTest.login("turanaykut35@gmail.com","123456at");
        firstTest.thread(3000);
        firstTest.mouse();

    }

    }

