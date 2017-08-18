package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectElements6 {
	
	@Test	
	public void selectDropDown() {
		
		// Create an instance of the chrome driver.
		WebDriver driver = new ChromeDriver();
		
		// 1-a
		// Navigate to the HerokuApp website.
		driver.get("https://the-internet.herokuapp.com/"); 
		
		// 1-b
		// Click the link for the 'Dropdown'page.
		driver.findElement(By.linkText("Dropdown")).click();
		
		// create the dropdown element.
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		
		// 1-c
		// Select an option using 'selectByIndex'.
		dropdown.selectByIndex(2);
		System.out.println("Option 2 selected.");

		// 1-d
		// Select "Option 1" using 'selectByValue'.
		dropdown.selectByValue("1");
		System.out.println("Option 1 was selected.");
		
		// 1-e
		//Select "Option 2" using 'selectByVisibleText'.
		dropdown.selectByVisibleText("Option 2");
		System.out.println("Option 2 was selected.");
		
		// Close the browser session.
		driver.quit();
	
	}

}