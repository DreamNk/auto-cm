package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDGuestPassPage extends CMAbstractPage<NBDGuestPassPage> {

	private By reasonForGuestBadge= By.xpath("//*[@name='guestPassReason']");
	private By printGuestBagde=By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[2]/div/accordion/div/div/div[2]/div/div/div/div[5]/div[3]/form/div[2]/div/button[2]");   
	private By limitedGuestBadgemsg = By.xpath("//*[@id='containerFixed']/div[5]/div/div/div[1]/div[2]/div/accordion/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/div");
	private By guestBadgeNotPrintMessage = By.cssSelector("#containerFixed > div.container-fluid.bodyStarts.maincontainer > div > div > div:nth-child(1) > div.row.ng-scope > div > accordion > div > div > div.panel-collapse.in.collapse > div > div > div > div.ng-scope > div:nth-child(3) > p");
	private By ReturnToSignInPageButton1 = By.xpath("//*[@id='containerFixed']/div[5]/div/div/div[1]/div[2]/div/accordion/div/div/div[2]/div/div/div/div[5]/div[2]/div[2]/div/button");
	private By ReturnToSignInPageButton2 = By.xpath("//*[contains(@name,'printGuestPassForm')]/div/div/button");													
	
		  public NBDGuestPassPage click_resaon_for_printing_guest_badge(){
		   click(reasonForGuestBadge);
		    wait_until(2);
		    return this;
		  }
		  
		  public NBDGuestPassPage enter_reason_for_guest_badge(String text_reason) {
		    wait_until(2);
		    enter(reasonForGuestBadge, text_reason);
		    wait_until(2);
		    return this;
		   }
		
		  public NBDGuestPassPage click_print_guest_badge_button() {
		    click(printGuestBagde);
		    wait_until(2);
		    return this;
		   }
		  
		  public NBDGuestPassPage verify_limited_guest_badge_message(String text) {
		   verify_element_by_text(limitedGuestBadgemsg, text);
		   return this;
		  }
		  //5
		  public NBDGuestPassPage click_return_to_signIn_page_button() {
		   // click(ReturnToSignInPageButton);//
			 
			  boolean locator1_selected = is_element_displayed(ReturnToSignInPageButton1);
				if (locator1_selected == true){		
				click(ReturnToSignInPageButton1);
				}
				else 
					{
				    	click(ReturnToSignInPageButton2);
				 
					}
				
			return this;
		   }
			
		  public NBDGuestPassPage verify_for_guest_pass_not_printed_error_message(String text){
		  verify_element_by_text(guestBadgeNotPrintMessage, text);
		   return this;
		  }

}
