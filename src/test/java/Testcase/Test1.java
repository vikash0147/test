package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageClass.HomePage;

public class Test1 extends BaseTest {

	WebDriver driver;
	HomePage homepage = null;

	/*@BeforeMethod
	public void setUpDriver() {
		driver = getDriver();
	}*/

	@Test
	public void login() {
		try {
			initiateDriver();
			launchUrl();
			driver = getDriver();
			Thread.sleep(10000);
			//			if (isElementPresent(homepage.logo, 80)) {
			//				System.out.println("successfully redirected to url");
			//			} else {
			//				System.out.println("failed to redirected to url");
			//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void bookFilight() {

		homepage = new HomePage(driver);
		try {
			//			Thread.sleep(2000);
			//			waitUntilClickable(homepage.flight, 80);

			homepage.clcikOnFlight();
			homepage.clcikOnOneWay();
			homepage.flyfrom();
			if (isElementPresent(homepage.flyingFromDialog, 20)) {

				homepage.flyfrominputbox("Pune");
				Thread.sleep(5000);
				homepage.selectCityResult("Pune");
				Thread.sleep(5000);
			}
			homepage.flyto();

			if (isElementPresent(homepage.flyingFromDialog, 20)) {

				homepage.flytoinputbox("Delhi");
				Thread.sleep(5000);
				homepage.selectCityResult("Delhi");
				Thread.sleep(5000);
			}
homepage.travelnum();
if (isElementPresent(homepage.flyingFromDialog, 20)) {
	Thread.sleep(2000);
}

homepage.adultadd(3);
homepage.tavellerdone();




		} catch (Exception e) {
			e.printStackTrace();
		}






	}


}







