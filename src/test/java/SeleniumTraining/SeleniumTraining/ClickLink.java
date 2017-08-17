package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickLink {
	@Test
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");   // Open browser and launch HerokuApp.
		driver.findElement(By.linkText("A/B Testing")).click();   // Click the 'A/B Testing' link.
	}

}