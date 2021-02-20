package tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
import pages.ItemSelect;
import pages.RegisterToWebsitePage;

public class ItemSelectTest extends BaseTest {

	public final static Logger logger = Logger.getLogger(ItemSelectTest.class);

	@Test
	public void selectItemTrue() throws InterruptedException {
		ItemSelect obj = new ItemSelect(driver);
		obj.selectItem();
		obj.search();
		String ActualTitle = obj.name.getText().trim();
		String ExpectedTitle = "Faded Short Sleeve T-shirts";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		logger.info("T-shirt name matched");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void selectItemFalse() throws InterruptedException {
		ItemSelect obj = new ItemSelect(driver);
		obj.selectItem();
		obj.search();
		String ActualTitle = obj.name.getText().trim();
		String ExpectedTitle = "Faded Short Sleeve "; // T-shirts
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		logger.info("T-shirt name miss-matched");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
