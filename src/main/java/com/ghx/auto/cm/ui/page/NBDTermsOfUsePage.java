package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDTermsOfUsePage extends CMAbstractPage<NBDTermsOfUsePage> {
	private By terms_of_use = By.linkText("Terms of Use");
	private By terms_of_use_text = By.xpath(".//div[@id='pageContainer1']/div[2]/div[3]");
	
	// click terms of use link
	public  NBDTermsOfUsePage click_terms_of_use_link(){
		
		return click_link(terms_of_use);
	 }
	
	// verify header text in terms of use pdf
	public NBDTermsOfUsePage verify_terms_of_use_text(String msg){
		 
		return verify_element_by_text(terms_of_use_text, msg);
 }
}
