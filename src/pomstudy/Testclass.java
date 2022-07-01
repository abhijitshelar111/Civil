package pomstudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Kiteloginpage login=new Kiteloginpage(driver);
		login.sendUserName();
		login.SendPassword();
		login.Clickonloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Kitepinpage pin=new Kitepinpage(driver);
		pin.sendPin();
		pin.clickoncontinuebutton();
		Kitehomepage home=new Kitehomepage(driver);
		home.validateuserid();
		home.clickonlogout();
		
		

	}

}
