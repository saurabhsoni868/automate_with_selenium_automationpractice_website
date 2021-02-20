package tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import pages.LoginWebsitePage;

public class LoginWebsiteTest extends BaseTest {

	public final static Logger logger = Logger.getLogger(LoginWebsiteTest.class);

	@Test(priority = 1)
	public void validLogin() throws InterruptedException {
		LoginWebsitePage loginPage = new LoginWebsitePage(driver);
		loginPage.clickSignin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage.enterEmail(prop.getProperty("email"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickSigninn();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
		logger.info("Login Successfull");
	}

	@Test(priority = 2)
	public void invalidLogin() throws InterruptedException {
		LoginWebsitePage loginPage = new LoginWebsitePage(driver);
		loginPage.clickSignin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage.enterEmail(prop.getProperty("email"));
		loginPage.enterPassword(prop.getProperty("wrongPassword"));
		loginPage.clickSigninn();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("Login"));
		logger.info("please check your user-id or password");
	}
}