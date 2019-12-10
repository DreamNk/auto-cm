package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashLandingPage extends CMAbstractPage<RMDashLandingPage> {
	
	
	private By vrprReport = By.xpath("//*[contains(text(),'Vendor Rep Profile Report')]");
	private By logOut = By.xpath("//*[contains(@href,'logout.do')]");
	private By editUserLink = By.xpath("//*[contains(text(),'Edit User')]");
	private By cpmSupportLink = By.xpath("//a[contains(text(),'CPM Support')]");
	private By editCustomer = By.xpath("//a[contains(text(),'Edit Customer')]");
	private By grplink = By.linkText("Global Profile Management");
	private By vendorSearchLink = By.linkText("Vendor Search");

	
	public RMDashLandingPage click_vrpr_report() {
		click_button(vrprReport);
		wait_until(3);
		return this;
	}
	
	public RMDashLandingPage click_logout() {
		click_link(logOut);
		wait_until(5);
		return this;
	}
	
	public RMDashLandingPage click_edit_user_link() {
		click_link(editUserLink);
		wait_until(2);
		return this;
	}
	
	public RMDashLandingPage click_cpm_support_link() {
		click_link(cpmSupportLink);
		wait_until(2);
		return this;
	}
	
	public RMDashLandingPage click_edit_customer_link() {
		click_link(editCustomer);
		wait_until(2);
		return this;
	}
	public RMDashLandingPage click_vendor_search_link() {
		wait_until(2);
		return click_link(vendorSearchLink);		
		
	}

	public RMDashLandingPage click_GRP_link(){
		wait_until(2);
		click_link(grplink);
		wait_until(2);
		return this;
	}

}
