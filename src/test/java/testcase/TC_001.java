package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

@Test(dataProvider="testdata")
public class TC_001 extends BaseTest {
	
	public static void Login(String username, String password) {
		driver.findElement(By.xpath(loc.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("login"))).click();
	}

	@DataProvider(name="testdata")
	public Object [][] testData (){
		return new Object[][] {
			{"Admin","admin123"},
			{"jdminf","jdmin123e"},
		};
	}

}