package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDPrivacyPolicyPage  extends CMAbstractPage<NBDPrivacyPolicyPage> {

	private By policy = By.linkText("Privacy Policy");
	private By policy_text = By.xpath(".//div[@id='pageContainer1']/div[2]/div[5]");
	
	// click privacy policy footer link
	public  NBDPrivacyPolicyPage click_privacy_policy(){
		
		return click_link(policy);
	 }
	
	// verify text on privacy policy pdf
	public NBDPrivacyPolicyPage verify_policy_text(String msg){
		 
		return verify_element_by_text(policy_text, msg);
 }
}
