package Practise.AppiumFramework;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC04 extends Capability{

	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String appactivity = null;
		String apppackage = null;
		//String appactivity = null;
		//	String apppackage = null;
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Hybridcapability(appactivity,apppackage);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    /* driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
	     driver.hideKeyboard();
	     driver.findElement(By.xpath("//*[@text='Female']")).click();
	     driver.findElement(By.id("android:id/text1")).click();   

	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

	     driver.findElement(By.xpath("//*[@text='Argentina']")).click();

	     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	     
	     
	     //THis isnew Test Case
	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

	     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

	    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

	Thread.sleep(4000);
	String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
	
	amount1 = amount1.substring(1);
	double amount1value = Double.parseDouble(amount1);
	
	
	String amount2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
	amount2 = amount2.substring(1);
	double amount2value = Double.parseDouble(amount2);
	
	
	double totalsumofproducts = amount1value+amount2value;
	System.out.println(totalsumofproducts);
	String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	total = total.substring(1);
	double totalvalue = Double.parseDouble(total);
	System.out.println(totalvalue);
	
	
	Assert.assertEquals(totalsumofproducts, totalvalue); */
	
		}

}
