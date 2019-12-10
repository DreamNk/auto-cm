package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDSupportCenterPage extends CMAbstractPage<NBDSupportCenterPage> {
	private By support_center = By.linkText("Support Center");
	private By support_center_text = By.xpath(".//div[@id='block-system-main']/div/div/div/div/div/h1");
	
	// click support center link
	public  NBDSupportCenterPage click_support_center_link(){
		
		return click_link(support_center);
	 }
	
	//  verify text on support center page
	public NBDSupportCenterPage verify_support_center_text(String msg){
		 
		return verify_element_by_text(support_center_text, msg);
 }
}
