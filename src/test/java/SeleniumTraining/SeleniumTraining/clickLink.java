package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class clickLink {
	
	@Test	
	public static void main(String[] args) {
		
		// Create an instance of the chrome driver.
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the HerokuApp website.
		driver.get("https://the-internet.herokuapp.com/");
		
		// Click the 'A/B Testing' link.
		driver.findElement(By.linkText("A/B Testing")).click();
		
		// End the browser session.
		driver.quit();
		
	}

}