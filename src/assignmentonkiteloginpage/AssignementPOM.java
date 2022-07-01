package assignmentonkiteloginpage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignementPOM 
{
//1. define data Members/ variables
@FindBy(id = "userid") private WebElement Id;
@FindBy(xpath = "//span[text()='User ID should be minimum 6 characters.']") private WebElement ErrorMsg1;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath = "//span[text()='Password should be minimum 6 characters.']") private WebElement ErrorMsg2;
	@FindBy(xpath="//button[text()='Login ']") private WebElement loginButton;
	@FindBy(xpath = "//p[@class='error text-center']") private WebElement ErrorMsg3;
	@FindBy(id = "pin")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueb;
	//2. create constructor for initialize Data members Or Variables
public AssignementPOM(WebDriver driver)

{
	PageFactory.initElements(driver, this);
}

//3. Define Methods 
public void Senduserid(String username)
{
	Id.sendKeys(username);
}

public void SendPassword(String pwd)
{
	password.sendKeys(pwd);
}
public void ClicktoLogin()
{
 loginButton.click();
}
 public String getActualErrorMsg1()
 {
	 String actualErrorMsg1 = ErrorMsg1.getText();
	return actualErrorMsg1;
	  
 }
 public String getActualErrorMsg2()
 {
	 String actualErrorMsg2 = ErrorMsg2.getText();
	return actualErrorMsg2;
	  
 }
 public String getActualErrorMsg3()
 {
	 String actualErrorMsg3 = ErrorMsg3.getText();
	return actualErrorMsg3;
	  
 }
 public void ClearSceen() throws InterruptedException
 {
	 Id.clear();
	 Thread.sleep(2000);
	 password.clear();
	 
 }
 public void Pin(String PIN)
 {
	 pin.sendKeys(PIN);
	 continueb.click();
	 
 }
}
