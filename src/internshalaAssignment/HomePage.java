package internshalaAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	private By searchBox = By.id("twotabsearchtextbox");
	private By searchButton = By.id("nav-search-submit-button");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchFor(String query) {
		WebElement searchBoxElement = driver.findElement(searchBox);
		searchBoxElement.sendKeys(query);
	}

	public void clickSearchButton() {
		WebElement searchButtonElement = driver.findElement(searchButton);
		searchButtonElement.click();
	}
}
