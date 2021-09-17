package com.picnic.maven;


/**
* 
*/

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.picnic.maven.Login;
 
/**
* @author Mukesh_50
*
*/
public class verifyLogin 
{
 
 
@Test
public void verifyValidLogin() throws InterruptedException
{
System.setProperty("webdriver.gecko.driver","C:\\Users\\IP-130\\Selenium Training\\seleniumProjecttraining\\drivers\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("https://opensource-demo.orangehrmlive.com/");
 
Login login=new Login(driver);
 
Thread.sleep(3000);
login.loginToWordpress("Admin","admin123");
Thread.sleep(5000);
//login.typePassword("admin123");
//Thread.sleep(3000);
//login.clickOnLoginButton();
//Thread.sleep(3000);
 
 
driver.quit();
 
}
 
 
}