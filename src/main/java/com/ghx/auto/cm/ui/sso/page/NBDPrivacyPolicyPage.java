package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDPrivacyPolicyPage extends CMAbstractPage<NBDPrivacyPolicyPage>{

	private By privacyPolicyLink = By.linkText("Privacy Policy");
	private By privacyPolicyText = By.xpath(".//div[@class='row']/div[1]/h1");
	
	public NBDPrivacyPolicyPage click_privacy_policy_link(){
		wait_until(2);
		return click_link(privacyPolicyLink);
	}
	
	public NBDPrivacyPolicyPage verify_privacy_policy_text(){
		wait_until(2);
		return verify_element_by_text(privacyPolicyText, "Vendormate Privacy Policy");
	}

}
