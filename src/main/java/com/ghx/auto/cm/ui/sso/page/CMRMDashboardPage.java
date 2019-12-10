package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class CMRMDashboardPage extends CMAbstractPage<CMRMDashboardPage> {
	
	private By rmHeaderText = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td/p/b[1]");
	private By cpmSupport = By.linkText("CPM Support");
	private By exchangeSupport = By.linkText("Exchange Support");
	private By userManagement = By.linkText("User Management");

	
	public CMRMDashboardPage verify_RM_header_text(String loggedInName){
		//wait_until(ExpectedConditions.visibilityOfElementLocated(rmHeaderText));
		wait_until(5);
		return verify_element_by_text(rmHeaderText, loggedInName);
	}
	
	public CMRMDashboardPage click_cpm_support_link(){
		return click_link(cpmSupport);
	}
	
	public CMRMDashboardPage click_exchange_support_link(){
		return click_link(exchangeSupport);
	}

	public CMRMDashboardPage click_user_management_link(){
		return click_link(userManagement);
	}

}
