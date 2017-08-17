package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radioButton {
	@Test
	
	public void clickRadioButton(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/html/html_forms.asp");   // goes to the w3schools.com 
		WebElement radButton = driver.findElement(By.xpath("//*[@id='main']/input[5]"));
		radButton.click();
		driver.quit();
	}
	
}
