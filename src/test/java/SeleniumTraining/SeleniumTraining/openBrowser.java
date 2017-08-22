package SeleniumTraining.SeleniumTraining;

//System.setProperty("webdriver.chrome.driver", "C:\Users\michael.nemenz\Desktop\Driver\");
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openBrowser {
	
	// Create an instance of the chrome driver.
	WebDriver driver = new ChromeDriver();
	
	String url = "https://the-internet.herokuapp.com/";
	
	@Test
	public void browserOpen() {
		
		// Navigate to the HerokuApp website.
		driver.get(url);
		
	}

}