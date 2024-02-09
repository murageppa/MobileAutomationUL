package screens;

import io.appium.java_client.AppiumDriver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import models.User;
import org.openqa.selenium.By;

@Getter
public class LoginScreen {
    private AppiumDriver appiumDriver;

    public LoginScreen(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }

    By userNameTextField = By.id("test-Username");
    By passwordTextField = By.id("test-Password");
    By loginButton = By.id("test-LOGIN");

    public HomeScreen login(User user) {
        appiumDriver.findElement(userNameTextField).sendKeys(user.getUserName());
        appiumDriver.findElement(passwordTextField).sendKeys(user.getPassword());
        appiumDriver.findElement(loginButton).click();
        return new HomeScreen(appiumDriver);
    }
}
