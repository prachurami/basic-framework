package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Data.DataFile;
import pages.LoginPage;

public class LoginTest {
	
	LoginPage lp = new LoginPage();
	DataFile df = new DataFile();
	
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  lp.openBrowser();
	  lp.openLoginPage();
	  
  }
  @AfterMethod
  public void afterMethod() {
     lp.closeBrowser(); 
  }
  @Test(priority=1)
  public void loginWithSpecialCharEmailTest() throws InterruptedException {
	    lp.login(df.emailwithSpecialChar,df.WrongPassword);
		Assert.assertEquals(df.specialCharEmailErr, lp.readEmailErr());
  }
  @Test(priority=2)
  public void loginWithEmptyEmailTest() throws InterruptedException {
	 lp.login("",df.WrongPassword);
		Assert.assertEquals(df.emptyEmailErr, lp.readEmailErr());
}
  @Test(priority=3)
  public void loginWithEmptypasswordTest() throws InterruptedException {
	  lp.login(df.WrongEmail,"");
		Assert.assertEquals(df.emptyEmailErr, lp.passWordErr());
}
  @Test(priority=4)
  public void loginWithWrongpasswordTest() throws InterruptedException {
	 lp.login(df.WrongEmail,df.WrongPassword); 
		Assert.assertEquals(df.globalErr, lp.readGlobalErr());
}
  
}
