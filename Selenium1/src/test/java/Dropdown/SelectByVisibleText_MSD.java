package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText_MSD {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("C:\\Users\\mayur\\Desktop\\Dropdown.html");
		 WebElement city = driver.findElement(By.id("city"));
		 Select select = new Select(city);
		 
		 Thread.sleep(2000);
		 select.selectByVisibleText("NewYork");
		 	Thread.sleep(2000);
		 	select.selectByVisibleText("Tokyo");
		 Thread.sleep(2000);
		 select.selectByVisibleText("Mumbai");
	}
}
