package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDRepsPage extends CMAbstractPage<NBDRepsPage>{
	
	private By reps_tab = By.xpath(".//div[@id='mainTab']/ul/li[3]/a/em");
	private By reps_tab_first_name_entry_search_field = By.id("loadRepsInfo_repsGridContent_firstName");
	private By reps_tab_first_name_filter_transaction = By.id("loadRepsInfo_repsGridContent_dataTableFilterContainer");
	private By reps_tab_first_name_result_check = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[1]/div/a");
	private By reps_tab_first_name_clear_filter = By.id("loadRepsInfo_repsGridContent_ClearAnchor");
	private By reps_tab_last_name_entry_search_field = By.id("loadRepsInfo_repsGridContent_lastName");
	private By reps_tab_last_name_filter_transaction = By.id("loadRepsInfo_repsGridContent_dataTableFilterContainer");
	private By reps_tab_last_name_result_check = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[2]/div/a");
	private By reps_tab_last_name_clear_filter = By.id("loadRepsInfo_repsGridContent_ClearAnchor");
	private By reps_tab_company_name_entry_search_field = By.id("loadRepsInfo_repsGridContent_legalName");
	private By reps_tab_company_name_filter_transaction = By.id("loadRepsInfo_repsGridContent_dataTableFilterContainer");
	private By reps_tab_company_name_result_check = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[3]/div/a");
	private By reps_tab_rep_document_status = By.xpath(".//div[@id='repsGridContent_Content']/table/tbody[3]/tr/td[7]/div/a");
	private By reps_tab_repdetails_bp_doc = By.cssSelector("html body table tbody tr td table#vendormatecontent tbody tr td table tbody tr td table#documents tbody tr td.vPanelBox table#entry tbody tr.greyLt td.vmNormalText a.vCategoryListLink");
	private By reps_tab_repdetails_IFrame = By.id("iFrameDetails");
	private By reps_tab_repdetails_bp_doc_status = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[5]/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[3]");
	private By reps_tab_repdetails_or_doc = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[5]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/a");
	private By reps_tab_repdetails_or_doc_status = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[5]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[3]");
	private By reps_tab_repdetails_backtolist_tick = By.linkText("back to list");
	
	
// Reps tab is clicked in NBD //	
	public NBDRepsPage click_reps_tab(){
	return click_button(reps_tab);
}

// First Name is entered in Reps tab - first name field //
public NBDRepsPage enter_firstname (String firstname){
	wait_until(4);
	return enter(reps_tab_first_name_entry_search_field, firstname);
}

// Filter button is clicked after first name is typed in search field //
public NBDRepsPage click_reps_tab_first_name_filter_transaction(){
	return click_button(reps_tab_first_name_filter_transaction);
}

// Verify entered string and displayed result of first name are same //
public NBDRepsPage verify_reps_tab_first_name_in_result(String msg){
	return verify_element_by_text(reps_tab_first_name_result_check, msg);
}

// After string and result are matched, clear link is clicked to clear out results //
public NBDRepsPage click_reps_tab_first_name_clear_filter(){
	return click_button(reps_tab_first_name_clear_filter);
}

// Last Name is entered in Reps tab - first name field //
public NBDRepsPage enter_lastname (String lastname){
	wait_until(4);
	return enter(reps_tab_last_name_entry_search_field, lastname);
}

// Filter button is clicked after last name is typed in search field //
public NBDRepsPage click_reps_tab_last_name_filter_transaction(){
	return click_button(reps_tab_last_name_filter_transaction);
}	

// Verify entered string and displayed result of last name are same //
public NBDRepsPage verify_reps_tab_last_name_in_result(String msg){
	return verify_element_by_text(reps_tab_last_name_result_check, msg);
}

// After string and result are matched, clear link is clicked to clear out results //
public NBDRepsPage click_reps_tab_last_name_clear_filter(){
	return click_button(reps_tab_last_name_clear_filter);
}

// Company name is entered in company name search field //
public NBDRepsPage enter_companyname (String companyname){
	wait_until(4);
	return enter(reps_tab_company_name_entry_search_field, companyname);
}

// Filter button is clicked after company name is typed in search field //
public NBDRepsPage click_reps_tab_company_name_filter_transaction(){
	return click_button(reps_tab_company_name_filter_transaction);
}

// Verify entered string and displayed result of company name are same //
public NBDRepsPage verify_reps_tab_company_name_in_result(String msg){
	return verify_element_by_text(reps_tab_company_name_result_check, msg);
}

// Click on document link of rep //
public NBDRepsPage click_reps_tab_rep_document_status(){
	return click_link(reps_tab_rep_document_status);
}

// Badge Photo label match in Rep Details - IFrame Section //
public NBDRepsPage verify_badgephoto_label_in_repdetails_accordion(String msg){
	switch_to_frame(reps_tab_repdetails_IFrame);
	return verify_element_by_text(reps_tab_repdetails_bp_doc, msg);
}

// Verify document status of badge photo //
public NBDRepsPage verify_badgephoto_doc_status_in_repdetails_accordion(String msg){
	//switch_to_frame(reps_tab_repdetails_IFrame);
	return verify_element_by_text(reps_tab_repdetails_bp_doc_status, msg);
}

// OR Protocol Training label match in Rep Details - IFrame Section // 
public NBDRepsPage verify_orprotocol_label_in_repdetails_accordion(String msg){
	//switch_to_frame(reps_tab_repdetails_IFrame);
	return verify_element_by_text(reps_tab_repdetails_or_doc, msg);
}

// Verify document status of OR Protocol Training //
public NBDRepsPage verify_orprotocol_doc_status_in_repdetails_accordion(String msg){
	//switch_to_frame(reps_tab_repdetails_IFrame);
	return verify_element_by_text(reps_tab_repdetails_or_doc_status, msg);
}

// Clicked on back to list link //
public NBDRepsPage click_back_to_list_link(){
	switch_to_root_page();
   return click_link(reps_tab_repdetails_backtolist_tick);
}

}
	


