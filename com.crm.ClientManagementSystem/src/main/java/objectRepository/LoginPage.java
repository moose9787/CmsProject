package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "user_name")
	private WebElement usertxt;
	
	@FindBy(name = "user_password")
	private WebElement password;
	
	@FindBy(id = "submitButton")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsertxt() {
		return usertxt;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//Bussiness logic 
	public void logintocms(WebDriver driver,String username,String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.getUsertxt().sendKeys(username);
		lp.getPassword().sendKeys(pwd);
		lp.getLoginbtn().click();
		
	}

}
