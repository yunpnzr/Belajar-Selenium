import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.yunpnzr.config.envTarget;

import java.time.Duration;

/*
public class Login extends envTarget {
    @Test
    public void loginSuccess(){
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

        //driver.manage().timeouts().implicitlyWait(duration);

        //set username
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //set password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click login
        driver.findElement(By.xpath("//input[@type='submit'][@data-test='login-button']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='header_container']/div[2]/span")
                )
        );

        driver.quit();
    }

    @Test
    public void loginFailed() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@type='submit'][@data-test='login-button']")
                )
        );

        //set username
        driver.findElement(By.name("user-name")).sendKeys("standard_sauce");
        //set password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click login
        driver.findElement(By.xpath("//input[@type='submit'][@data-test='login-button']")).click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='login_button_container']/div/form/div[3]")
                )
        );

        driver.quit();
    }
}
*/
