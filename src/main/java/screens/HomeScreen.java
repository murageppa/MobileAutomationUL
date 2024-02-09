package screens;

import io.appium.java_client.AppiumDriver;

public class HomeScreen {
    private AppiumDriver appiumDriver;
    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver=appiumDriver;
    }

    public boolean isHomePageDisplayed() {
        return true;
    }
}
