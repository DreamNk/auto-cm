package com.ghx.auto.cm.ui.angularjs.page;
import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;



public class AjsNBDRepsPage extends CMAbstractPage<AjsNBDRepsPage>{

	
	//Reps Tab Filters:-------------------------------------------------
		
	private By reps_tab = By.id("reps");
	private By first_name_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/thead/tr[2]/th[1]/div/div/div/input");
	private By Last_name_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/thead/tr[2]/th[2]/div/div/div/input");
	private By company_search_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/thead/tr[2]/th[3]/div/div/div/input");
	private By documents_filter = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/thead/tr[2]/th[7]/div/div/div/select");
	private By select_dropdown = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/tbody/tr[1]/td[9]/select");
	private By clear_button = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[4]/button");
	private By first_name_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/tbody/tr[1]/td[1]/a");
	private By last_name_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/tbody/tr/td[2]/a");
	private By document_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/tbody/tr/td[7]/a");
	private By company_1st_record = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/tbody/tr[1]/td[3]/a");
	private By help_text = By.xpath("/html/body/div[9]/div/div/div/div[1]/h3");
	
	//Add Appointment-----------------------------------------------------------------------------------------
	private By add_appointment = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/vision-data-table/div[5]/div[1]/div[2]/table/tbody/tr[1]/td[9]/select/option[2]");
	
	
	
	//Click reps tab
	public AjsNBDRepsPage click_reps_tab(){
		wait_until(4);
		return click_button(reps_tab);
	}
	
	//enter first name
	public AjsNBDRepsPage enter_first_name(String first_name){
		return enter(first_name_search_field, first_name);
	}
	
	//enter last name
	public AjsNBDRepsPage enter_last_name(String last_name){
		return enter(Last_name_search_field, last_name);
	}
	
	//enter company name
	public AjsNBDRepsPage enter_company(String company_name){
		return enter(company_search_field, company_name);
	}
	
	//enter company name
	public AjsNBDRepsPage select_document_status(String doc_status){
		wait_until(4);
		return select_by_name(documents_filter, doc_status);
	}
	
	//Click clear Button
	public AjsNBDRepsPage click_clear_button(){
		return click_button(clear_button);
	}
	
	//Click Help link of Reps tab
	public AjsNBDRepsPage click_help_link(){
		return click_link(By.linkText("Help"));
	}
	
	//Verify Help text
	public AjsNBDRepsPage verify_help_text(String text){
		wait_until(3);
		return verify_element_by_text(help_text, text);
	}
	
	//Verify first name
	public AjsNBDRepsPage verify_first_name_1st_record(String first_name){
		return verify_element_by_text(first_name_1st_record, first_name);
	}
	
	//Verify first name
	public AjsNBDRepsPage click_first_name_1st_record(){
		return click_link(first_name_1st_record);
	}
	
	//Verify last name
	public AjsNBDRepsPage verify_last_name_1st_record(String last_name){
		return verify_element_by_text(last_name_1st_record, last_name);
	}
	
	//Verify company name
	public AjsNBDRepsPage verify_company_name_1st_record(String company_name){
		return verify_element_by_text(company_1st_record, company_name);
	}
	
	//Verify document name
	public AjsNBDRepsPage verify_document_1st_record(String document_status){
		return verify_element_by_text(document_1st_record, document_status);
	}
	
	//Verify add appointment in the select dropdown
	public AjsNBDRepsPage verify_add_appointment_in_select_dropdown(){
		click_button(select_dropdown);
		return verify_element_by_value(add_appointment, "addAppointment");
	}
	
	//click on rep email id in reps tab:
	public AjsNBDRepsPage click_email_id(String email){
		return click_link(By.linkText(email));
	}
	
}