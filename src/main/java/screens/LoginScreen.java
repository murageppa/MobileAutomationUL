package screens;

import io.appium.java_client.AppiumDriver;
import lombok.AllArgsConstructor;
import lombok.Getter;
import models.User;
import org.openqa.selenium.By;

@Getter
@AllArgsConstructor()
public class LoginScreen {
    private AppiumDriver appiumDriver;

    public LoginScreen(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }

    private By userNameTextField = By.id("");
    private String passwordTextField;
    private String loginButton = "";

    public HomeScreen login(User user) {
        return new HomeScreen(appiumDriver);
    }
}
