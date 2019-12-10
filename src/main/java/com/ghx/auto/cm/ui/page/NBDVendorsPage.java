package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NBDVendorsPage extends CMAbstractPage<NBDVendorsPage> {
	
	// Locators for vendors page and vendor details page
	private By vendors = By.xpath(".//div[@id='mainTab']/ul/li[2]/a/em");
	private By help = By.xpath(".//div[@id='vendorsSectionHeading']/div[2]/a");
	private By filter = By.id("loadVendorsInfo_vendorsGridContent_dataTableFilterContainer");
	private By clear = By.id("loadVendorsInfo_vendorsGridContent_ClearAnchor");
	private By company_name_filter_field = By.id("loadVendorsInfo_vendorsGridContent_legalName");
	private By legal_name = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr[1]/td[1]/div/a");
    private By back_to_list = By.linkText("back to list");
    private By global_search_field = By.id("globalSearchText");
    private By search_button = By.id("globalSearchSubmitBDB");
    private By search_results_text = By.xpath(".//div[@id='gsVendorsGridContent_Content']/table/tbody[3]/tr[1]/td[1]/div/a");
    private By close_popup = By.xpath(".//div[@id='sectionHelpDialog_c']/div[1]/a");
    private By details_accordion = By.id("vendorsAccordion-2-label");
    private By doing_business_as_filter_field = By.id("loadVendorsInfo_vendorsGridContent_dbaName");
    private By doing_business_as_name = By.linkText("consulting");
    private By doing_business_as_name_prod = By.linkText("Compucharts");
    private By vendor_details_iframe = By.id("iFrameDetails");
    private By vendor_details_header_text = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/strong");
    private By dbaname_on_vendor_details_page = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/strong");
    private By documents_tab = By.id("documents1");
    private By tax_id = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/strong");
    private By ack_req_for_555_hospital = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]");
    private By score_card_tab = By.id("scorecard1");
    private By score_card_text = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]");
    private By principals_tab = By.id("principals1");
    private By principal_name = By.cssSelector("[class='vTableFieldsTop']");
    private By contacts_tab = By.id("contacts1");
    private By contacts_principal_name_text = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]");
    private By reps_tab = By.id("reps1");
    private By rep_name_text = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[1]/table[3]/tbody/tr[2]/td[2]/form/table[2]/tbody/tr/td[2]/a");
    private By gs1_keys_tab = By.id("glns1");
    private By gs1_key_name = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/table/tbody/tr/td[2]");
    private By clear_global_search_field = By.id("globalSearchResetDiv");
    private By rep_name_search_result = By.xpath(".//div[@id='gsRepsGridContent_Content']/table/tbody[3]/tr/td[1]/div/a");
    private By rep_mailid_search_result = By.xpath(".//div[@id='gsRepsGridContent_Content']/table/tbody[3]/tr/td[6]/div/a");
    private By documents_dropdown = By.id("loadVendorsInfo_vendorsGridContent_indDocumentComplAlertCde");
    private By select_actions_dropdown = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr[1]/td[6]/div/select");
    private By add_appointment_accordian = By.id("recurringAppointmentAccordion-1-label");
    private By fail_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr[1]/td[4]/div/a");
    private By pass_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
    private By na_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
    private By alert_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");

    // Locators for Diversity Section in Vendor Tab --> Info Tab
 	private By diversity_category = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[5]/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/a/strong");
 	private By diversity_type = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[5]/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]");
 	private By diversity_agency = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[5]/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[3]");
 	private By diversity_number = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[5]/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[4]");
 	private By diversity_expirationdate = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[5]/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[5]");
    
    // Click vendors tab in NBD
    public NBDVendorsPage click_vendors_tab(){
		return click_tab(vendors);
    }
    
	// Click help link on vendors page
    public  NBDVendorsPage click_help_link(){
		return click_link(help);
    }
    
	// Click filter button on vendors page
    public  NBDVendorsPage click_filter_button(){
    	return click_button(filter);
    }
    
	// Click clear link on vendors page
	public NBDVendorsPage click_clear_link() {
		return click_link(clear);

	}

	// enter company name in company name filter field on vendors page
	public NBDVendorsPage enter_company_name_in_filter_field(String legalname) {
		wait_until(10);
		return enter(company_name_filter_field, legalname);

	}

	// enter text in doing business as filter field on vendors page
	public NBDVendorsPage enter_doing_business_as_in_filter_field(String doingbusinessas) {
		wait_until(10);
		return enter(doing_business_as_filter_field, doingbusinessas);
	}

	// click legal name link on vendors page
	public NBDVendorsPage click_legal_name_link() {
		wait_until(10);
		return click_link(legal_name);

	}

	// click doing as business name link on vendors page
	public NBDVendorsPage click_doing_business_as_name_link() {
		wait_until(10);
		return click_link(doing_business_as_name);

	}
	// click doing as business name link on vendors page in production
		public NBDVendorsPage click_doing_business_as_name_link_prod() {
			wait_until(10);
			return click_link(doing_business_as_name_prod);

		}


	// click back to list link on vendor details page
	public NBDVendorsPage click_back_to_list_link() {
		wait_until(10);
		return click_link(back_to_list);

	}

	// enter text in global search field
	public NBDVendorsPage global_search_field(String companyname) {
		return enter(global_search_field, companyname);

	}

	// click search button
	public NBDVendorsPage click_search_button() {
		return click_button(search_button);

	}

	// global search results company name text
	public NBDVendorsPage verify_search_results_text(String msg) {
		wait_until(10);
		return verify_element_by_text(search_results_text, msg);

	}

	// global search results rep name text
	public NBDVendorsPage verify_rep_name_search_results_text(String msg) {
		wait_until(10);
		return verify_element_by_text(rep_name_search_result, msg);

	}

	// global search results rep name text
	public NBDVendorsPage verify_rep_mailid_search_results_text(String msg) {
		wait_until(10);
		return verify_element_by_text(rep_mailid_search_result, msg);

	}

	// global search: clear global search field
	public NBDVendorsPage click_cross_sign_on_global_search_field() {
		wait_until(10);
		return click_button(clear_global_search_field);

	}

	// verify conmpay name on vendor details page
	public NBDVendorsPage verify_vendor_details_header_text(String msg) {
		wait_until(10);
		switch_to_frame(vendor_details_iframe);
		wait_until(5);
		verify_element_by_text(vendor_details_header_text, msg);
		return this;

	}

	// verify doing as business name on vendor details page
	public NBDVendorsPage verify_dba_on_vendor_details_page(String msg) {
		wait_until(10);
		switch_to_frame(vendor_details_iframe);
		wait_until(10);
		verify_element_by_text(dbaname_on_vendor_details_page, msg);
		switch_to_root_page();
		return this;

	}

	// close help pop up on vendors page
	public NBDVendorsPage close_help_popup() {
		wait_until(10);
		return click_popup(close_popup);

	}

	//verify vendor details accordion text on vendor details page
	public NBDVendorsPage verify_details_accordion_header_text(String msg) {
		wait_until(10);
		return verify_element_by_text(details_accordion, msg);

	}

	// verify tax id in info tab vendor details page
	public NBDVendorsPage verify_info_tax_id_text(String msg) {
		return verify_element_by_text(tax_id, msg);

	}
	
	// switch to vendor details iframe
	public NBDVendorsPage switch_to_vendors_details_iframe_() {
		return switch_to_frame(vendor_details_iframe);
	}
	
	// click documents tab on vendor details page
	public NBDVendorsPage click_documents_tab() {
		wait_until(5);
		return click_tab(documents_tab);
	}

	// verify Acknowledgments required for header text in documents tab on
	// vendor details page
	public NBDVendorsPage verify_docs_acknowledgements_req_for_text(String msg) {
		return verify_element_by_text(ack_req_for_555_hospital, msg);
	}

	// click scorecard tab on vendor details page
	public NBDVendorsPage click_scorecard_tab() {
		return click_tab(score_card_tab);

	}

	// verify text in notes section
	public NBDVendorsPage verify_scorecard_text(String msg) {
		return verify_element_by_text(score_card_text, msg);

	}

	// click principal tab on vendor details page
	public NBDVendorsPage click_principals_tab() {
		return click_tab(principals_tab);

	}

	// verify prinicpal name
	public NBDVendorsPage verify_principal_name_text(String msg) {
		return verify_element_by_text(principal_name, msg);

	}

	// click contacts tab on vendor details page
	public NBDVendorsPage click_contacts_tab() {
		return click_tab(contacts_tab);

	}

	// verify principal name in contacts section
	public NBDVendorsPage verify_contacts_principal_name_text(String msg) {
		return verify_element_by_text(contacts_principal_name_text, msg);

	}

	// click reps tab on vendor details page
	public NBDVendorsPage click_reps_tab() {
		return click_tab(reps_tab);

	}

	// verify rep name in reps section
	public NBDVendorsPage verify_rep_name_text(String msg) {
		return verify_element_by_text(rep_name_text, msg);

	}

	// click gs1 keys tab on vendor details page
	public NBDVendorsPage click_gs1_keys_tab() {
		return click_tab(gs1_keys_tab);

	}

	// verify gs1 key name in gs1 keys section
	public NBDVendorsPage verify_gs1_key_name_text(String msg) {
		
		return verify_element_by_text(gs1_key_name, msg);
	}

	// select Fail option from documents drop down
	public NBDVendorsPage click_fail_option_from_documents_dropdown() {
		wait_until(3);
		return select_by_name(documents_dropdown, "FAIL");

	}

	// select Pass option from documents drop down
	public NBDVendorsPage click_pass_option_from_documents_dropdown() {
		wait_until(3);
		return select_by_name(documents_dropdown, "PASS");

	}

	// select N/A option from documents drop down
	public NBDVendorsPage click_na_option_from_documents_dropdown() {
		wait_until(3);
		return select_by_name(documents_dropdown, "N/A");

	}

	// select Alert option from documents drop down
	public NBDVendorsPage click_alert_option_from_documents_dropdown() {
		wait_until(3);
		return select_by_name(documents_dropdown, "ALERT");

	}

	// select Add appointment option from actions drop down
	public NBDVendorsPage click_add_appointment_option_from_action_dropdown() {
		wait_until(3);
		return select_by_name(select_actions_dropdown, "Add Appointment");

	}

	// verify add appointment accordian text on add appointment page
	public NBDVendorsPage verify_add_appointment_accordian_text(String msg) {
		wait_until(10);
		return verify_element_by_text(add_appointment_accordian, msg);
	}

	// verify fail text in documents column on vendors page
	public NBDVendorsPage verify_fail_text_in_documents_column(String msg) {
		wait_until(10);
		return verify_element_by_text(fail_text, msg);

	}

	// verify pass text in documents column on vendors page
	public NBDVendorsPage verify_pass_text_in_documents_column(String msg) {
		wait_until(10);
		return verify_element_by_text(pass_text, msg);

	}

	// verify na text in documents column on vendors page
	public NBDVendorsPage verify_na_text_in_documents_column(String msg) {
		wait_until(10);
		return verify_element_by_text(na_text, msg);

	}

	// verify alert text in documents column on vendors page
	public NBDVendorsPage verify_alert_text_in_documents_column(String msg) {
		wait_until(10);
		return verify_element_by_text(alert_text, msg);

	}
	

