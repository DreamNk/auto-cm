package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class CPMHomePage extends CMAbstractPage<CPMHomePage>{
	
	private By pcmSupportTab = By.xpath(".//*[@id='navbar-collapse']/ul/li[2]/a");
	private By vendormateCredentialingHeaderText = By.id("headerAppName");
	private By crmSupportTab = By.xpath(".//div[@id='navbar-collapse']/ul/li[3]/a");
	private By crmDashboard = By.xpath(".//div[@id='navbar-collapse']/ul/li[3]/ul/li[1]/a");
	private By cpmHeaderUserName = By.xpath(".//*[@id='headerUsername']/div/div");
	private By logOut = By.id("headerLogout");
			
	// This method clicks PCM Support tab for pcm navigation 
	public CPMHomePage click_pcm_support_tab(){
		//wait_until(ExpectedConditions.visibilityOfElementLocated(pcmSupportTab));
		wait_until(5);
		return click_button(pcmSupportTab);
	}

	// This method verify CPM Header Text
	public CPMHomePage verify_cpm_header_text(){
		wait_until(5);
		return verify_element_by_text(vendormateCredentialingHeaderText, "Vendormate Credentialing");
	}
	
	// This method click CRM support tab
	public CPMHomePage click_crm_support_tab(){
		wait_until(5);
		return click_button(crmSupportTab);
	}
	
	// This method click CM RM dashboard
	public CPMHomePage click_crm_dashboard(){
		wait_until(5);
		click(crmDashboard);
		
		return this;
	}
	
	// This method click CPM Header user name
	public CPMHomePage click_cpm_header_name(){
		wait_until(5);
		return click_button(cpmHeaderUserName);
	}
	
	// This method click Log out button of CPM
	public CPMHomePage click_log_out(){
		click_button(logOut);
		return wait_until(3);
	}
	
}
