package popupuse;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		String idofmainpage = driver.getWindowHandle();
		System.out.println("main page id "+idofmainpage);
		Set<String> idofallpage = driver.getWindowHandles();
		//so need to convert into arraylist
		ArrayList<String> ar=new ArrayList<>(idofallpage);
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		String mainpageid=ar.get(0);
		String childpageid=ar.get(1);
		
		//to switch to child page
		driver.switchTo().window(childpageid);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='submit']")).click();
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(mainpageid);
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewTab")).click();
		
		
		
		
		
		
	}

}