// Methods for Diversity Section in Vendor Tab --> Info Tab
	
// Method to verify Diversity Category  in Vendor Tab --> Info Tab
	public NBDVendorsPage verify_diversity_category(String msg){
		return verify_element_by_text(diversity_category, msg);
	}
	
// Method to verify Diversity Type  in Vendor Tab --> Info Tab
	public NBDVendorsPage verify_diversity_type(String msg){
		return verify_element_by_text(diversity_type, msg);
	}		
			
// Method to verify Diversity agency  in Vendor Tab --> Info Tab
	public NBDVendorsPage verify_diversity_agency(String msg){
		return verify_element_by_text(diversity_agency, msg);
	}
			
// Method to verify Diversity number  in Vendor Tab --> Info Tab
	public NBDVendorsPage verify_diversity_number(String msg){
		return verify_element_by_text(diversity_number, msg);
	}
			
// Method to verify Diversity expiration date  in Vendor Tab --> Info Tab
	public NBDVendorsPage verify_diversity_expirationdate(String msg){
		return verify_element_by_text(diversity_expirationdate, msg);
	}			
	
	
// 	Method to check if diversity category element is present in Info tab
	public NBDVendorsPage verify_diversity_category_not_present (String text) {
		try	{ 	verify_element_by_text(diversity_category, text);
				Assert.fail("Element Present on the Page");
			} 	catch (Exception e){}
		return this;
	}
	

	
	
	
	
	
	
	
	
	
	
	

}

