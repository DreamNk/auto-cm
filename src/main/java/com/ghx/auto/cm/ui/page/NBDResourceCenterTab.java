package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NBDResourceCenterTab extends CMAbstractPage<NBDResourceCenterTab>{


private By resource_center_tab = By.xpath(".//div[@id='mainTab']/ul/li[9]/a/em");
private By global_user_resources_accordion = By.id("resourceCenterTabContentAccordion-2-label");
private By customer_admin_resources_accordion = By.id("resourceCenterTabContentAccordion-3-label");
private By customer_user_resources_accordion = By.id("resourceCenterTabContentAccordion-4-label");
private By health_system_policies_accordion = By.id("resourceCenterTabContentAccordion-5-label");



public NBDResourceCenterTab click_resources_center_tab() {
	return click_button(resource_center_tab);
}
public NBDResourceCenterTab click_global_user_resources_accordion() {
	return click_button(global_user_resources_accordion);
}
public NBDResourceCenterTab click_customerr_user_resources_accordion() {
	return click_button(customer_user_resources_accordion);
}
public NBDResourceCenterTab click_customer_admin_resources_accordion() {
	return click_button(customer_admin_resources_accordion);
}
public NBDResourceCenterTab click_health_system_policies_accordion() {
	return click_button(health_system_policies_accordion);
}
public NBDResourceCenterTab verify_if_resource_is_present_on_the_grid(
		String link) {
	wait_until(5);
	 boolean resource_file = is_element_exist(By.linkText(link));
	    Assert.assertEquals(true, resource_file);
	    return this;
	    }

public NBDResourceCenterTab verify_if_resource_is_not_present_on_the_grid(
		String link) {
	wait_until(5);
	 boolean resource_file = is_element_exist(By.linkText(link));
	    Assert.assertEquals(false, resource_file);
	    return this;
	    }







}