package SeleniumTraining.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();		
		driver.findElement(By.id("dropdown")).click();
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));   
		dropdown.selectByVisibleText("Option 1");
	}

}
