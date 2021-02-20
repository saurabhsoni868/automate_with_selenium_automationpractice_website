package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginWebsitePage {

	WebDriver driver;

	public final static Logger logger = Logger.getLogger(LoginWebsitePage.class);

	public LoginWebsitePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='login']")
	public WebElement signin;
	@FindBy(how = How.ID_OR_NAME, using = "email")
	public WebElement Email;
	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public WebElement password;
	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	public WebElement box;

	public void clickSignin() {
		signin.click();
		logger.info("clicked on login button");
	}

	public void enterEmail(String name) {
		Email.sendKeys(name);
		logger.info("email is entered");
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
		logger.info("password value is entered");
	}

	public void clickSigninn() {
		box.click();
		logger.info("sign-in button get clicked");
	}

}