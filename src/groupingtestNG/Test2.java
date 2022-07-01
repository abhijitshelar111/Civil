package groupingtestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void p() 
  {
	  
	  Reporter.log("method p is running", true);
  }
  @Test
  public void q() 
  {
	  Reporter.log("method q is running",true);
  }
  @Test(groups = "sanity")
  public void s() 
  {
	  Reporter.log("method s sanity is running",true);
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
