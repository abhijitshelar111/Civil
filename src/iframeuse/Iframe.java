package iframeuse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\velocity\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		WebElement text1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(text1.getText());
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(frame);
        WebElement text2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(text2.getText());
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        WebElement frame2 = driver.findElement(By.xpath("(//span[@class='text'])[14]"));
        System.out.println(frame2.getText());
	}

}
