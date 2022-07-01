package sampleprogram;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Crossbrowsing {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:\\velocity\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");

	}

}
