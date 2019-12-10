package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDWebinarPage extends CMAbstractPage<NBDWebinarPage>{
	private By webinar_image = By.xpath(".//div[@id='rightHomecontentBottom']/div[2]/span[1]/label/a/img");
	private By vendormate_management_training_text = By.xpath(".//div[@id='block-system-main']/div/div/div/div/div/div/p[1]/strong/span/span");		

	// live webinar image link
public  NBDWebinarPage click_live_webinar_image_link(){
		
		return click_link(webinar_image);
	 }

	// verify text on webinar page
public NBDWebinarPage verify_vendormate_credential_manager_training_text(String msg){
	   return verify_element_by_text( vendormate_management_training_text, msg);
}
}
