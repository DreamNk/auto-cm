package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class PCMRMDashBoardPage extends CMAbstractPage<PCMRMDashBoardPage>{
	
	private By contractingAndComplianceHeadrerText = By.id("headerAppName");
	private By headerSwitcher = By.id("headerSwitcher");
	private By vendormateCredentialingLink = By.xpath("//div[@id='1']/ul/li/a/span");
	private By repositoryName = By.id("tables");
	
	public PCMRMDashBoardPage click_vendormate_credentialing_link(){
		//wait_until(ExpectedConditions.visibilityOfElementLocated(vendormateCredentialingLink));
		wait_until(5);
		return click_button(vendormateCredentialingLink);
	}

	public PCMRMDashBoardPage verify_contracting_and_compliance_headrer_text(){
		wait_until(3);
		return verify_element_by_text(contractingAndComplianceHeadrerText, "Contracting & Compliance Solutions");
	}
	
	public PCMRMDashBoardPage click_pcm_header_switcher(){
		wait_until(5);
		return click_button(headerSwitcher);
	}
	
	public PCMRMDashBoardPage verify_repository_text(){
		wait_until(3);
		return verify_element_by_text(repositoryName, "Repository");
	}
}
