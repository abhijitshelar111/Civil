package scrolling;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//  driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(1000);
		//to set position --> use point class and create object of point class
		Point p= new Point(200, -50);
		driver.manage().window().setPosition(p); // with the help of point class object we set the position of  window

	}

}
