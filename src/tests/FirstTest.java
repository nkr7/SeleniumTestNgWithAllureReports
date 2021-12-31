package tests;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class FirstTest {
  @Test
  public void f() throws InterruptedException {
//	  WebDriverManager.chromedriver().setup();
//	  WebDriver driver = new ChromeDriver();
	  
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com");
//	  Assert.isTrue(driver.findElement(By.class("nav-logo")), null, null)
	  Thread.sleep(5000);
  }
}
