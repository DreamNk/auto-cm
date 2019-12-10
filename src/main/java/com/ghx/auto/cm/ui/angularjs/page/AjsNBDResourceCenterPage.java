package com.ghx.auto.cm.ui.angularjs.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ghx.auto.cm.ui.page.NVDResourceCenterTab;
import com.ghx.auto.cm.ui.angularjs.page.AjsNBDResourceCenterPage;


public class AjsNBDResourceCenterPage extends CMAbstractPage<AjsNBDResourceCenterPage> {
	private By resource_center_tab = By.id("resourceCenter");
	private By global_user_resources_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[2]/div[1]");
	private By customer_admin_resources_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[3]/div[1]");
	private By customer_user_resources_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[4]/div[1]");
	private By health_system_policies_accordion = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[1]");


	// Health System policies
	private By dropdown_button_in_health_system = By.name("policyList");
	private By download_policies = By.id("DownloadAllPolicies");
	private By text_select_health_system = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[5]/div[2]/div/div/div/vision-action/div[1]/div[4]/div[1]/div/select/option[2]");
	private By view_single_policy_button = By.id("viewSinglePolicyBtn");

	public AjsNBDResourceCenterPage click_resources_center_tab() {
		return click_button(resource_center_tab);
	}
	
	public AjsNBDResourceCenterPage click_global_user_resources_accordion() {
		return click_button(global_user_resources_accordion);
	}
	
	public AjsNBDResourceCenterPage click_customerr_user_resources_accordion() {
		return click_button(customer_user_resources_accordion);
	}
	
	public AjsNBDResourceCenterPage click_customer_admin_resources_accordion() {
		return click_button(customer_admin_resources_accordion);
	}
	
	public AjsNBDResourceCenterPage click_health_system_policies_accordion() {
		return click_button(health_system_policies_accordion);
	}
	
	public AjsNBDResourceCenterPage verify_if_resource_is_present_on_the_grid(
			String link) {
		wait_until(5);
		 boolean resource_file = is_element_exist(By.linkText(link));
		    Assert.assertEquals(true, resource_file);
		    return this;
		    }

	public AjsNBDResourceCenterPage verify_if_resource_is_not_present_on_the_grid(
			String link) {
		wait_until(5);
		 boolean resource_file = is_element_exist(By.linkText(link));
		    Assert.assertEquals(false, resource_file);
		    return this;
		    }


	//Health System Policies Library accordion
    
	public AjsNBDResourceCenterPage select_health_system(String health_system) {
		return select_by_name(dropdown_button_in_health_system, health_system);
		}
	
	public AjsNBDResourceCenterPage click_download_all_policies() {
		wait_until(3);
		return click_button(download_policies);
	}

	public AjsNBDResourceCenterPage verify_text_in_health_system_policies_accordion(String msg) {
		wait_until(5);
		return verify_element_by_text(text_select_health_system, msg);
	}
	
	public AjsNBDResourceCenterPage click_view_single_policy() {
		wait_until(3);
		return click_button(view_single_policy_button);
	}
}





	
