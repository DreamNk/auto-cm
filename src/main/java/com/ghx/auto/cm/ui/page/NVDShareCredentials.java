package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDShareCredentials extends CMAbstractPage<NVDShareCredentials> {


	private By my_document_tab = By.id("mydocuments");
	private By share_credentials_button = By.id("confirmSaveSup");
	private By select_all_checkbox = By.id("credentialName");
	private By share_button = By.xpath(".//div[@id='shareMyCredentialsAccordionDiv']/ul/li/div/div[2]/div[2]/div[2]/div[3]/span/input");
	private By first_name = By.id("shareCredentials.repShareCredentials.shareCredentialsHistory.inviteeFirstName");
	private By last_name = By.id("shareCredentials.repShareCredentials.shareCredentialsHistory.inviteeLastName");
	private By email = By.id("shareCredentials.repShareCredentials.shareCredentialsHistory.inviteeEmailId");
	private By Final_share_button = By.id("confirmInviteeShareCredentials");
	private By confirmation_message = By.xpath(".//div[@id='shareCredSentMsgDialogHeading']/h3");
	private By ok_button = By.xpath(".//div[@id='shareCredSentMsgDialogFooter']/div/span/div/button");
	private By back_button = By.id("backToListShareCredentialsDocumentsAnchor");
	private By download_button = By.xpath(".//div[@id='shareMyCredentialsAccordionDiv']/ul/li/div/div[2]/div[2]/div[2]/div[3]/div[2]/span/input");
	private By download_credentials_link= By.id("CredentialsDownloadZipAnchor");
	
	
	
	public NVDShareCredentials click_my_document_tab() {
		return click_button(my_document_tab);
	}

	public NVDShareCredentials click_share_credentials_button() {
		return click_button(share_credentials_button);
	}
 
	public NVDShareCredentials click_select_all_checkbox() {
		return click_button(select_all_checkbox);
	}

	public NVDShareCredentials click_share_button() {
		return click_button(share_button);
	}
	
	 public NVDShareCredentials enter_first_name(String password){
		return enter(first_name, password);
	}
	
	 public NVDShareCredentials enter_last_name(String password){
		return enter(last_name, password);
	}
	
	 public NVDShareCredentials enter_email(String password){
		return enter(email, password);
	}

	 public NVDShareCredentials click_final_share_button(){
		return click_button(Final_share_button);
	}

	 public NVDShareCredentials click_ok_button(){
		return click_button(ok_button);
	}
	 
	 public NVDShareCredentials verify_confirmation_message(String msg) {
		return verify_element_by_text(confirmation_message, msg);
	}

	 public NVDShareCredentials click_back_button(){
		return click_button(back_button);
	}
	 
	 public NVDShareCredentials click_download_button(){
		return click_button(download_button);
	}

	 public NVDShareCredentials click_download_credentials_link(){
		return click_button(download_credentials_link);
	}
}