package SeleniumTraining.SeleniumTraining;

//System.setProperty("webdriver.chrome.driver", "C:\Users\michael.nemenz\Desktop\Driver\");
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openBrowser {
	
	@Test
	public static void main(String[] args) {
		
		//Create an instance of the chrome browser.
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the HerokuApp website.
		driver.get("https://the-internet.herokuapp.com/");	
		
	}

}