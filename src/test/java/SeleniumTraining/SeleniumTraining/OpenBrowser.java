package SeleniumTraining.SeleniumTraining;

//System.setProperty("webdriver.chrome.driver", "C:\Users\michael.nemenz\Desktop\Driver\");
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	@Test

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://the-internet.herokuapp.com/");	// Open browser and launch HerokuApp.	
	}

}
