package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class SupportCenterPage extends CMAbstractPage<SupportCenterPage>{

	private By supportcenterpage_contains = By.xpath(".//div[@id='hpSupportOview']/h2/a"); //healthcare provider support
	
	
	//AD: Verify "healthcare provider support" text on Support Center 
	public SupportCenterPage verify_text_on_support_center_page(String msg){
		return verify_element_by_text(supportcenterpage_contains, msg);
 }
}
