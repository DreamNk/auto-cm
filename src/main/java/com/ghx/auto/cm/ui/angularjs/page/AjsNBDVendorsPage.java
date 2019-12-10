package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.NBDHomePage;
import com.ghx.auto.cm.ui.angularjs.page.AjsNBDVendorsPage;

public class AjsNBDVendorsPage extends CMAbstractPage<AjsNBDVendorsPage> {
	
	// Locators for vendors page and vendor details page
		private By vendors = By.id("vendors");
		private By help = By.className("helpAlign ng-binding");
		//private By filter = By.id("loadVendorsInfo_vendorsGridContent_dataTableFilterContainer");
		private By clear = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[3]/vision-data-table/div[1]/div[2]/button");
		private By company_name_filter_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[3]/vision-data-table/div[3]/div[1]/table/thead/tr[2]/th[1]/div/div/div/input");
		private By legal_name = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[3]/vision-data-table/div[3]/div[1]/table/tbody/tr/td[1]/a");
	    private By back_to_list = By.id("vendorDetailsLink");
	    private By close_popup = By.xpath("/html/body/div[7]/div/div/div/div[1]/button");
	    private By details_accordion = By.id("vendorsAccordion-2-label");
	    private By doing_business_as_filter_field = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[3]/vision-data-table/div[3]/div[1]/table/thead/tr[2]/th[2]/div/div/div/input");
	    private By doing_business_as_name = By.linkText("hospitality of makon");
	    private By doing_business_as_name_prod = By.linkText("Compucharts");
	    private By vendor_details_iframe = By.id("detailURL");
	    private By vendor_details_header_text = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/strong");
	    private By dbaname_on_vendor_details_page = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/strong");
	    private By documents_tab = By.id("documents1");
	    private By tax_id = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/form/table[3]/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/strong");
	    private By ack_req_for_Will_hospital = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[3]/tbody/tr[1]/td[2]");
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
	    private By documents_dropdown = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[3]/vision-data-table/div[3]/div[1]/table/thead/tr[2]/th[4]/div/div/div/select");
	    private By select_actions_dropdown = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[3]/vision-data-table/div[3]/div[1]/table/tbody/tr[1]/td[6]/select");
	    private By add_appointment_accordian = By.id("recurringAppointmentAccordion-1-label");
	    private By fail_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr[1]/td[4]/div/a");
	    private By pass_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
	    private By na_text = By.id("NA");
	    private By alert_text = By.xpath(".//div[@id='vendorsGridContent_Content']/table/tbody[3]/tr/td[4]/div/a");
	    private By vendors_accordian = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[1]/h4/a/span/a");
	
	    // Click vendors tab in NBD
	    public AjsNBDVendorsPage click_vendors_tab(){
			return click_tab(vendors);
	    }
	    
		// Click help link on vendors page
	    public  AjsNBDVendorsPage click_help_link(){
			return click_link(help);
	    }
	    
		
	    
		// Click clear link on vendors page
		public AjsNBDVendorsPage click_clear_link() {
			return click_button(clear);

		}

		// enter company name in company name filter field on vendors page
		public AjsNBDVendorsPage enter_company_name_in_filter_field(String legalname) {
			wait_until(10);
			return enter(company_name_filter_field, legalname);

		}

		// enter text in doing business as filter field on vendors page
		public AjsNBDVendorsPage enter_doing_business_as_in_filter_field(String doingbusinessas) {
			wait_until(10);
			return enter(doing_business_as_filter_field, doingbusinessas);
		}

		// click legal name link on vendors page
		public AjsNBDVendorsPage click_legal_name_link() {
			wait_until(10);
			return click_link(legal_name);

		}

		// click doing as business name link on vendors page
		public AjsNBDVendorsPage click_doing_business_as_name_link() {
			wait_until(10);
			return click_link(doing_business_as_name);

		}
		// click doing as business name link on vendors page in production
		public AjsNBDVendorsPage click_doing_business_as_name_link_prod() {
			wait_until(10);
			return click_link(doing_business_as_name_prod);

		}


		// click back to list link on vendor details page
		public AjsNBDVendorsPage click_back_to_list_link() {
			wait_until(10);
			return click_link(back_to_list);

		}

		
		// verify conmpay name on vendor details page
		public AjsNBDVendorsPage verify_vendor_details_header_text(String msg) {
			wait_until(10);
			switch_to_frame(vendor_details_iframe);
			wait_until(5);
			verify_element_by_text(vendor_details_header_text, msg);
			return this;

		}

		// verify doing as business name on vendor details page
		public AjsNBDVendorsPage verify_dba_on_vendor_details_page(String msg) {
			wait_until(10);
			switch_to_frame(vendor_details_iframe);
			wait_until(10);
			verify_element_by_text(dbaname_on_vendor_details_page, msg);
			switch_to_root_page();
			return this;

		}

		// close help pop up on vendors page
		public AjsNBDVendorsPage close_help_popup() {
			wait_until(10);
			return click_popup(close_popup);

		}

