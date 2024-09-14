package TestCases;



import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass;
import Com.Crm.Pom.HomePage;
public class TestCaseNo1 extends BaseClass
{
	@Test
	public void testCase1() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.giftImage();
		hp.recipientDetails();
		hp.giftCardQuantity();
		hp.addGiftsToCart();
		hp.openCart();
		WebElement verification = hp.getverification();
		assertTrue(verification.isDisplayed());
		hp.removeProductsFromCart();
		hp.logOutLink();
	}
}
