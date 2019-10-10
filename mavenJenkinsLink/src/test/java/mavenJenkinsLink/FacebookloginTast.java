package mavenJenkinsLink;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookloginTast {

	WebDriver driver;
	@Test
	public void LoginPageTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		driver= new FirefoxDriver();
		driver.get("http://facebook.com/");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gyandangol@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("gyan2039713");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
	}
}