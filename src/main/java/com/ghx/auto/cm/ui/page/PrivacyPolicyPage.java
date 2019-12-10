package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class PrivacyPolicyPage extends CMAbstractPage<PrivacyPolicyPage>{

	private By privacypoliciespage_contains = By.xpath(".//div[@id='pageContainer1']/div[2]/div[52]"); //Your choices for business information 

	//AD: Verify "Change To This Policy" text on privacy policies
	
	public PrivacyPolicyPage verify_text_on_privacy_policies_page(String msg){
		return verify_element_by_text(privacypoliciespage_contains, msg);
	 }
	
	
}
