package pages;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterToWebsitePage {

	public final static Logger logger = Logger.getLogger(RegisterToWebsitePage.class);

	WebDriver driver;

	public RegisterToWebsitePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='login']")
	public WebElement signin;

	@FindBy(how = How.ID, using = "email_create")
	public WebElement email;

	@FindBy(how = How.CSS, using = "#SubmitCreate > span > i")
	public WebElement create_account;

	@FindBy(how = How.XPATH, using = "//label[@for ='id_gender1']")
	public WebElement gender;

	@FindBy(how = How.ID, using = "customer_firstname")
	public WebElement first_name;

	@FindBy(how = How.ID, using = "customer_lastname")
	public WebElement last_name;

	@FindBy(how = How.ID, using = "passwd")
	public WebElement password;

	@FindBy(how = How.ID, using = "days")
	public WebElement day;

	@FindBy(how = How.ID, using = "months")
	public WebElement month;

	@FindBy(how = How.ID, using = "years")
	public WebElement year;

	@FindBy(how = How.ID, using = "newsletter")
	public WebElement newslettercheckbox;

	@FindBy(how = How.ID, using = "optin")
	public WebElement offercheckbox;

	@FindBy(how = How.ID, using = "company")
	public WebElement company_name;

	@FindBy(how = How.ID, using = "address1")
	public WebElement address_line1;

	@FindBy(how = How.ID, using = "address2")
	public WebElement address_line2;

	@FindBy(how = How.ID, using = "city")
	public WebElement city_name;

	@FindBy(how = How.ID, using = "id_state")
	public WebElement state_name;

	@FindBy(how = How.ID, using = "postcode")
	public WebElement postal_code;

	@FindBy(how = How.ID, using = "id_country")
	public WebElement country_name;

	@FindBy(how = How.ID, using = "other")
	public WebElement additional_information;

	@FindBy(how = How.ID, using = "phone")
	public WebElement home_phone;

	@FindBy(how = How.ID, using = "phone_mobile")
	public WebElement mobile_phone;

	@FindBy(how = How.XPATH, using = "//span[text()='Register']")
	public WebElement register;

	public void clickSignin() {
		signin.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		logger.info("Sign-in button got clicked  ");
	}

	public void enterEmail(String mail) {
		email.sendKeys(mail);
		logger.info("email is entered ");
	}

	public void clickCreateAccount() {
		create_account.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		logger.info("create account button is clicked ");
	}

	public void selectGender() throws InterruptedException {
		gender.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("gender is selected ");
	}

	public void enterFirstName(String name) throws InterruptedException {
		first_name.sendKeys(name);
		logger.info("first name is entered  ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterLastName(String l_name) throws InterruptedException {
		last_name.sendKeys(l_name);
		logger.info("last name is entered ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterPassword(String pass) throws InterruptedException {
		password.sendKeys(pass);
		logger.info("password is entered  ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectDay(String Dob_day) throws InterruptedException {
		Select dropdown = new Select(day);
		dropdown.selectByValue(Dob_day);
		logger.info("date of DOB ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectMonth(String Dob_month) throws InterruptedException {
		Select option = new Select(month);
		option.selectByValue(Dob_month);
		logger.info("month of DOB ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectYear(String Dob_year) throws InterruptedException {
		Select option = new Select(year);
		option.selectByValue(Dob_year);
		logger.info("year of DOB ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clickNewsLetterCheckBox() throws InterruptedException {
		newslettercheckbox.click();
		logger.info("box got clicked  ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void neglectOfferCheckbox() throws InterruptedException {
		offercheckbox.click();
		offercheckbox.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterCompanyName(String c_name) throws InterruptedException {
		company_name.sendKeys(c_name);
		logger.info("company name is entered ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterAddressLine1(String add1) throws InterruptedException {
		address_line1.sendKeys(add1);
		logger.info("addreshline -1 entered  ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterAddressLine2(String add2) throws InterruptedException {
		address_line2.sendKeys(add2);
		logger.info("addreshline -2 entered  ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterCityName(String c_name) throws InterruptedException {
		city_name.sendKeys(c_name);
		logger.info("address  city ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectState() throws InterruptedException {
		Select option = new Select(state_name);
		option.selectByVisibleText("Indiana");
		logger.info("address country ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterPostalCode(String p_code) throws InterruptedException {
		postal_code.sendKeys(p_code);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectCountry(String country) throws InterruptedException {
		Select option = new Select(country_name);
		option.selectByValue(country);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void mentionAdditionalInformation(String info) throws InterruptedException {
		additional_information.sendKeys(info);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterHomeNo(String h_no) throws InterruptedException {
		home_phone.sendKeys(h_no);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void enterMobileNo(String m_no) throws InterruptedException {
		mobile_phone.sendKeys(m_no);
		logger.info("mobile number entered  ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void clickRegister() throws InterruptedException {
		register.click();
		logger.info("registered button got clicked ");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
