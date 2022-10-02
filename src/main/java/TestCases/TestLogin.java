package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

	public static void main(String[] args) {

    // Browser Open 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		// WebElement ---> Action
		LoginPom login=new LoginPom(driver);
		//LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getEmail().sendKeys("Test");
		
		Bank b=new Bank();
		b.setBalance(100);
		
		System.out.println(b.getBalance());
		b.setBalance(300);
		
		System.out.println(b.getBalance()); // 100+300 =400

		
	}

	

}
