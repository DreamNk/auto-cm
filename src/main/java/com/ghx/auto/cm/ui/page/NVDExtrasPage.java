package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NVDExtrasPage extends CMAbstractPage<NVDExtrasPage> {

private By extras = By.id("extras");
private By vendormate_mobile = By.xpath(".//div[@id='extrasTabContent']/div/a[1]/img");
private By vendormate_purchase_plans = By.xpath(".//div[@id='extrasTabContent']/div/a[2]/img");
private By training_certifications = By.xpath(".//div[@id='extrasTabContent']/div/a[3]/img");
private By background_checks_and_drug_screens = By.xpath(".//div[@id='extrasTabContent']/div/a[4]/img");
private By contact_preferences = By.xpath(".//div[@id='extrasTabContent']/div/a[5]/img");
private By vendormate_mobile_page = By.xpath(".//div[@id='ghxFooter']/div/div/div/ul/li[2]/a");//Terms Of Use
private By vendormate_purchase_plan_page = By.xpath(".//div[@id='block-system-main']/div/div/div/div/div/table/tbody/tr[4]/td/ul/li[1]"); //Fee based on number of reps and risk levels
private By training_and_certifications_page = By.xpath(".//div[@id='content']/div[1]/div[1]/a[1]");//All Courses
private By background_checks_page = By.linkText("Products and pricing"); //for Vendormate vendors
private By contact_preferences_page = By.xpath(".//div[@id='container_EMAIL']/div/div");//Email*
 


public NVDExtrasPage click_vendormate_mobile(){
	return click_button(vendormate_mobile);
}

public NVDExtrasPage click_vendormate_purchase_plans(){
	wait_until(5);
	return click_button(vendormate_purchase_plans);
}

public NVDExtrasPage click_training_certifications(){
	return click_button(training_certifications);
}

public NVDExtrasPage click_background_checks_and_drug_screens(){
	return click_button(background_checks_and_drug_screens);
}

public NVDExtrasPage click_contact_preferences(){
	return click_button(contact_preferences);
}


public NVDExtrasPage verify_vendormate_mobile_page(String msg){
	wait_until(5);
	return verify_element_by_text(vendormate_mobile_page, msg);

}
	
public NVDExtrasPage verify_vendormate_purchase_plan_page(String msg){
	return verify_element_by_text(vendormate_purchase_plan_page, msg);

}

public NVDExtrasPage verify_training_and_certifications_page(String msg){
	return verify_element_by_text(training_and_certifications_page, msg);

}


public NVDExtrasPage verify_background_checks_page(String msg){
	wait_until(4);
	return verify_element_by_text(background_checks_page, msg);

}

public NVDExtrasPage verify_contact_preferences_page(String msg){
	return verify_element_by_text(contact_preferences_page, msg);

}

/*public NVD_Extras_page verifyTrainingCertificationsPage(){
	return verify_page_title();
	
}*/


public NVDExtrasPage click_extras_tab(){
	wait_until(5);
	return click_tab(extras);
}






}
