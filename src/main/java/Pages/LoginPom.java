package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	WebDriver driver;
	
	By txtemail=By.xpath("//input[@id='email']");
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']") 
	private WebElement loginbtn;

	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(txtemail);
	}

	
	
	
	
	
	
	
}
