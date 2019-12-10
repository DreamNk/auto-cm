package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class PCMBuyerDashPage extends CMAbstractPage<PCMBuyerDashPage> {

	private By contractingHeaderName = By.id("headerAppName");
	private By alertPopUpForPCM = By.xpath(".//*[@id='mainBody']/div[5]/div/div/div[3]/button");
	private By vendorManageWindow = By.xpath(".//*[@id='gBody']/div[2]/div/div[1]/div[1]/h1");
	
	// verify Contracting & compliance solution header name
	public PCMBuyerDashPage verify_contracting_and_compliance_name() {
		wait_until(10);
		return verify_element_by_text(contractingHeaderName, "Contracting & Compliance Solutions");
	}
	
	public PCMBuyerDashPage click_alert_pop_up_window(){
		wait_until(2);
		return click_button(alertPopUpForPCM);
	}
	
	public PCMBuyerDashPage verify_vendor_manage_window(){
		wait_until(2);
		return verify_element_by_text(vendorManageWindow, "Vendor Manager");
	}
	
}
