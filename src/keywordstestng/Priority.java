package keywordstestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = -3)
  public void p() 
  {
	  Reporter.log("method p is running",true);
  }
  @Test(priority = -4)
  public void q() 
  {
	  Reporter.log("method q is running",true);
  }
  @Test
  public void s() 
  {
	  Reporter.log("method s is running",true);
  }
  @Test(priority = 2)
  public void r() 
  {
	  Reporter.log("method r is running",true);
  }
  @Test(priority = -4)
  public void t() 
  {
	  Reporter.log("method t is running",true);
  }
}
