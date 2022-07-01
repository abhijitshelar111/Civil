package screenshot;

import java.io.File;


import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Singlescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);

		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File destination=new File("E:\\velocity\\screenshot\\scr.png");
	    FileHandler.copy(source, destination);
	    
	    String random=RandomString.make(4);
	    File destination1=new File("E:\\velocity\\screenshot\\scr"+random+".jpg");
	    FileHandler.copy(source, destination1);
	}

}
