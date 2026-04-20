package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement Profile;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	@FindBy(linkText = "Calendar")
	private WebElement calenderlink;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadslink;
	
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement orgelement;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactelement;
	
	@FindBy(xpath = "//a[text()='Opportunities']/parent::td[@class='tabUnSelected']")
	private WebElement pooprtunitylink;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProfile() {
		return Profile;
	}

	public WebElement getCalenderlink() {
		return calenderlink;
	}

	public WebElement getLeadslink() {
		return leadslink;
	}

	public WebElement getOrgelement() {
		return orgelement;
	}

	public WebElement getContactelement() {
		return contactelement;
	}

	public WebElement getPooprtunitylink() {
		return pooprtunitylink;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	
	
	
}
