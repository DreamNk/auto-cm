package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NVDExtrasPage extends CMAbstractPage<NVDExtrasPage>{
	
	private By vendormateCredentialingMobile = By.xpath(".//*[@id='containerFixed']/div[4]/div/div/div[1]/div[2]/div/div[1]/a/img");
	private By vendormateCredentialingSupplierProducts = By.linkText("Supplier Solutions");
	private By vendormateCredentialingText = By.xpath("html/body/div[1]/div/div/div[1]/nav/div[1]/div/div/ul/li[6]/a");

	
	
	public NVDExtrasPage click_vendormate_credentialing_mobile(){
		wait_until(1);
		return click_button(vendormateCredentialingMobile);
	}	
	
	public NVDExtrasPage verify_vendormate_credentialing_mobile_text(){
		wait_until(3);
	    return verify_element_by_text(vendormateCredentialingSupplierProducts, "Supplier Solutions") ;
	}

	public NVDExtrasPage verify_vendormate_credentialing_text(){
		wait_until(2);
		return verify_element_by_text(vendormateCredentialingText, "My Profile");
	}
}
