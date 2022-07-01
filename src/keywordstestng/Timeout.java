package keywordstestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout {
  @Test(timeOut = 1000)
  public void p() throws InterruptedException 
  {
	  Thread.sleep(100);
	  Reporter.log("method p is running", true);
  }
  @Test
  public void q() 
  {
	  Reporter.log("method q is running",true);
  }
  @Test
  public void s() 
  {
	  Reporter.log("method s is running",true);
  }
  @Test
  public void r() 
  {
	  Reporter.log("method r is running",true);
  }
  @Test
  public void t() 
  {
	  Reporter.log("method t is running",true);
  }
}
