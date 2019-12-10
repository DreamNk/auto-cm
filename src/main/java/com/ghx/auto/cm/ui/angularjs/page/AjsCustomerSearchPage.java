package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsCustomerSearchPage extends CMAbstractPage<AjsCustomerSearchPage> {

	private By keyword_text_field = By.id("searchString");
	private By search_type_dropdown = By.id("searchType");
	private By search_button = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/vision-data-table/div/form/div/div[3]/div/button");
	private By valid_search_string_error_mesg = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/vision-data-table/div/form/div/div[1]/span/p");
	private By modj_character_error_mesg = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/vision-data-table/div/form/div/div[1]/span/p");
	private By register_button = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/vision-data-table/div/div/div[3]/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/span[1]/button");
	private By no_records_found_error_mesg = By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/div/div/vision-data-table/div/div/div[3]/div/div[1]/div[1]/div/div");
	
	// invoke customer search url
	public AjsCustomerSearchPage invoke_search_url() {
		load("customersearchUrl");
		handle_browser_exceptions();
		return this;
	}
	
	// enter search string in text field on customer search page
	public AjsCustomerSearchPage enter_text_in_text_field(String searchstring) {
		return enter( keyword_text_field ,searchstring);
	}
	
	// Select  from search type dropdown  on customer search page
	public  AjsCustomerSearchPage select_from_searchtype_dropdown(String mesg) {
		return select_by_name(search_type_dropdown, mesg);

	}
	
	//click search button on customer search page
	public AjsCustomerSearchPage click_search_button() {
		return click_button(search_button);

		
}
	
	// verify valid error string error message on customer search page
	public AjsCustomerSearchPage verify_valid_string_error_mesg(
			String msg) {
		return verify_element_by_text(valid_search_string_error_mesg, msg);

	}
	
	// verify modj error message on customer search page
	public AjsCustomerSearchPage verify_modj_error_mesg(
			String msg) {
		return verify_element_by_text(modj_character_error_mesg , msg);

	}
	
	// verify no records found error mesg message on customer search page
	public AjsCustomerSearchPage verify_no_records_found_error_mesg(
			String msg) {
		return verify_element_by_text(no_records_found_error_mesg , msg);

	}
	
	//click register button on customer search page
	public AjsCustomerSearchPage click_register_button() {
		return click_button(register_button);

	}
}

		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	