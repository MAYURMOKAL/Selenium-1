package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("C:/Users/mayur/Desktop/SeleniumFile/Dropdowns.html");
		WebElement city = driver.findElement(By.id("city"));
		Select select = new Select(city);
		
		Thread.sleep(1000);
		select.selectByIndex(1);
			Thread.sleep(1000);
			select.selectByIndex(2);;
		Thread.sleep(1000);
		select.deselectByIndex(2);
			Thread.sleep(1000);
			select.deselectByIndex(1);
}
}