package Practise.AppiumFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {

	public static  AndroidDriver<AndroidElement> Hybridcapability(String appactivity,String apppackage) throws IOException {
		FileInputStream fis = new FileInputStream("E://MOBILE//AppiumFramework//src//main//java//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		DesiredCapabilities ca = new DesiredCapabilities();
		ca.setCapability(MobileCapabilityType.DEVICE_NAME, "sunil android");
		ca.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		appactivity = (String) prop.get("apppackage");
		apppackage = (String) prop.get("appactivity");
		ca.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, apppackage);
		ca.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appactivity);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),ca);
		return driver;
	}

}
