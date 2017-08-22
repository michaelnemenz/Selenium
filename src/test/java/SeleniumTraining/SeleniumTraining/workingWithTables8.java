package SeleniumTraining.SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingWithTables8 {

	// Create an instance of the chrome driver.
	WebDriver driver = new ChromeDriver();
	
	String url = "https://the-internet.herokuapp.com/";
	
	@Test	
	public void tablesExercise(){
	
		// 8-a
		// Navigate to the HerokuApp website.
		driver.get(url);
		
		// 8-b
		// Click the "Sortable Data Tables" link.
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		
		// 8-c
		// Get the value in the first cell in the first column/row.
		String firstColumnRow = driver.findElement(By.xpath("//*[@id='table1']/thead/tr/th[1]/span")).getText();
				
		// Print out and report the first column first row header value.
		System.out.println("The first column/row header of the first table = " + firstColumnRow + ".");
		
		// 8-d
		// Get all the text of all cells in the first row.
		List<WebElement> firstRow = driver.findElement(By.xpath("//*[@id='table1']/thead/tr")).findElements(By.tagName("th"));
		
		// For loop through the first row  of cells to get and print their text.
		for (int x = 0; firstRow.size() > x; x++) {
			String cellText = firstRow.get(x).getText();
			System.out.println("The cell value of [ "+ (x + 1) +" ] contains the following text: " + cellText + ".");

		}
		
		// 8-e
		// Find the row that contains the cell with text 'jdoe@hotmail.com'.
		// Get the table.
		WebElement tableOne = driver.findElement(By.id("table1"));
		
		// Get all the rows in tableOne.
		List<WebElement> tableOneRows = tableOne.findElements(By.tagName("tr"));
		
		// Declare row counter and flag.
		int rowCount = 1;
		boolean isFound = false;
		
		// Loop through tableOne to find the row number that contains the cell with text 'jdoe@hotmail.com'.
		for (WebElement row : tableOneRows) {
			// Store all the cells in each row.
			List<WebElement> cellData = row.findElements(By.tagName("td"));
			
			// Loop through the cells of the row to find the cell that contains 'jdoe@hotmail.com'.
			for (WebElement cell : cellData) {
				if (cell.getText().equals("jdoe@hotmail.com")) {
					isFound = true;
					System.out.println("Row "+ rowCount +" contains the following text: " + cell.getText() + ".");
						System.out.flush();					
					
					// 8-f
					// Click the 'delete' link for the row that contains the text 'jdoe@hotmail.com'.
					if (isFound) {
						for (WebElement actionCell : cellData) {
							if (actionCell.getText().trim().contains("delete")) {
								// Click the 'delete' link.
								WebElement deleteLink = actionCell.findElement(By.linkText("delete"));
								deleteLink.click();
								
								// Confirm 'delete link' was clicked.
								// Check URL for '#delete' with boolean flag.
								String urlValidate = driver.getCurrentUrl();
								Assert.assertTrue(urlValidate.trim().contains("delete"));
								System.out.println("The 'Delete' link was successfully clicked.");
								
								// End the browser session.
								driver.quit();
							}
							
						}
						
					}
					
				}
				
			}
			
		}
		
	}
	
}