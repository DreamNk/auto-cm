package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashVendorSearchPage extends CMAbstractPage<RMDashVendorSearchPage>{

	private By vendorName = By.id("namebox");
	private By radioBox1 = By.xpath("//*[contains(@type,'radio')]");
	private By findVCRelations = By.xpath("//*[contains(@value,'Find VC Relation(s)')]");
	private By Submit = By.id("_eventId_search");
	// Added by Mr
	private By returnToDashboardButton = By.xpath("//*[contains(@name,'_eventId_dashboard')]");
	private By logOut = By.linkText("log out");

	// Enter Vendor Name	
	public RMDashVendorSearchPage enter_vendor_name(String Vname) {
		return enter(vendorName, Vname);
	}
		
	// Click Vendor Search Button
	public RMDashVendorSearchPage click_search_Vendor() {
		click_button(Submit);
		return wait_until(5);
	}
		
	// Click Radio Button
	public RMDashVendorSearchPage click_radio_button() {
		click_button(radioBox1);
		return wait_until(5);
	}	
		
	// Click Radio Button
	public RMDashVendorSearchPage click_find_vc_relation() {
		click_button(findVCRelations);
		return wait_until(5);
	}
	
	//Click Return to dashboard link
	public RMDashVendorSearchPage click_return_to_dashboard() {
		click_button(returnToDashboardButton);
		return wait_until(5);
	}
	public RMDashVendorSearchPage click_log_out() {
		click_button(logOut);
		return wait_until(5);
	}
}
