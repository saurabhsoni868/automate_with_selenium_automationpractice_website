package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterToWebsitePage;

public class RegisterToWebsiteTest extends BaseTest {

	@Test
	public void registration() throws InterruptedException {
		RegisterToWebsitePage obj = new RegisterToWebsitePage(driver);

		obj.clickSignin();
		obj.enterEmail(prop.getProperty("Register_email"));
		obj.clickCreateAccount();
		obj.selectGender();
		obj.enterFirstName(prop.getProperty("Reg_First_name"));
		obj.enterLastName(prop.getProperty("Reg_last_name"));
		obj.enterPassword(prop.getProperty("Reg_pass"));
		obj.selectDay(prop.getProperty("Reg_day"));
		obj.selectMonth(prop.getProperty("Reg_month"));
		obj.selectYear(prop.getProperty("Reg_year"));
		obj.clickNewsLetterCheckBox();
		obj.neglectOfferCheckbox();
		obj.enterCompanyName(prop.getProperty("Reg_company"));
		obj.enterAddressLine1(prop.getProperty("Reg_ADD1"));
		obj.enterAddressLine2(prop.getProperty("Reg_ADD2"));
		obj.enterCityName(prop.getProperty("Reg_city"));
		obj.selectState();
		obj.enterPostalCode(prop.getProperty("Reg_postal"));
		obj.selectCountry(prop.getProperty("Reg_country"));
		obj.mentionAdditionalInformation(prop.getProperty("Reg_add_info"));
		obj.enterHomeNo(prop.getProperty("Reg_home_mob"));
		obj.enterMobileNo(prop.getProperty("Reg_mob"));
		obj.clickRegister();
		Assert.assertTrue(driver.getTitle().contains("My account"));
		logger.info("Register success");

	}

}
