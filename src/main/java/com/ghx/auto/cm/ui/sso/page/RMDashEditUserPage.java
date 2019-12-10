package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashEditUserPage extends CMAbstractPage<RMDashEditUserPage> {
	
    //Search Rep User----------------------------------------------------------------------
	private By repEmailTextbox = By.xpath("//*[contains(@name,'email')]");
	private By repNameTextbox = By.xpath("//*[contains(@name,'name')]");
	private By taxIdTextbox = By.xpath("//*[contains(@name,'taxId')]");
	private By vendorNameTextbox = By.xpath("//*[contains(@name,'vendorName')]");
	private By vendorDashLink = By.xpath("//*[contains(@target,'RMDash_Impersonation')]");
	private By searchRepUserButton = By.id("_eventId_repcomplete");
	private By cancelButton = By.xpath("//*[contains(@value,'Cancel')]");
	private By deleteUserButton = By.xpath("//*[contains(@value,'Delete User')]");
	private By enterNotes = By.xpath("//*[contains(@name,'user.userNotes')]");
	private By complete = By.xpath("//*[contains(@value,'Complete')]");		// change Locator to Complete during Merging//
	
	//Search Buyer User---------------------------------------------------------------------
	private By buyerEmailTextbox = By.xpath("//*[contains(@name,'buyerEmail')]");
	private By buyerNameTextbox = By.xpath("//*[contains(@name,'buyerName')]");
	private By customerTextbox = By.xpath("//*[contains(@name,'customer')]");
	private By searchStringTextbox  = By.xpath("//*[contains(@name,'buyerSearchString')]");
	private By searchBuyerUsersButton = By.id("_eventId_buyercomplete");
	private By includeInactiveBuyersCheckbox = By.xpath("//*[contains(@name,'includeInactiveBuyerUsers')]");



	public RMDashEditUserPage enter_rep_email(String email) {
		enter(repEmailTextbox, email);
		wait_until(3);
		return this;
	}

	public RMDashEditUserPage enter_rep_name(String name) {
		enter(repNameTextbox, name);
		wait_until(3);
		return this;
	}

	public RMDashEditUserPage enter_tax_id(String tax_id) {
		enter(taxIdTextbox, tax_id);
		wait_until(3);
		return this;
	}

	public RMDashEditUserPage enter_vendor_name(String vendor_name) {
		enter(vendorNameTextbox, vendor_name);
		wait_until(3);
		return this;
	}

	public RMDashEditUserPage click_on_rep_id(String rep_id) {
		click_link(By.linkText(rep_id));
		wait_until(3);
		return this;
	}

	public RMDashEditUserPage click_vendordash_link() {
		click_link(vendorDashLink);
		wait_until(3);
		return this;
	}

	public RMDashEditUserPage click_search_rep_user_button() {
		click_button(searchRepUserButton);
		wait_until(2);
		return this;
	}
	
	public RMDashEditUserPage enter_buyer_email(String email) {
		enter(buyerEmailTextbox, email);
		wait_until(3);
		return this;
	}
	
	public RMDashEditUserPage enter_buyer_name(String email) {
		enter(buyerNameTextbox, email);
		wait_until(3);
		return this;
	}
	
	public RMDashEditUserPage click_search_buyer_user_button() {
		click_button(searchBuyerUsersButton);
		wait_until(2);
		return this;
	}
	
	public RMDashEditUserPage click_on_buyer_id(String buyer_id) {
		click_link(By.linkText(buyer_id));
		wait_until(5);
		return this;
	}
	
	public RMDashEditUserPage click_cancel_button() {
		click_button(cancelButton);
		wait_until(1);
		return this;
	}
	
	public RMDashEditUserPage click_delete_user_button() {
		click_button(deleteUserButton);
		wait_until(1);
		return this;	
	}
	
	public RMDashEditUserPage enter_notes(String Notes){
		enter(enterNotes, Notes);
		wait_until(1);
		return this;
	}
	public RMDashEditUserPage click_complete_button() {
		click_button(complete);
		wait_until(1);
		return this;	
		
	}
}
