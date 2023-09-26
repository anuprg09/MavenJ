package MavenDemoGitJ.MavenDemoGitJenkins;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void checkTest() {
	  driver.findElement(By.name("q")).sendKeys("This is Demo");
	  assertEquals("you", "You");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().fullscreen();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
