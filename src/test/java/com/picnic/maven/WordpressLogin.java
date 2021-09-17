package com.picnic.maven;
/**
* 
*/

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
import com.picnic.maven.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class WordpressLogin
{
 
 
@Test
public void verifyValidLogin()
{
 
WebDriver driver=new FirefoxDriver();
 
driver.manage().window().maximize();
 
driver.get("http://demosite.center/wordpress/wp-login.php");
 
LoginPage login=new LoginPage(driver);
 
 
 
login.clickOnLoginButton();
 
 
driver.quit();
 
}
 
 
}