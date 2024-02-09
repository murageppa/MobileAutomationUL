package screens;

import io.appium.java_client.AppiumDriver;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;

public class HomeScreen {
    private AppiumDriver appiumDriver;
    public HomeScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }
    By homeMenu = By.id("test-Menu");

    public boolean isHomePageDisplayed() {
        boolean isPresent = appiumDriver.findElement(homeMenu).isDisplayed();
        return isPresent;
    }
}
