import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();	
	}
	
	@Test
	public void dologin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("way2automation@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/span/span")).click();
	
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}


