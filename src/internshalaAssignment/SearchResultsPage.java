package internshalaAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {

	private WebDriver driver;
	private By brand = By.xpath("//*[@id=\"p_89/Titan\"]/span/a/span");
	private By display = By.xpath("//*[@id=\"p_n_feature_seven_browse-bin/1480900031\"]/span/a/span");
	private By brandMaterial = By.xpath("//*[@id=\"p_n_material_browse/1480907031\"]/span/a/span");
	private By discount = By
			.xpath("//li[@id='p_n_pct-off-with-tax/2665400031']/span/a/span[contains(text(),'25% Off or more')]");
	private By fifthElement = By.linkText("Analog Women's Watch");

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickDisplay() {
		WebElement displayElement = driver.findElement(display);
		displayElement.click();
	}

	public void clickbrandMaterial() {
		WebElement brandMaterialElement = driver.findElement(brandMaterial);
		brandMaterialElement.click();
	}

	public void clickBrand() {
		WebElement brandElement = driver.findElement(brand);
		brandElement.click();
	}

	public void clickDiscount() {
		WebElement discountElement = driver.findElement(discount);
		discountElement.click();
	}

	public String getFifthElementText() {
		WebElement fifthElementElement = driver.findElement(fifthElement);
		return fifthElementElement.getText();

	}

}
