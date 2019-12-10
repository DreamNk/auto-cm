package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDMyDocumentsPage extends CMAbstractPage<NVDMyDocumentsPage> {
	
	//Common Documents tab----------------------------------------------------------------------------------
	private By deleteLink1stInCommonDoc = By.xpath("(//a[contains(text(),'Delete')])");
	private By deleteButtonOnPopup = By.xpath("//*[contains(@id,'deleteSuccess')]");
	private By commonDocumentsTab = By.xpath("//*[contains(text(),'Common Documents')]");
	private By commonDocumentOPVCSharable = By.xpath(".//*[@id='commonDocuments']/div[2]/div/table/tbody/tr/td[2]/span/span");

	//Account Specific Documents tab------------------------------------------------------------------------
	private By accountSpecificDocumentsTab = By.xpath("//*[contains(text(),'Account Specific Documents')]");
	private By accountSpecificDocumentBusinessLicense = By.xpath(".//*[@id='accountSpecDocumentGrid']/div[2]/div[2]/table/tbody/tr/td[2]/span");
	private By uploadLink1stInAccountSpecific = By.xpath("(//a[contains(text(),'Upload')])[1]");
	private By uploadLink2ndInAccountSpecific = By.xpath("(//a[contains(text(),'Upload')])[2]");
	private By uploadLink3rdInAccountSpecific = By.xpath("(//a[contains(text(),'Upload')])[3]");
	
	// Optional Document tab--------------------------------------------------------------------------------
	private By optionalDocumentsTab = By.xpath("//*[contains(text(),'Optional Documents')]");
	private By optionalDocBadgePhoto = By.xpath(".//*[@id='documentlist']/div[2]/div[2]/table/tbody/tr/td[2]/span/span");
	// Share Credentials -----------------------------------------------------------------------------------
	private By shareCredentialsButton = By.id("shareCredentialsBtn");
	
	//Upload document pop-up in My Documents page------------------------------------------------------------
	private By effectiveDate = By.xpath("//*[contains(@name,'effectiveDate')]");
	private By expirationDate = By.xpath("//*[contains(@name,'expirationDate')]");
	private By saveButton = By.xpath("//*[contains(text(),'Save')]");
	private By monthAndYearSelector = By.xpath("//*[contains(@ng-click,'toggleMode()')]");
	private By continueButton = By.xpath("//*[contains(@id,'cautionContinue')]");

	public NVDMyDocumentsPage click_delete_link() {
		click_link(deleteLink1stInCommonDoc);
		return wait_until(2);
	}
	
	public NVDMyDocumentsPage click_delete_button() {
		click_link(deleteButtonOnPopup);
		return wait_until(2);
	}
	public NVDMyDocumentsPage click_common_documents_tab_subtab() {
		click_button(commonDocumentsTab);
		return wait_until(2);
	}
	
	public NVDMyDocumentsPage verify_common_document_opvc_sharable(String companyDoc){
		wait_until(1);
		return verify_element_by_text(commonDocumentOPVCSharable, companyDoc);
	}
	
	public NVDMyDocumentsPage click_account_specific_documents_subtab() {
		click_button(accountSpecificDocumentsTab);
		return wait_until(2);
	}
	
	public NVDMyDocumentsPage veirfy_account_specific_document_text(String accountSpecificDoc){
		wait_until(1);
		return verify_element_by_text(accountSpecificDocumentBusinessLicense, accountSpecificDoc);
	}
	
	public NVDMyDocumentsPage click_optional_documents_tab(){
		wait_until(1);
		return click_button(optionalDocumentsTab);
	}

	public NVDMyDocumentsPage veirfy_optional_doc_badge_photo_text(String badgePhoto){
		wait_until(1);
		return verify_element_by_text(optionalDocBadgePhoto, badgePhoto);
	}
	
	public NVDMyDocumentsPage verify_share_credentials_button(String shareCredentials){
		wait_until(1);
		return verify_element_by_text(shareCredentialsButton, shareCredentials);
	}
	
	public NVDMyDocumentsPage click_upload_link_of_1st_doc() {
		click_button(uploadLink1stInAccountSpecific);
		return wait_until(2);

	}

	public NVDMyDocumentsPage click_upload_link_of_2nd_doc() {
		return click_button(uploadLink2ndInAccountSpecific);
	}

	public NVDMyDocumentsPage click_upload_link_of_3rd_doc() {
		return click_button(uploadLink3rdInAccountSpecific);
	}

	// upload doc pop-up----------------------------------------------------------------------------------------

	public NVDMyDocumentsPage enter_effective_date(String mm_dd_yy) {
		wait_until(1);
		return enter(effectiveDate, mm_dd_yy);

	}

	public NVDMyDocumentsPage enter_expiration_date(String mm_dd_yy) {
		wait_until(1);
		return enter(expirationDate, mm_dd_yy);

	}
	

	public NVDMyDocumentsPage click_save_button() {
		click(saveButton);
		return wait_until(3);

	}

	public NVDMyDocumentsPage click_continue_button() {
		wait_until(2);
		return click(continueButton);
	}

}
