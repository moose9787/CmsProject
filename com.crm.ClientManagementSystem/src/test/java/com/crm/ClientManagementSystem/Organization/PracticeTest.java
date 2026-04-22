package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.Baseclass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;

public class PracticeTest  {
@Test
public void practice() throws EncryptedDocumentException, IOException {
	
	
	
	Random r=new Random();
	int number = r.nextInt(10);
	System.out.println(number);
}
}
