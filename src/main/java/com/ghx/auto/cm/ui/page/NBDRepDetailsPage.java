package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NBDRepDetailsPage extends CMAbstractPage<NBDRepDetailsPage> {

	private By reps_tab_first_name_click = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[1]/div/a");
	private By check_sanctionlist_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/th[1]");
	private By check_individual_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/th[2]");
	private By check_docalerts_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[1]/th");
	private By check_reqddocs_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[2]/td[1]");
	private By check_reqddocs_status = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[2]/td[2]/b/nobr");
	private By check_effectivedate_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[3]/td[1]");
	private By check_effectivedate_status = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[3]/td[2]/b/nobr");
	private By check_expirationdate_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[4]/td[1]");
	private By check_expirationdate_status = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[3]/td[2]/b/nobr");
	private By reps_tab_last_name_click = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[2]/div/a");
	private By check_employer_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]");
	private By check_employer_name = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/a");
	private By check_email_address_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[4]/td[1]");
	private By check_email_ID = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/a");
	private By check_phonenumber_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[6]/td[1]");
	private By check_phonenumber = By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]");
	private By click_product_tab = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[2]/tbody/tr[1]/td[8]/a/img");
	private By check_code_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/thead/tr/th[1]/a");
	private By check_codeone_ID = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]");
	private By check_codetwo_ID = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]");
	private By check_description_label = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/thead/tr/th[3]/a");
	private By check_description_one_details = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[3]");
	private By check_description_two_details  = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[3]");
	private By reps_tab_company_name_click = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[3]/div/a");
	private By check_vendorname = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/strong");
	private By click_vendordetails_backtolist_link = By.id("backToListContainer_anchor");
	private By repdetails_iframe = By.id("iFrameDetails");
 


	

// Rep's first name in NBD - Reps Tab is clicked
public NBDRepDetailsPage click_reps_tab_first_name_click(){
		return click_button(reps_tab_first_name_click);
}

// Buyer lands in RepDetails Accordion and verifies Sanction List label in Info Tab 
public NBDRepDetailsPage verify_check_sanctionlist_label(String msg){
	switch_to_frame(repdetails_iframe);
	wait_until(15);
	return verify_element_by_text(check_sanctionlist_label, msg);
}

// Buyer lands in RepDetails Accordion and verifies Individual label in Info Tab 
public NBDRepDetailsPage verify_check_individual_label(String msg){
	return verify_element_by_text(check_individual_label, msg);
}

// Buyer lands in RepDetails Accordion and verifies Doc alerts label in Info Tab 
public NBDRepDetailsPage verify_check_docalerts_label(String msg){
	return verify_element_by_text(check_docalerts_label, msg);
}

// Buyer views and verifies reqd_docs label in RepDetails Accordion - Info Tab
public NBDRepDetailsPage verify_check_reqddocs_label(String msg){
	return verify_element_by_text(check_reqddocs_label, msg);
}

// Buyer views and verifies reqd_docs status as PASS in RepDetails Accordion - Info Tab
public NBDRepDetailsPage verify_check_reqddocs_status(String msg){
	return verify_element_by_text(check_reqddocs_status, msg);
}

// Buyer views and verifies effective_date label in RepDetails Accordion - Info Tab
public NBDRepDetailsPage verify_check_effectivedate_label(String msg){
	return verify_element_by_text(check_effectivedate_label, msg);
}

// Buyer views and verifies effective_date status as PASS in RepDetails Accordion - Info Tab
public NBDRepDetailsPage verify_check_effectivedate_status(String msg){
	return verify_element_by_text(check_effectivedate_status, msg);
}

// Buyer views and verifies expiration_date label in RepDetails Accordion - Info Tab
public NBDRepDetailsPage verify_check_expirationdate_label(String msg){
	return verify_element_by_text(check_expirationdate_label, msg);
}

// Buyer views and verifies expiration_date status as PASS in RepDetails Accordion - Info Tab
public NBDRepDetailsPage verify_check_expirationdate_status(String msg){
	return verify_element_by_text(check_expirationdate_status, msg);
}

// Rep's last name in NBD - Reps Tab is clicked
public NBDRepDetailsPage click_reps_tab_last_name_click(){
	return click_button(reps_tab_last_name_click);
}

// Buyer views and verifies employee label in RepDetails Accordion - header portion
public NBDRepDetailsPage verify_check_employer_label(String msg){
	switch_to_frame(repdetails_iframe);
	wait_until(10);
	return verify_element_by_text(check_employer_label, msg);
}

// Buyer views and verifies employee name in RepDetails Accordion - header portion
public NBDRepDetailsPage verify_check_employer_name(String msg){
	return verify_element_by_text(check_employer_name, msg);
}

// Buyer views and verifies email_address label in RepDetails Accordion - header portion
public NBDRepDetailsPage verify_check_email_address_label(String msg){
	return verify_element_by_text(check_email_address_label, msg);
}

// Buyer views and verifies email_address ID in RepDetails Accordion - header portion
public NBDRepDetailsPage verify_check_email_ID(String msg){
	return verify_element_by_text(check_email_ID, msg);
}

// Buyer views and verifies phone_number label in RepDetails Accordion - header portion
public NBDRepDetailsPage verify_check_phonenumber_label(String msg){
	return verify_element_by_text(check_phonenumber_label, msg);
}

// Buyer views and verifies phone_number in RepDetails Accordion - header portion
public NBDRepDetailsPage verify_check_phonenumber(String msg){
	return verify_element_by_text(check_phonenumber, msg);
}	

// Product Tab in RepDetails Accordion is clicked
public NBDRepDetailsPage click_product_tab(){
	wait_until(2);	
	return click_button(click_product_tab);
}


// Buyer views and verifies code label in Products Tab 
public NBDRepDetailsPage verify_check_code_label(String msg){
	return verify_element_by_text(check_code_label, msg);
}

// Buyer views and verifies code item_label_one in Products Tab 
public NBDRepDetailsPage verify_check_codeone_ID(String msg){
	return verify_element_by_text(check_codeone_ID, msg);
}

// Buyer views and verifies code item_label_two in Products Tab 
public NBDRepDetailsPage verify_check_codetwo_ID(String msg){
	return verify_element_by_text(check_codetwo_ID, msg);
}

// Buyer views and verifies description_label in Products Tab 
public NBDRepDetailsPage verify_check_description_label(String msg){
	return verify_element_by_text(check_description_label, msg);
}

// Buyer views and verifies description_label_one in Products Tab 
public NBDRepDetailsPage verify_check_description_one_details(String msg){
	return verify_element_by_text(check_description_one_details, msg);
}

// Buyer views and verifies description_label_two in Products Tab 
public NBDRepDetailsPage verify_check_description_two_details(String msg){
	return verify_element_by_text(check_description_two_details, msg);
}

//Rep's company name in NBD - Reps Tab is clicked
public NBDRepDetailsPage click_reps_tab_company_name_click(){
		return click_button(reps_tab_company_name_click);
}


//Rep's vendor name is verified in vendor details page
public NBDRepDetailsPage verify_check_vendorname(String msg){
	wait_until(ExpectedConditions.presenceOfElementLocated(repdetails_iframe));
	switch_to_frame(repdetails_iframe);
	return verify_element_by_text(check_vendorname, msg);
}

//vendor Details section - back to list link is clicked
public NBDRepDetailsPage click_vendordetails_backtolist_link(){
		return click_button(click_vendordetails_backtolist_link);
}

}