		//verify vendor details accordion text on vendor details page
		public AjsNBDVendorsPage verify_details_accordion_header_text(String msg) {
			wait_until(10);
			return verify_element_by_text(details_accordion, msg);

		}

		// verify tax id in info tab vendor details page
		public AjsNBDVendorsPage verify_info_tax_id_text(String msg) {
			return verify_element_by_text(tax_id, msg);

		}
		
		// switch to vendor details iframe
		public AjsNBDVendorsPage switch_to_vendors_details_iframe_() {
			return switch_to_frame(vendor_details_iframe);
		}
		
		// click documents tab on vendor details page
		public AjsNBDVendorsPage click_documents_tab() {
			wait_until(5);
			return click_tab(documents_tab);
		}

		// verify Acknowledgments required for header text in documents tab on
		// vendor details page
		public AjsNBDVendorsPage verify_docs_acknowledgements_req_for_text(String msg) {
			return verify_element_by_text(ack_req_for_Will_hospital, msg);
		}

		// click scorecard tab on vendor details page
		public AjsNBDVendorsPage click_scorecard_tab() {
			return click_tab(score_card_tab);

		}

		// verify text in notes section
		public AjsNBDVendorsPage verify_scorecard_text(String msg) {
			return verify_element_by_text(score_card_text, msg);

		}

		// click principal tab on vendor details page
		public AjsNBDVendorsPage click_principals_tab() {
			return click_tab(principals_tab);

		}

		// verify prinicpal name
		public AjsNBDVendorsPage verify_principal_name_text(String msg) {
			return verify_element_by_text(principal_name, msg);

		}

		// click contacts tab on vendor details page
		public AjsNBDVendorsPage click_contacts_tab() {
			return click_tab(contacts_tab);

		}

		// verify principal name in contacts section
		public AjsNBDVendorsPage verify_contacts_principal_name_text(String msg) {
			return verify_element_by_text(contacts_principal_name_text, msg);

		}

		// click reps tab on vendor details page
		public AjsNBDVendorsPage click_reps_tab() {
			return click_tab(reps_tab);

		}

		// verify rep name in reps section
		public AjsNBDVendorsPage verify_rep_name_text(String msg) {
			return verify_element_by_text(rep_name_text, msg);

		}

		// click gs1 keys tab on vendor details page
		public AjsNBDVendorsPage click_gs1_keys_tab() {
			return click_tab(gs1_keys_tab);

		}

		// verify gs1 key name in gs1 keys section
		public AjsNBDVendorsPage verify_gs1_key_name_text(String msg) {
			
			return verify_element_by_text(gs1_key_name, msg);
		}

		// select Fail option from documents drop down
		public AjsNBDVendorsPage click_fail_option_from_documents_dropdown() {
			wait_until(3);
			return select_by_name(documents_dropdown, "FAIL");

		}

		// select Pass option from documents drop down
		public AjsNBDVendorsPage click_pass_option_from_documents_dropdown() {
			wait_until(3);
			return select_by_name(documents_dropdown, "PASS");

		}

		// select N/A option from documents drop down
		public AjsNBDVendorsPage click_na_option_from_documents_dropdown() {
			wait_until(3);
			return select_by_name(documents_dropdown, "N/A");

		}

		// select Alert option from documents drop down
		public AjsNBDVendorsPage click_alert_option_from_documents_dropdown() {
			wait_until(3);
			return select_by_name(documents_dropdown, "ALERT");

		}

		// select Add appointment option from actions drop down
		public AjsNBDVendorsPage click_add_appointment_option_from_action_dropdown() {
			wait_until(3);
			return select_by_name(select_actions_dropdown, "Add Appointment");

		}

		// verify add appointment accordian text on add appointment page
		public AjsNBDVendorsPage verify_add_appointment_accordian_text(String msg) {
			wait_until(10);
			return verify_element_by_text(add_appointment_accordian, msg);
		}

		// verify fail text in documents column on vendors page
		public AjsNBDVendorsPage verify_fail_text_in_documents_column(String msg) {
			wait_until(10);
			return verify_element_by_text(fail_text, msg);

		}

		// verify pass text in documents column on vendors page
		public AjsNBDVendorsPage verify_pass_text_in_documents_column(String msg) {
			wait_until(10);
			return verify_element_by_text(pass_text, msg);

		}

		// verify na text in documents column on vendors page
		public AjsNBDVendorsPage verify_na_text_in_documents_column(String msg) {
			wait_until(10);
			return verify_element_by_text(na_text, msg);

		}

		// verify alert text in documents column on vendors page
		public AjsNBDVendorsPage verify_alert_text_in_documents_column(String msg) {
			wait_until(10);
			return verify_element_by_text(alert_text, msg);

		}
		
		public AjsNBDVendorsPage press_enter() {
			AjsCommonUtilities c = new AjsCommonUtilities();
			wait_until(2);
			c.pressEnter();
			wait_until(3);
			return this;
		}
		
		// verify accordion text on vendors registered page
		 public AjsNBDVendorsPage verify_vendors_registered_header_text(String msg){
				return verify_element_by_text(vendors_accordian, msg);
		 }
}
