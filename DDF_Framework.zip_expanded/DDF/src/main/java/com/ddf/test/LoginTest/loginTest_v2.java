package com.ddf.test.LoginTest;

import org.testng.annotations.Test;

import com.ddf.base.BaseUI_v1;
import com.ddf.base.BaseUI_v2;

public class loginTest_v2 extends BaseUI_v2 {

	@Test
	public void testOne() throws InterruptedException {
		invokeBrowser("chrome");
		maximizeBrowser();
		openURL("websiteURL");
		elementClick("signinBtn_Xpath");
		enterText("usernameTextbox_Xpath", "U S E R N A M E");
		Thread.sleep(2000);
		elementClick("createAccount_Xpath");
		enterText("fullnameTextbox", "Rashmi Pathak");
		tearDown();
	}

	// @Test(dependsOnMethods="testOne")
	public void testTwo() {
		invokeBrowser("chrome");
		// openURL("https://money.rediff.com/index.html");
		// test code to show next function usage - above code not changed to use
		// properties file
		tearDown();
	}

	// @Test(dependsOnMethods="testTwo")

	public void testThree() {
		invokeBrowser("chrome");
		// openURL("https://shopping.rediff.com/");
		// test code to show next function usage - above code not changed to use
		// properties file
		tearDown();
	}
}
