package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.Baseclass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;
import com.crm.ClientManagementSystem.GenericLibrary.Javautility;
import com.crm.ClientManagementSystem.GenericLibrary.ListenerImplementation;
import com.crm.ClientManagementSystem.GenericLibrary.SeleniumUtility;

import objectRepository.Homepage;
import objectRepository.OrganizationPage;
@Listeners(ListenerImplementation.class)
public class CreateOrganizationTest extends Baseclass {
	
	@Test
	public void create() throws EncryptedDocumentException, IOException {
	Homepage lp=new Homepage(driver);
	lp.getOrgelement().click();
	OrganizationPage op=new OrganizationPage(driver);
	op.getPlusicon().click();
	FileUtils f=new FileUtils();
	String organizationname = f.readDatFromExcel("TestingData", 1, 1);
	String email = f.readDatFromExcel("TestingData", 1, 2);
    String billaddress = f.readDatFromExcel("TestingData", 1, 3);
    String shipaddress = f.readDatFromExcel("TestingData", 1, 4);
    String billcity1 = f.readDatFromExcel("TestingData", 1, 5);
    String shipcity = f.readDatFromExcel("TestingData", 1, 6);
    String billstate = f.readDatFromExcel("TestingData", 1, 7);
    String shipstate = f.readDatFromExcel("TestingData", 1, 8);
    String billcountry = f.readDatFromExcel("TestingData", 1, 9);
    String shipcountry = f.readDatFromExcel("TestingData", 1, 10);
    String desp = f.readDatFromExcel("TestingData", 1, 11);
    Javautility j=new Javautility();
    int number = j.generateRandom(25);
	op.createorganization(driver, organizationname+" "+number, email, "Engineering", billaddress, shipaddress, billcity1, shipcity, billstate, shipstate, billcountry, shipcountry, desp);	
	}

}
