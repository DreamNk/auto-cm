package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDMyDocumentPage extends CMAbstractPage<NVDMyDocumentPage>{

	private By my_document_tab = By.id("mydocuments");
	private By account_specific_document_tab = By.xpath(".//div[@id='requiredDocumentsContentDiv']/ul/li[2]/a/em");
	private By view_account_link_common_doc = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr/td[5]/div/span/a");
	private By verify_common_doc_account = By.xpath(".//div[@id='viewAccountsDialogContent_Content']/table/tbody[3]/tr/td/div");
	private By optional_doc_tab = By.xpath(".//div[@id='requiredDocumentsContentDiv']/ul/li[3]/a/em");
	private By view_account_link_accountspecific_doc = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[1]/td[5]/div/span/a");
	private By verify_accountspecific_doc_account = By.xpath(".//div[@id='viewAccountsDialogContent']/table/tbody[3]/tr/td/div");
	private By view_account_link_optional_doc = By.xpath(".//div[@id='otherDocumentsContentDiv_Content']/table/tbody[3]/tr[3]/td[5]/div/span");
	private By verify_optional_doc_account = By.xpath(".//div[@id='viewAccountsDialogContent']/div[2]/table/tbody[3]/tr/td/div");
	private By close_popup = By.linkText("Close");
	private By view_account_link_policies = By.xpath(".//div[@id='policesAndAckContentDiv_Content']/table/tbody[3]/tr[1]/td[4]/div/span/a");
	private By verify_policies_account = By.xpath(".//div[@id='viewAccountsDialogContent']/table/tbody[3]/tr/td/div");
	private By share_credential_button = By.id("confirmSaveSup");
	private By verify_sharable_doc = By.xpath(".//div[@id='allCredentialsDocuments']/div/span");
	private By back_to_my_document_link = By.linkText("back to My Documents");
	
//Upload Doc---------------------------------------------------------------------
	private By upload_link_in_common_docs = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[1]/td[2]/div/div/a");
	private By upload_link_in_account_specific_doc = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[1]/td[2]/div/div/a");
	private By continue_button_on_caution_popup = By.xpath(".//div[@id='docCautionContent']/div/span[2]/input[1]");
	private By cross_and_tick_image_in_2ndrow_of_common_doc = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[2]/td[1]/div/img");
	private By cross_and_tick_image_in_5throw_of_common_doc = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[5]/td[1]/div/img");

	private By cross_and_tick_image_in_3rdrow_of_common_doc = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[3]/td[1]/div/img");
	private By cross_and_tick_image_in_1strow_of_common_doc = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[1]/td[1]/div/img");
	private By cross_and_tick_image_in_2ndrow_of_account_specific_doc = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[2]/td[1]/div/img");
	private By cross_and_tick_image_in_3rdrow_of_account_specific_doc = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[3]/td[1]/div/img");
	private By cross_and_tick_image_in_4throw_of_account_specific_doc = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[4]/td[1]/div/img");
	private By cross_and_tick_image_in_1strow_of_account_specific_doc = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[1]/td[1]/div/img");
	private By second_delete_link_in_common_docs = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[2]/td[2]/div/div/a[4]");
	private By fifth_delete_link_in_common_docs = By.xpath(".//div[@id='sharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[5]/td[2]/div/div/a[4]");

	private By delete_button_in_popup_common_docs = By.id("delete.confirm.delete");
	private By forth_delete_link_in_account_specific_docs = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[4]/td[2]/div/div/a[4]");

	private By first_delete_link_in_account_specific_docs = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[1]/td[2]/div/div/a[4]");
	private By second_delete_link_in_account_specific_docs = By.xpath(".//div[@id='nonSharableRequiredDocumentDiv_Content']/table/tbody[3]/tr[2]/td[2]/div/div/a[4]");

	
	// verify green tick of 2nd Doc
	public NVDMyDocumentPage verify_green_tick_on_doc2_of_common_doc() {
		wait_until(2);
		return verify_element_attribute_value(
				cross_and_tick_image_in_2ndrow_of_common_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
		
	}
	
	// verify green tick of 5th Doc
		public NVDMyDocumentPage verify_green_tick_on_doc5_of_common_doc() {
			wait_until(2);
			return verify_element_attribute_value(
					cross_and_tick_image_in_5throw_of_common_doc, "src",
					"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
			
		}
	

	
	// verify green tick of 2nd Doc
		public NVDMyDocumentPage verify_green_tick_on_doc3_of_common_doc() {
			wait_until(2);
			return verify_element_attribute_value(
					cross_and_tick_image_in_3rdrow_of_common_doc, "src",
					"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
			
		}
	
	
	// verify green tick of 2nd Doc
	public NVDMyDocumentPage verify_cross_mark_on_doc2_of_common_doc() {
		wait_until(2);
		return verify_element_attribute_value(
				cross_and_tick_image_in_2ndrow_of_common_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/no.png");
		 
	}

	// verify green tick of 1st Doc
	public NVDMyDocumentPage verify_green_tick_on_doc1_of_common_doc() {
		wait_until(2);
		return verify_element_attribute_value(
				cross_and_tick_image_in_1strow_of_common_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
	}

	// verify green tick of 1st Doc
	public NVDMyDocumentPage verify_cross_mark_on_doc1_of_common_doc() {
		wait_until(2);
		return verify_element_attribute_value(cross_and_tick_image_in_1strow_of_common_doc, "src","https://vision.vendormate.net/vdbrc/images/icons/no.png");
		
	}

	// verify green tick of 2nd Doc
	public NVDMyDocumentPage verify_green_tick_on_doc2_of_account_specific_doc() {
		wait_until(2);
		return verify_element_attribute_value(cross_and_tick_image_in_2ndrow_of_account_specific_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
	}
	
	// verify green tick of 3rd Doc
		public NVDMyDocumentPage verify_green_tick_on_doc3_of_account_specific_doc() {
			wait_until(2);
			return verify_element_attribute_value(cross_and_tick_image_in_3rdrow_of_account_specific_doc, "src",
					"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
	}
		
	// verify green tick of 3rd Doc
		public NVDMyDocumentPage verify_green_tick_on_doc4_of_account_specific_doc() {
			wait_until(2);
			return verify_element_attribute_value(cross_and_tick_image_in_4throw_of_account_specific_doc, "src",
							"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
	}	
		
		
		

	// verify green tick of 2nd Doc
	public NVDMyDocumentPage verify_cross_mark_on_doc2_of_account_specific_doc() {
		wait_until(2);
		return verify_element_attribute_value(
				cross_and_tick_image_in_2ndrow_of_account_specific_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/no.png");
	}

	// verify green tick of 1st Doc
	public NVDMyDocumentPage verify_green_tick_on_doc1_of_account_specific_doc() {
		wait_until(2);
		return verify_element_attribute_value(
				cross_and_tick_image_in_1strow_of_account_specific_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/okay.png");
	}

	// verify green tick of 1st Doc
	public NVDMyDocumentPage verify_cross_mark_on_doc1_of_account_specific_doc() {
		wait_until(2);
		return verify_element_attribute_value(cross_and_tick_image_in_1strow_of_account_specific_doc, "src",
				"https://vision.vendormate.net/vdbrc/images/icons/no.png");
	}

	// Click continue buttion on the Caution popup of account specific doc sub
	// tab
	public NVDMyDocumentPage click_continue_button_on_caution_popup() {
		wait_until(2);
		return click_link(continue_button_on_caution_popup);
	}

	// click 1st document upload link in Common Documents sub tab
	public NVDMyDocumentPage click_upload_link_in_common_documents_subtab() {
		wait_until(2);
		return click_link(upload_link_in_common_docs);
	}

	// click 1st document upload link in account specific doc sub tab
	public NVDMyDocumentPage click_upload_link_in_account_specific_doc_subtab() {
		wait_until(2);
		return click_link(upload_link_in_account_specific_doc);
	}

	// Click My Documents Tab
	public NVDMyDocumentPage click_my_document_tab() {
		wait_until(7);
		return click_tab(my_document_tab);
	}

	

	// Click Account Specific Document Tab
	public NVDMyDocumentPage click_account_specific_document_tab() {
		wait_until(7);
		return click_tab(account_specific_document_tab);
	}

	// Click View Link Of Common Documents accordion in My Documents Tab
	public NVDMyDocumentPage click_view_account_link_of_common_doc() {
		wait_until(7);
		return click_link(view_account_link_common_doc);
	}

	// Verify the Account Name in the View popup of Common Documents
	public NVDMyDocumentPage verify_common_doc_account(String msg) {
		return verify_element_by_text(verify_common_doc_account, msg);
	}

	// Click Close Popup
	public NVDMyDocumentPage click_close_popup() {
		wait_until(7);
		return click_link(close_popup);
	}

	// Click View Link Of Account Specific Documents accordion in My Documents
	// Tab
	public NVDMyDocumentPage click_view_account_link_of_account_specific_doc_account() {
		return click_link(view_account_link_accountspecific_doc);
	}

	// Verify the Account Name in the View popup of Account Specific Documents
	// Accordion
	public NVDMyDocumentPage verify_account_specific_doc_account(String msg) {
		return verify_element_by_text(verify_accountspecific_doc_account, msg);
	}

	// Click Optional Document Accordion
	public NVDMyDocumentPage click_optional_doc_tab() {
		wait_until(7);
		return click_button(optional_doc_tab);
	}

	// Click View Link Of Optional Documents accordion in My Documents Tab
	public NVDMyDocumentPage click_view_account_link_optional_doc() {
		return click_link(view_account_link_optional_doc);
	}

	// Verify the Account Name in the View popup of Optional Documents Accordion
	public NVDMyDocumentPage verify_optional_doc_account(String msg) {
		wait_until(3);
		return verify_element_by_text(verify_optional_doc_account, msg);
	}

	// Click View Policies Link in My Documents Tab
	public NVDMyDocumentPage click_view_account_link_policies() {
		return click_link(view_account_link_policies);
	}

	// Verify the Account Name in the View Policies popup
	public NVDMyDocumentPage verify_policies_account(String msg) {
		return verify_element_by_text(verify_policies_account, msg);
	}

	// Click Share Credential Button
	public NVDMyDocumentPage click_share_credential_button() {
		wait_until(7);
		return click_button(share_credential_button);
	}

	// Verify Sharable Document on the Share Credential Page
	public NVDMyDocumentPage verify_sharable_doc(String msg) {
		return verify_element_by_text(verify_sharable_doc, msg);
	}

	// Click Back To My Document Link
	public NVDMyDocumentPage click_back_to_my_document_link() {
		wait_until(7);
		return click_link(back_to_my_document_link);
	}

	/**
	 *click the 1st record Delete link, in Common document subtab of My Documents tab
	 */
	public NVDMyDocumentPage click_delete_link_of_doc1_in_common_doc() {
		wait_until(7);
		return click_link(second_delete_link_in_common_docs);
	}
	
	
	/**
	 *click the 1st record Delete link, in Common document subtab of My Documents tab
	 */
	public NVDMyDocumentPage click_delete_link_of_doc5_in_common_doc() {
		wait_until(5);
		return click_link(fifth_delete_link_in_common_docs);
	}
	
	
	
	
		
	/**
	 * click Delete button in the popup of Common Document, when we click on delete link in My Documents tab
	 */
	public NVDMyDocumentPage click_delete_button_in_popup_common_docs() {
		wait_until(7);
		return click_button(delete_button_in_popup_common_docs);
	}
	
	/**
	 * click the 1st record Delete link, in account specific document subtab of My Documents tab
	 */
	public NVDMyDocumentPage click_delete_link_of_doc1_in_account_specific_doc() {
		wait_until(7);
		return click_link(first_delete_link_in_account_specific_docs);
	}
	
	/**
	 * click the 4th record Delete link, in account specific document subtab of My Documents tab
	 */
	public NVDMyDocumentPage click_delete_link_of_doc4_in_account_specific_doc() {
		wait_until(7);
		return click_link(forth_delete_link_in_account_specific_docs);
	}
	
	
	/**
	 * click the 2nd record Delete link, in account specific document subtab of My Documents tab
	 */
	public NVDMyDocumentPage click_delete_link_of_doc2_in_account_specific_doc() {
		wait_until(7);
		return click_link(second_delete_link_in_account_specific_docs);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
