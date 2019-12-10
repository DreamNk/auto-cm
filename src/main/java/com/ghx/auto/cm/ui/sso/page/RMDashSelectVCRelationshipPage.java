package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class RMDashSelectVCRelationshipPage extends CMAbstractPage<RMDashSelectVCRelationshipPage> {

	private By searchVC = By.id("namebox");
	private By continueButton = By.xpath("//*[contains(@value,'Continue')]");
	private By selectVCRadioButton = By.xpath(".//*[@id='reportObject']/tbody/tr/td[1]/input");
	private By deleteVCbutton = By.xpath("//*[contains(@name,'_eventId_deleteVC')]");
	private By deleteButton = By.xpath("//*[contains(@name,'_eventId_delete')]");

	private By errorMessageAfterSearch = By.xpath("html/body/form/table/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table/tbody/tr[10]/td/span");
	private By returnToDashboardButton = By.xpath("//*[contains(@name,'_eventId_dashboard')]");
	
	
// Enter VC for in search field// 
	public RMDashSelectVCRelationshipPage enter_VC_name(String vc_name ) {
		enter(searchVC, vc_name);
		return this;
	}	
		
// Click on Continue button	
	public RMDashSelectVCRelationshipPage click_continue_button() {
			click_button(continueButton);
			return this;
		}
	
// Select VC
	public RMDashSelectVCRelationshipPage select_VC_radio_button() {
		click_button(selectVCRadioButton);
		return this;
	}
	
// Click on Delete VC button
	
	public RMDashSelectVCRelationshipPage click_delete_VC_button() {
		click_button(deleteVCbutton);
		return this;
	}
	
	// Click on Delete button
	
		public RMDashSelectVCRelationshipPage click_delete_button() {
			click_button(deleteButton);
			return this;
		}
		
	// Verify the Deleted VC	
		public RMDashSelectVCRelationshipPage verify_deleted_VC_search_alert(){
			wait_until(3);
			return verify_element_by_text(errorMessageAfterSearch, "No VCRelations were found for this vendor.");
		}
		
	// Click on Return to dashboard button
		public RMDashSelectVCRelationshipPage click_return_dashboard_button() {
			click_button(returnToDashboardButton);
			return this;		
	}
	 		
}
