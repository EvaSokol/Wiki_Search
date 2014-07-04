import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

public class start {

	static String BaseUrl = "https://www.google.com.ua/";
	static WebDriver driver = new FirefoxDriver();
	
	
	static void open() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(BaseUrl);
	}
	
	void open(String url) {
		driver.get(url);
	}
	
	static void find(String word) {
		driver.findElement(By.xpath(".//*[@id='gs_tti0']")).sendKeys(word);
		driver.findElement(By.xpath(".//*[@id='gbqfb']")).click();
	}
}
