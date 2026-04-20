package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.ClientManagementSystem.GenericLibrary.SeleniumUtility;

public class OrganizationPage {
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(name = "accountname")
	private WebElement orgname;
	
	@FindBy(id = "email1")
	private WebElement email;
	
	@FindBy(name = "industry")
	private WebElement industrydrop;
	
	@FindBy(name = "accounttype")
	private WebElement typrdrop;
	
	@FindBy(name = "assigntype")
	private WebElement radiogroup;
	
	
	@FindBy(name = "bill_street")
	private WebElement billaddress;
	
	@FindBy(name = "ship_street")
	private WebElement shipaddress;
	
	@FindBy(name = "bill_city")
	private WebElement billcity;
	
	@FindBy(name = "ship_city")
	private WebElement shipcity;
	
	@FindBy(id  = "bill_state")
	private WebElement billstate;
	
	@FindBy(id  = "ship_state")
	private WebElement shipstate;
	
	@FindBy(id  = "bill_country")
	private WebElement billcountry;

	@FindBy(id  = "ship_country")
	private WebElement shipcountry;
	
	@FindBy(name = "button")
	private WebElement savebtn;
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}


	@FindBy(name = "description")
	private WebElement desp;
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getPlusicon() {
		return plusicon;
	}


	public WebElement getOrgname() {
		return orgname;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getIndustrydrop() {
		return industrydrop;
	}


	public WebElement getTyprdrop() {
		return typrdrop;
	}


	public WebElement getRadiogroup() {
		return radiogroup;
	}


	public WebElement getBilladdress() {
		return billaddress;
	}


	public WebElement getShipaddress() {
		return shipaddress;
	}


	public WebElement getBillcity() {
		return billcity;
	}


	public WebElement getShipcity() {
		return shipcity;
	}


	public WebElement getBillstate() {
		return billstate;
	}


	public WebElement getShipstate() {
		return shipstate;
	}


	public WebElement getBillcountry() {
		return billcountry;
	}


	public WebElement getShipcountry() {
		return shipcountry;
	}


	public WebElement getDesp() {
		return desp;
	}


	public void setBillcity(WebElement billcity) {
		this.billcity = billcity;
	}
	
 public void createorganization(WebDriver driver,String orgname,String email,String text,String billaddress,String shipaddress,String shipcity,String billcity1,String billstate,String shipstate,String billcountry,String shipcountry,String desp) {
	 OrganizationPage op=new OrganizationPage(driver);
	 op.getOrgname().sendKeys(orgname);
	 op.getEmail().sendKeys(email);
	 WebElement dropaddress = op.getIndustrydrop();
	 SeleniumUtility s=new SeleniumUtility();
	 s.handledropdownByVisibleText(dropaddress, text);
	 op.getBilladdress().sendKeys(billaddress);
		op.getShipaddress().sendKeys(shipaddress);
		op.getShipcity().sendKeys(shipcity);
		op.getBillcity().sendKeys(billcity1);
		op.getBillstate().sendKeys(billstate);
		op.getShipstate().sendKeys(shipstate);
		op.getBillcountry().sendKeys(billcountry);
		op.getShipcountry().sendKeys(shipcountry);
		op.getDesp().sendKeys(desp);
		op.getSavebtn().click();
 }

}
