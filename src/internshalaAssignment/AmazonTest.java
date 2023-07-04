package internshalaAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\sarvesh\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");

		// Set Chrome options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*"); // Run Chrome in headless mode (without UI)

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

		// Go to Amazon.in
		driver.get("https://www.amazon.in");

		// Create page objects
		HomePage homePage = new HomePage(driver);
		SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

		// Perform search
		homePage.searchFor("Wrist Watches");
		homePage.clickSearchButton();

		// Wait for the search results to load
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		searchResultsPage.clickBrand();
		Thread.sleep(3000);
		searchResultsPage.clickDiscount();
		Thread.sleep(3000);
		searchResultsPage.clickDisplay();
		Thread.sleep(3000);
		searchResultsPage.clickbrandMaterial();
		Thread.sleep(3000);

		// Get the fifth element from the search results
		String fifthElementText = searchResultsPage.getFifthElementText();
		System.out.println("Fifth Element: " + fifthElementText);

		// Close the browser
		driver.quit();
	}
}
