package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDTermsOfUsePage extends CMAbstractPage<NBDTermsOfUsePage>{
	
	private By termsOfUse = By.linkText("Terms of use");
	private By termsOfUseText = By.xpath(".//div[@class='row']/div[1]/h1");
	
	public NBDTermsOfUsePage click_terms_of_use_link(){
		wait_until(2);
		return click_link(termsOfUse);
	}
	
	public NBDTermsOfUsePage verify_terms_of_use_text(){
		wait_until(2);
		return verify_element_by_text(termsOfUseText, "Vendormate Terms of Use");
	}

}
