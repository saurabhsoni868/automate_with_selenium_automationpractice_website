package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import com.google.j2objc.annotations.Property;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ItemSelect {

	public final static Logger logger = Logger.getLogger(ItemSelect.class);

	WebDriver driver;

	public ItemSelect(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Women']")
	public WebElement women;

	@FindBy(how = How.XPATH, using = "//a[@title='T-shirts']")
	public WebElement tshirt;

	@FindBy(how = How.LINK_TEXT, using = "Faded Short Sleeve T-shirts")
	public WebElement name;

	@FindBy(how = How.ID_OR_NAME, using = "search_query")
	public WebElement search;

	@FindBy(how = How.ID_OR_NAME, using = "submit_search")
	public WebElement searchbtn;

	public void selectItem() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(women).moveToElement(tshirt).click().build().perform();
		logger.info("mouse is moved to T-shirt after hovering over women ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void search() throws InterruptedException {

		search.sendKeys(name.getText());
		logger.info("T-shirt name is enterd in to the search-BOX  ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		searchbtn.click();
		logger.info("Search button got clicked  ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
