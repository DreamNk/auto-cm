package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDResourceCenterPage extends CMAbstractPage<NBDResourceCenterPage>{
	
	private By globalAdminResources = By.xpath(".//div[@class='panel-group']/div[1]/div[1]/h4/a/span/a");
	private By adminResource = By.xpath(".//div[@class='panel-group']/div[1]/div[2]/div/div/div/vision-action/div[5]/div/a/span");
	
	private By globalUserResources = By.xpath(".//div[@class='panel-group']/div[2]/div[1]/h4/a/span/a");
	
	private By customerAdminResource = By.xpath(".//div[@class='panel-group']/div[3]/div[1]/h4/a/span/a");
	private By customerUserResources = By.xpath(".//div[@class='panel-group']/div[4]/div[1]");
	private By healtSystemPolicies = By.xpath(".//div[@class='panel-group']/div[5]/div[1]/h4/a/span/a");
	
	
	public NBDResourceCenterPage verify_global_admin_resource(){
		wait_until(1);
		return verify_element_by_text_continue(globalAdminResources, "Global Admin Resources");
	}
	
	public NBDResourceCenterPage verify_admin_resource(){
		wait_until(1);
		return verify_element_by_text_continue(adminResource, "Admin Resource");
	}
	
	public NBDResourceCenterPage verify_global_user_resource(){
		wait_until(1);
		return verify_element_by_text_continue(globalUserResources, "globalUserResources");
	}
	
	public NBDResourceCenterPage verify_customer_admin_resource(){
		wait_until(1);
		return verify_element_by_text_continue(customerAdminResource, "Wayne Healthcare Admin Resources");
	}
	
	public NBDResourceCenterPage verify_customer_user_resource(){
		wait_until(1);
		return verify_element_by_text_continue(customerUserResources, "Wayne Healthcare User Resources");
	}

	public NBDResourceCenterPage verify_health_system_policies(){
		wait_until(1);
		return verify_element_by_text_continue(healtSystemPolicies, "Health System Policies");
	}
}
