package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class workingWithAssertions9 {
	
	// Create an instance of the chrome driver.
	WebDriver driver = new ChromeDriver();
	
	String url = "https://the-internet.herokuapp.com/";
	
	@Test	
	public void loginPass1() {
		
		// 1-a
		// Navigate to HerokuApp website.
		driver.get(url);
		
		// 1-b
		// Click the 'Form Authentication' link.
		driver.findElement(By.linkText("Form Authentication")).click();
		
		// 1-c
		// Enter a username in the 'Username' textbox.
		driver.findElement(By.name("username")).sendKeys("tomsmith");
		
		// 1-cc
		//Enter a password in the 'Password' textbox.
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		
		// 1-d
		// Click the 'Login' button.
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		
		// 1-e
		// Assert that a success message is displayed.
		Assert.assertTrue(driver.getPageSource().contains("You logged into a secure area!"));
		System.out.println("You logged in successfully");
		
		// Close the browser session.
		driver.quit();
		
	}

	@Test
	public void loginFail2() {
		
		// Create an instance of the chrome driver.
		// WebDriver driver = new ChromeDriver();
		
		// 1-a
		// Navigate to the HerokuApp website.
		driver.get(url);
		
		// 1-b
		// Click the 'Form Authentication' link.
		driver.findElement(By.linkText("Form Authentication")).click();
		
		// 1-c
		// Enter an invalid  username in the 'Username' textbox.
		driver.findElement(By.name("username")).sendKeys("smithtom");
		
		// 1-cc
		// Enter an invalid password in the 'Password' textbox.
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
		
		// 1-d
		// Click the 'Login' button.
		driver.findElement(By.xpath("//*[@id='login']/button/i")).click();
		
		// 1-e
		// Assert that a failure message is displayed.
		Assert.assertTrue(driver.getPageSource().contains("Your username is invalid!"));
		System.out.println("You failed to login");
		
		// Close the browser session.
		//driver.quit();
		
	}
	
}