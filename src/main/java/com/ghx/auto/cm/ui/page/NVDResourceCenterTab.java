package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NVDResourceCenterTab extends CMAbstractPage<NVDResourceCenterTab>{

          
	      
	private By resource_center_tab = By.id("resourcecenter");

	// locators to expand accordions//
	private By vendor_admin_resources_accordion = By.id("resourceCenterTabContentAccordion-1-label");
	private By vendor_rep_resources_accordion = By.id("resourceCenterTabContentAccordion-2-label");
	private By vendormate_admin_resources_accordion = By.id("resourceCenterTabContentAccordion-3-label");
	private By health_system_policies_library_accordion = By.id("resourceCenterTabContentAccordion-5-label");

	// locators of accordion contents//

	private By select_health_system = By.id("healthSystems");
	private By dropdown_button_in_health_system = By.id("healthSystems");
	private By download_policies = By.id("allPoliciesDownloadLink");
	private By text_select_health_system = By.xpath(".//div[@id='healthSystemPoliciesDiv']/div[2]/div[1]/span[1]/label");

	// locator of files in the accordions//
	private By text_of_vendor_admin_resource_file = By.xpath(".//div[@id='pageContainer1']/div[2]/div[1]"); 
	private By text_of_vendor_rep_resource_file = By.xpath(".//div[@id='pageContainer1']/div[2]/div[1]");
	private By text_of_vendormate_rep_resource_file = By.xpath(".//div[@id='pageContainer1']/div[2]/div[15]");
																	
        
          
         
	public NVDResourceCenterTab click_resources_center_tab() {
		return click_button(resource_center_tab);
	}
	public NVDResourceCenterTab click_vendormate_rep_resources_content(
			String resource) {
		By vendormate_rep_resources = By.linkText(resource);
		return click_button(vendormate_rep_resources);
}
	public NVDResourceCenterTab click_vendor_admin_resources_accordion() {
		return click_button(vendor_admin_resources_accordion);
	}
	public NVDResourceCenterTab click_vendor_rep_resources_accordion() {
		return click_button(vendor_rep_resources_accordion);
	}
	public NVDResourceCenterTab click_vendormate_admin_resources_accordion() {
		return click_button(vendormate_admin_resources_accordion);
	}
	public NVDResourceCenterTab click_health_system_policies_library_accordion() {
		return click_button(health_system_policies_library_accordion);
	}
	public NVDResourceCenterTab verify_if_resource_is_present_on_the_grid(
			String link) {
		wait_until(5);
		 boolean resource_file = is_element_exist(By.linkText(link));
		    Assert.assertEquals(true, resource_file);
		    return this;
		    }
	
	public NVDResourceCenterTab verify_if_resource_is_not_present_on_the_grid(
			String link) {
		wait_until(5);
		 boolean resource_file = is_element_exist(By.linkText(link));
		    Assert.assertEquals(false, resource_file);
		    return this;
		    }
	
    public NVDResourceCenterTab verify_health_system_policies_element(String msg) {
		wait_until(5);
		return verify_element_by_text(select_health_system, msg);
    }
	public NVDResourceCenterTab verify_vendor_admin_resources_file(String msg) {
		wait_until(5);
		return verify_element_by_text(text_of_vendor_admin_resource_file, msg);
	}
	public NVDResourceCenterTab verify_vendormate_admin_resources_file() {
		wait_until(5);
		return verify_page_title();
	}
	public NVDResourceCenterTab verify_vendormate_rep_resources_file(String msg) {
		wait_until(5);
		return verify_element_by_text(text_of_vendormate_rep_resource_file, msg);
	}
	public NVDResourceCenterTab verify_vendor_rep_resources_file(String msg) {
		wait_until(5);
		return verify_element_by_text(text_of_vendor_rep_resource_file, msg);
	}

//Health System Policies Library accordion
          
	public NVDResourceCenterTab select_health_system(String health_system) {
		return select_by_name(dropdown_button_in_health_system, health_system);
	}
	public NVDResourceCenterTab click_download_all_policies() {
		wait_until(3);
		return click_button(download_policies);
	}
	
	public NVDResourceCenterTab verify_text_in_health_system_policies_accordion(String msg) {
		wait_until(5);
		return verify_element_by_text(text_select_health_system, msg);
	}
}
