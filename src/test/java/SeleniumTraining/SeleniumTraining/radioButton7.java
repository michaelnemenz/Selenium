package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class radioButton7 {
	
	// Create an instance of the chrome browser.
	WebDriver driver = new ChromeDriver();
		
	@Test	
	public void clickRadioButton(){
		
		// Navigate to the w3schools website.
		driver.get("http://www.w3schools.com/html/html_forms.asp");
		
		//Scroll to view the radio button section.
		Actions action = new Actions(driver);
		action.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).perform();
	
		// Create the radio button object (for choice 'Other').
		WebElement radButton = driver.findElement(By.xpath("//*[@id='main']/input[5]"));
		
		// Click the 'Other' radio button.
		radButton.click();
		System.out.println("The 'Other' radio button was selected.");
		
		// End the browser session.
		driver.quit();
		
	}
	
}