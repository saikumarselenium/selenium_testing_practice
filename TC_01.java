package com.testcase;

import com.webutils.WebUtils;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class TC_01 extends WebUtils {
    @Epic("Register")
    @Story("user1")
    @Test
    public void user(){
       launchBrowser("chrome");
        System.out.println("launched");

    }
}
