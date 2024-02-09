package org.swagLabs;

import io.appium.java_client.AppiumDriver;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.LoginScreen;

public class LoginTest {

    @Test
    public void loginAsStandardUser(){

        // Arrange
        AppiumDriver appiumDriver=null;
        User userData = new User("standard_user", "secret_sauce");

        // Act
        HomeScreen homeScreen = new LoginScreen(null)
                .login(userData);

        // Assert
        boolean isHomePageDisplayed = homeScreen.isHomePageDisplayed();
        Assert.assertTrue(isHomePageDisplayed);

    }
}
