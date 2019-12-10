package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDCustomerCarePage extends CMAbstractPage<NBDCustomerCarePage>{
	
	private By support = By.linkText("Customer Care");
	private By supportText = By.xpath(".//div[@class='pbHeader']/table/tbody/tr/td[1]/h2");
		
	public NBDCustomerCarePage click_customer_care_link(){
		wait_until(2);
		return click_link(support);
	}
	
	public NBDCustomerCarePage verify_customer_care_text(){
		wait_until(2);
		return verify_element_by_text(supportText, "Create Case");
	}
	
	public NBDCustomerCarePage verify_contact_name_text(String contactNme){
		wait_until(1);
		verify_element_attribute_value((By.xpath("//*[contains(@value,'"+contactNme+"')]")), "value",contactNme);
		return this;
	}

	public NBDCustomerCarePage verify_support_company_text(String companyText){
		wait_until(1);
		verify_element_attribute_value((By.xpath("//*[contains(@value,'"+companyText+"')]")), "value",companyText);
		return this;
	}
	public NBDCustomerCarePage verify_support_email_text(String emailAddress){
		wait_until(1);
		verify_element_attribute_value((By.xpath("//*[contains(@value,'"+emailAddress+"')]")), "value",emailAddress);
		return this;
	}

}
