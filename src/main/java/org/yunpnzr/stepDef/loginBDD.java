package org.yunpnzr.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yunpnzr.config.envTarget;

import java.time.Duration;

public class loginBDD extends envTarget {

    @Given("User is on Login Page")
    public void userIsOnLoginPage() {
        //set driver location path
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        //maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //set url
        driver.get(url);

        //durasi web jika not respond
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@type='submit'][@data-test='login-button']")
                )
        );
    }

    @When("User fill username and password")
    public void userFillUsernameAndPassword() {
        //set username
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //set password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("User fill invalid username and password")
    public void userFillWrongUsernameAndPassword() {
        //set username
        driver.findElement(By.name("user-name")).sendKeys("wrong_user");
        //set password
        driver.findElement(By.id("password")).sendKeys("wrong_password");
    }

    @And("User click login button")
    public void userClickLoginButton() {
        driver.findElement(By.xpath("//input[@type='submit'][@data-test='login-button']")).click();
    }

    @Then("User verify login result")
    public void userVerifyLoginResult() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='header_container']/div[2]/span")
                )
        );

        driver.quit();
    }

    @Then("User get error message")
    public void userGetErrorMessage() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='login_button_container']/div/form/div[3]")
                )
        );
        driver.quit();
    }

    @Then("^User verify login result (.*)$")
    public void userVerifyLoginResult(String result) {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result.equals("success")) {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='header_container']/div[2]/span")
                    )
            );
        } else if (result.equals("failed")) {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@id='login_button_container']/div/form/div[3]")
                    )
            );
        }
        driver.quit();
    }

    @When("^User fill username (.*) and password (.*)$")
    public void userFillUsernameAndPassword(String username, String password) {
        driver.findElement(By.name("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }
}
