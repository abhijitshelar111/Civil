package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Firefoxgeckodriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\velocity\\chromedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");

	}

}
