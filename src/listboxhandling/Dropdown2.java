package listboxhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement dropdownbox = driver.findElement(By.id("cars"));
		Select s=new Select(dropdownbox);
		boolean result = s.isMultiple();
		System.out.println("ismultiple result is "+result);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("audi");
		Thread.sleep(1000);
		s.selectByVisibleText("Saab");
		Thread.sleep(1000);
		s.selectByIndex(2);
		Thread.sleep(1000);
		//s.deselectAll();
		//s.deselectByIndex(0);
		
		System.out.println(s.getFirstSelectedOption().getText());
		WebElement firstwebelement = s.getFirstSelectedOption();
		String mytext= firstwebelement.getText();
		System.out.println("1st selected option is "+mytext);
		
		System.out.println(s.getAllSelectedOptions().size());
		
		for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
		{
			String all=s.getAllSelectedOptions().get(i).getText();
			System.out.println("option is "+i+" "+all);
			
			//System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		
		
		
		
		

	}

}
