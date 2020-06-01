package Testcase;

import java.util.Set;

import org.testng.annotations.Test;

import BaseTest.BaseTest;
import BaseTest.BaseTest;
import PageClass.HomePage;

public class Test2 extends BaseTest  {
	
	
	@Test
	public void  testing1() {
		HomePage hp = new HomePage(driver);
		
		initiateDriver();
		launchUrl();
		getDriver();
		
		//isElementPresent(hp.emailLogin, 30);
		 hp.entermail();
	}

	
	}
	

