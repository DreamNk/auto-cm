package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;



public class AjsNBDRepDetailsPage extends CMAbstractPage<AjsNBDRepDetailsPage> {

	private By rep_first_last_name = By.className("vCompanyName");
	
	//Iframe section Info Tab-------------------------------------------------------------------------------------------------------
	private By rep_iframe = By.id("repDetailURL");
	
	private By sanction_lists = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/th[1]");
	private By individual = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/th[2]");
	private By doc_alert = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/table/tbody/tr[1]/th");
	private By conflict_of_interest = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[5]/table/tbody/tr[1]/th");
	private By sales_territory = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[5]/tbody/tr[1]/td[2]");
	private By supervisor = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[7]/tbody/tr[1]/td[2]");
	private By reports = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[8]/tbody/tr[1]/td[2]");
	private By info_notes = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[9]/tbody/tr[1]/td[2]");
	
	//Iframe section Documents Tab-------------------------------------------------------------------------------------------------------

	private By documents_tab = By.name("documents1");
	private By ack_doc_name_title = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]");
	private By required_doc_title = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[5]/tbody/tr[1]/td[2]");
	private By optional_doc_title = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[7]/tbody/tr[1]/td[2]");
			
	//Iframe section Score Card Tab-------------------------------------------------------------------------------------------------------
	private By score_card_tab = By.name("scorecard1");
	private By vendor_rep_score_card = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[1]/tbody/tr[1]/td[2]");
	private By score_card_notes = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[3]/tbody/tr[1]/td[2]");
	private By history = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]");
	
	
	//Iframe section products Tab-------------------------------------------------------------------------------------------------------
	private By products_tab = By.name("products1");
	private By code_no = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]");
	
	
	
	
	
	
			

//Verify sanction list title
public AjsNBDRepDetailsPage verify_sanction_list_title(String msg){
	return verify_element_by_text(sanction_lists, msg);
}

//verify_individual_title
public AjsNBDRepDetailsPage verify_individual_title(String msg){
	return verify_element_by_text(individual, msg);
}

//verify_doc_alert_title
public AjsNBDRepDetailsPage verify_doc_alert_title(String msg){
	return verify_element_by_text(doc_alert, msg);
}

//verify_conflict_of_interest_title
public AjsNBDRepDetailsPage verify_conflict_of_interest_title(String msg){
	return verify_element_by_text(conflict_of_interest, msg);
}

//verify_sales_territory_title
public AjsNBDRepDetailsPage verify_sales_territory_title(String msg){
	return verify_element_by_text(sales_territory, msg);
}

//verify_supervisor_title
public AjsNBDRepDetailsPage verify_supervisor_title(String msg){
	return verify_element_by_text(supervisor, msg);
}

//verify_notes_title
public AjsNBDRepDetailsPage verify_info_notes_title(String msg){
	return verify_element_by_text(info_notes, msg);
}

//click_documents_tab
public AjsNBDRepDetailsPage click_documents_tab(){
	return click_button(documents_tab);
}

//verify_reports_title
public AjsNBDRepDetailsPage verify_reports_title(String msg){
	return verify_element_by_text(reports, msg);
}

//verify_ack_doc_name_1st_record
public AjsNBDRepDetailsPage verify_ack_doc_title(String msg){
	return verify_element_by_text(ack_doc_name_title, msg);
}

//required_doc_name_1st_record
public AjsNBDRepDetailsPage verify_required_doc_title(String msg){
	return verify_element_by_text(required_doc_title, msg);
}

//optional_doc_name_1st_record
public AjsNBDRepDetailsPage verify_optional_doc_title(String msg){
	return verify_element_by_text(optional_doc_title, msg);
}

//click_score_card_tab
public AjsNBDRepDetailsPage click_score_card_tab(){
	return click_button(score_card_tab);
}

//verify_vendor_rep_score_card
public AjsNBDRepDetailsPage verify_vendor_rep_score_card(String msg){
	wait_until(3);
	return verify_element_by_text(vendor_rep_score_card, msg);
}

//verify_score_card_notes
public AjsNBDRepDetailsPage verify_score_card_notes(String msg){
	return verify_element_by_text(score_card_notes, msg);
}

//verify_history
public AjsNBDRepDetailsPage verify_history(String msg){
	return verify_element_by_text(history, msg);
}


//click_products_tab
public AjsNBDRepDetailsPage click_products_tab(){
	return click_button(products_tab);
}

//verify_code_no
public AjsNBDRepDetailsPage verify_code_no(String msg){
	return verify_element_by_text(code_no, msg);
}

//verify_rep_details
public AjsNBDRepDetailsPage verify_rep_details(String msg){
	return verify_element_by_text(rep_first_last_name, msg);
}

//verify_rep_details
public AjsNBDRepDetailsPage switch_to_iframe(){
	return switch_to_frame(rep_iframe);
}

public AjsNBDRepDetailsPage click_back_to_list() {
	wait_until(5);
	return click_link(By.linkText("back to list"));
}
}
