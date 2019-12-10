package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDManageRepsPage extends CMAbstractPage<NVDManageRepsPage> {

	private By accessRepAccounts = By.xpath(".//div[@class='panel-group']/div[1]/div[1]/h4/a/span/a");
	private By inviteReps = By.linkText("Invite Reps");
	private By inviteRepMailId = By.xpath(".//div[@class='table-responsive']/table/tbody[1]/tr/td[4]");
	private By inviterepFirstName = By.xpath(".//div[@class='table-responsive']/table/tbody[1]/tr/td[2]");
	private By inviteRepLastName = By.xpath(".//div[@class='table-responsive']/table/tbody[1]/tr/td[3]");
	
	private By accountName = By.xpath(".//div[@class='col-sm-6 col-md-6 col-lg-6']/div[2]/div[3]/table/tbody/tr/td[2]");
	
	private By shareStaffCredentials = By.xpath(".//div[@class='panel-group']/div[3]/div[1]/h4/a/span/a");
	private By shareCredentialsLink = By.linkText("Share");
	private By shareCredentialsMessage = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12']/div[2]");
	
	private By shareCredentialsTab = By.linkText(".//div[@class='panel-group']/div[4]/div[1]/h4/a/span/a");
	private By backtoShareStaffLink = By.xpath("//*[contains(@ui-sref,'manage.shareStaffCredentials')]");
	
	private By repAccountDetails = By.linkText("Rep Account Details");
	
	public NVDManageRepsPage verify_access_rep_accounts_text(){
		wait_until(1);
		return verify_element_by_text(accessRepAccounts, "Access Rep Accounts");
	}
	
	public NVDManageRepsPage click_invite_reps_tab(){
		wait_until(1);
		return click_button(inviteReps);
	}
	
	public NVDManageRepsPage verify_invite_rep_mail_id(String repMailId){
		wait_until(1);
		return verify_element_by_text(inviteRepMailId,repMailId);
	}
	
	public NVDManageRepsPage verify_invite_rep_first_name(String repFirstNm){
		wait_until(1);
		return verify_element_by_text(inviterepFirstName,repFirstNm);
	}
	
	public NVDManageRepsPage verify_invite_rep_last_name(String repLastNm){
		wait_until(1);
		return verify_element_by_text(inviteRepLastName,repLastNm);
	}
	
	public NVDManageRepsPage verify_account_name(String accNm){
		wait_until(1);
		return verify_element_by_text(accountName,accNm);
	}
	
	//share Staff credentials ..........................................
	public NVDManageRepsPage click_share_staff_credentials_tab(){
		wait_until(1);
		return click_button(shareStaffCredentials);
	}

	public NVDManageRepsPage verify_share_staff_credentials_text(){
		wait_until(1);
		return verify_element_by_text(shareStaffCredentials,"Share Staff Credentials");
	}
	
	public NVDManageRepsPage click_share_credentials_link(){
		wait_until(1);
		return click_link(shareCredentialsLink);
	}
	
	public NVDManageRepsPage verify_share_credentials_message(){
		wait_until(1);
		return verify_element_by_text(shareCredentialsMessage,"There are no Verified Credentials available to share.");
	}	
	
	// Share Credentials .............................................
	public NVDManageRepsPage click_share_credentials_tab(){
		wait_until(1);
		return click_button(shareCredentialsTab);
	}
	
	public NVDManageRepsPage click_back_to_share_staff_link(){
		wait_until(1);
		return click_link(backtoShareStaffLink);
	}
	
	public NVDManageRepsPage click_rep_account_details_tab(){
		wait_until(1);
		return click_link(repAccountDetails);
	}
	
	public NVDManageRepsPage verify_rep_account_details_text(){
		wait_until(1);
		return verify_element_by_text(repAccountDetails, "Rep Account Details");
		
	}
}
