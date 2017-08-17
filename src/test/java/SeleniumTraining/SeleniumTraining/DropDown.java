package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");   // Open browser and go to HerokuApp.
		driver.findElement(By.linkText("Dropdown")).click();  // Click the 'Dropdown' link on the page.
		driver.findElement(By.id("dropdown")).click();   // Click the dropdown element on the 'Dropdown' page.
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		dropdown.selectByVisibleText("Option 1");   //Select "Option 1" from the dropdown list.
		driver.quit();
	}

}