package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(1000);
		//to set size--> use dimension class and create object of dimension class
		Dimension d=new Dimension(950, 350);
		driver.manage().window().setSize(d);
		

	}

}
