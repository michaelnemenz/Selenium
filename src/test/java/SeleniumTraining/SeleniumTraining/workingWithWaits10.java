package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class workingWithWaits10 {
	
	// Create an instance of the chrome browser.
	WebDriver driver = new ChromeDriver();
	
	// Store the herokuApp site object.
	String url = ("https://the-internet.herokuapp.com/");
	
	// Create the wait method. 
	WebDriverWait wait = new WebDriverWait(driver, 15);

	@Test
	public void waitHelloWorldVisible1() {
		
		// 1-a
		// Navigate to "https://the-internet.herokuapp.com/".
		driver.get(url);
		
		// 1-b
		// Click the link for the 'Dynamic Loading' page.
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		// 1-c
		// Click the link for 'example 1'.
		driver.findElement(By.xpath("//*[@id='content']/div/a[1]")).click();
		
		// 1-d
		// Click the 'Start' button.
		driver.findElement(By.cssSelector("#start > button")).click();
		
		// 1-e
		// Use the expected conditions class to wait for the 'Hello World' element to be visible.
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("finish"), "Hello World!"));
		System.out.println("'Hello World!' was visible.");

		// Quit the browser session.
		//driver.quit();
	}	
	
	@Test
	public void waitLoadingBarInvisible2() {
		
		// Create new instance of the browser.
		//WebDriver driver = new ChromeDriver();
		
		//2-a		
		// Navigate to "https://the-internet.herokuapp.com/".
		driver.get(url);
		
		// 2-b
		// Click the link for the 'Dynamic Loading' page.
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		// 2-c
		// Click the link for 'example 1'.
		driver.findElement(By.xpath("//*[@id='content']/div/a[1]")).click();
		
		// 2-d
		// Click the 'Start' button.
		driver.findElement(By.cssSelector("#start > button")).click();
		
		//2-e
		// Use the expected conditions class to wait for the loading bar to disappear.		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='loading']/img")));
		System.out.println("The 'Loading Bar' has vanished.");
		//*[@id='loading']/text()
		
		// Quit the browser session.
		driver.quit();
	}

	@Test
	public void waitHelloWorldPresent3() {
		
		
		// 3-a
		// Navigate to "https://the-internet/herokuapp.com/".
		driver.get(url);
		
		// 3-b
		// Click the link for the 'Dynamic Loading' page.
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(12) > a")).click();
		
		// 3-c
		// Click the link for 'example 2'.
		driver.findElement(By.xpath("//*[@id='content']/div/a[2]")).click();
		
		// 3-d
		// Click the 'Start' button.
		driver.findElement(By.cssSelector("#start > button")).click();
		
		// 3-e
		// Use the expected conditions class to wait for the 'Hello World!' element to be present.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));		
		System.out.println("'Hello World!' was present.");
			System.out.flush();
		
		// Quit the browser instance.
		//driver.quit();
		
	}	

}