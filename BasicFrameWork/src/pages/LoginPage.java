package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;//driver is null at this satge

/*WebElement email =  driver.findElement(By.id("usernameInput-input"));
WebElement password =  driver.findElement(By.name("password"));
WebElement signIn =   driver.findElement(By.id("signIn"));
WebElement emailErr =  driver.findElement(By.id("UsernameTextField__errors-usernameInput"));
WebElement passWordErr =  driver.findElement(By.id("PasswordTextField__errors-password"));
WebElement globalError=  driver.findElement(By.id("globalError"));*/

// page factory
@FindBy(id ="usernameInput-input")
public WebElement email;

@FindBy(id ="password-input")
public WebElement  password;

@FindBy(id ="signIn")
public WebElement signIn;

@FindBy(id ="globalError")
public WebElement globalError;

@FindBy(id ="Please enter your username or card number.")
public WebElement emailErr;

@FindBy(id ="Please enter your password.")
public WebElement passWordErr;


public void openBrowser() throws IOException {
	FileInputStream fi = new FileInputStream("C:\\QA\\Testing\\prop.properties");
	Properties prop = new Properties();
	 prop.load(fi);
	 
	 String browser =prop.getProperty("browser"); 
	 
	 if(browser.equals("Firefox")) {
		 driver = new FirefoxDriver();
	}else if(browser.equals("Chrome")) {
		driver = new ChromeDriver();			
	}else {
		 driver = new SafariDriver();
	}
	 PageFactory.initElements(driver, this);
}		 
public void openLoginBrowser() throws IOException {
	driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=PwwN2fArs4g&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJQd3dOMmZBcnM0ZyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjk2Mzg3NjUxLCJpYXQiOjE2OTYzODY0NTEsImp0aSI6ImZlYTliMTM2LTA4ZjYtNGVmMy04OTY5LTFkZGE4ZGE2MWI1ZSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.VIdkyVPnhFI-Qas2lQtzTMZnEGNkwMp2M9YJfMbtHi9S-GHSt1WDVby4KoOqq4Zrqjj80sa8Cvo-GxZg9qD4PEFA7dg092K6H5HY5iM1Uu87Fm94SrjoNKjxNmf_P561z9p465wDLjzfSPdYYCnQ06FQhEwYY18T4k55SCRRqjGPCWtrA-UtxLt5KIPBJvlDc_Nt_dvbnnW_ldYiroL4w6wooXBpHuhIc1DwK4PZV8WGnIib-UfEc3JYWKuAciWe9UuTfqO4D9rC-P9At2CUvgw1Z8T60TmXSiGX7iboqo-yOswtcQNh8TPoUc1q8MUxHAbu3OkLBzqYeKLFQ5Lbng&preferred_environment=");
	
}
public void openLoginPage() {
	driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=TFasMktbGPw&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiVEZhc01rdGJHUHciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY5MTk0MjMyNSwiaWF0IjoxNjkxOTQxMTI1LCJqdGkiOiJjMmNhMmY4ZC1jZDBkLTQyMzEtOTM0YS03MzRiOTg1ODU0ZjUiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.f4zRErnK3xhXcGpN9SJvllRBuHR0uwG8BluRLzRvbbiaPaNcayMx552NitmUfShf2h7DwhWdnU4JAh5NbI5qDJCkiE5j0SwTq_Cnh7bGOBCeybZXlAP-YNsNuBIE2xZl5TkZXUPTcQ3RNGpXHCpEzRzb2vkYKXtQF6M4g7LuGCrng0Gc6Oof4dCBchjjshmy68pjxJI_JZMPWpdAoyKTnkFu0iDu69FSoAz_GxixpgNMVclEtwc2fbfLdlt18_V6x0ZFg03biQ2RHtMrptf2CIgmnWXJd2EffkgML_blLOz9SZTlN6ScMisB0D1sVjoW3blGLDAM_S1bR6DWnH27qQ&preferred_environment=");
    
}
  public void closeBrowser() {
	  driver.quit();
  }
  public void login(String a,String b) throws InterruptedException {
	  email.sendKeys(a);
	  password.sendKeys(b);
	  signIn.click();
	  Thread.sleep(2000);
}
  public String readEmailErr() {
	  String actualErr = emailErr.getText();
		System.out.println(actualErr);
		return actualErr;
  }
  public String passWordErr() {
	  String actualErr = passWordErr.getText();
		System.out.println(actualErr);
		return actualErr;  
  }
  public String readGlobalErr() {
	  String actualErr = globalError.getText();
		System.out.println(actualErr);
		return actualErr;
  
} 
}