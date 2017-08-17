package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertExercise {
	
	@Test	
	public void loginPass() {
		// Create an instance of the chrome driver.
		WebDriver driver = new ChromeDriver();
		
		// Navigate to HerokuApp website.
		driver.get("https://the-internet.herokuapp.com/");
		
		// Click the 'Form Authentication' link.
		driver.findElement(By.linkText("Form Authentication")).click();
		
		// Enter a username in the 'Username' textbox.
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		
		//Enter a password in the 'Password' textbox.
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		// Click the 'Login' button.
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		
		// Assert that a success message is displayed.
		Assert.assertTrue(driver.getPageSource().contains("You logged into a secure area!"));
		
		// Close the browser session.
		driver.quit();
	}

	@Test
	public void loginFail() {
		// Create an instance of the chrome driver.
		WebDriver driver = new ChromeDriver();		
		
		// Navigate to the HerokuApp website.
		driver.get("https://the-internet.herokuapp.com/");
		
		// Click the 'Form Authentication' link.
		driver.findElement(By.linkText("Form Authentication")).click();
		
		// Enter an invalid  username in the 'Username' textbox.
		driver.findElement(By.name("username")).sendKeys("smithtom");
		
		// Enter an invalid password in the 'Password' textbox.
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
		
		// Click the 'Login' button.
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		
		// Assert that a failure message is displayed.
		Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"));
		
		// Close the browser session.
		driver.quit();
	}
}