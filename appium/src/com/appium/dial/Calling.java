package com.appium.dial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Calling {
	AndroidDriver driver;
  @Test
  public void callIng() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName","Micromax Q380");
	  capabilities.setCapability("platformVersion","5.0.0");
	  capabilities.setCapability("platformName","Android");
	  capabilities.setCapability("appPackage","com.android.vending");
	  capabilities.setCapability("appActivity","com.google.android.finsky.activities.MainActivity");
	  
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	  
  }
}
