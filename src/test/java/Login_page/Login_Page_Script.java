package Login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page_Script {

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://the-internet.herokuapp.com/login");

	        WebElement username = driver.findElement(By.id("username"));
	        WebElement password = driver.findElement(By.id("password"));
	        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));

	        username.sendKeys("tomsmith");
	        Thread.sleep(1000);
	        password.sendKeys("SuperSecretPassword!");
	        loginBtn.click();
	        Thread.sleep(1000);
	        String message = driver.findElement(By.id("flash")).getText();
	        System.out.println("Login Message: " + message);

	        driver.quit();
	    }
	}

