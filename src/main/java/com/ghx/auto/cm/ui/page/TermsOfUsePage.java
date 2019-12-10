package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class TermsOfUsePage extends CMAbstractPage<TermsOfUsePage>{

	private By termsofusepage_contains = By.xpath(".//div[@id='pageContainer1']/div[2]/div[14]"); //1. ACCEPTANCE OF TERMS. Vendormate makes available for your use on this web site (the "Site") infor
    
	
	//AD: Verify "IHaveReadAndUnderstood" text on terms of use page
	public TermsOfUsePage verify_text_on_terms_of_use_page(String msg){
		return verify_element_by_text(termsofusepage_contains, msg);
	 }
	
}
