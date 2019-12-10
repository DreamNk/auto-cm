package com.ghx.auto.cm.ui.page;

import org.openqa.selenium.By;

public class NBDOldKioskPage extends CMAbstractPage<NBDOldKioskPage> {
	
	private By click_here_button = By.className("vmBtnSubmit");
	private By corporate_email = By.name("email");
	private By print_badge_button = By.name("_eventId_submit");
	private By find_your_information = By.name("_eventId_findRepByEmail");
	private By first_name_field = By.name("firstName");
	private By last_name_field = By.name("lastName");
	private By phone_field = By.name("phone");
	private By company_name_field = By.name("companyName");
	private By visiting_contact_field = By.name("visitingContact");
	private By contact_title_field = By.name("contactTitle");
	private By purpose_field = By.name("purpose");
	private By department_to_be_visited = By.id("departmentOid");
	
	
	// Click on 'click here' button
		public	NBDOldKioskPage click_click_here_button(){
			return click_button(click_here_button);
	}

	// Enter corporate email
		public	NBDOldKioskPage enter_corporate_email(String id){
			return enter(corporate_email, id);
	}		
	
	// Click find your Information button
	    public	NBDOldKioskPage click_find_your_information(){
			return click_button(find_your_information);
	}

	// Click find your Information button
	    public	NBDOldKioskPage click_print_badge_button(){
			return click_button(print_badge_button);
	}
	    
	// Enter first name
		public	NBDOldKioskPage enter_first_name(String first_name){
			return enter(first_name_field, first_name);
	}
		
	// Verify first name
		public	NBDOldKioskPage verify_first_name(String first_name){
			return verify_element_attribute_value(first_name_field, "value", first_name);
	}		
		
	// Enter Last name
		public	NBDOldKioskPage enter_last_name(String last_name){
			return enter(last_name_field, last_name);
	}	
		
	// Enter Last name		
		public	NBDOldKioskPage verify_last_name(String last_name){
			return verify_element_attribute_value(last_name_field, "value", last_name);
	}	
				
	 
	// Enter Phone
		public	NBDOldKioskPage enter_phone_no(String phone_no){
			return enter(phone_field, phone_no);
	}	
	  
	// Verify Phone
		public	NBDOldKioskPage verify_phone_no(String phone_no){
			return verify_element_attribute_value(phone_field, "value", phone_no);
	}		
		
	// Enter company
		public	NBDOldKioskPage enter_company(String company){
			return enter(company_name_field, company);
	}
	
    // Verify company
		public	NBDOldKioskPage verify_company(String company){
			return verify_element_attribute_value(company_name_field, "value", company);
	}		
		
	// Enter visiting contact field
		public	NBDOldKioskPage enter_visiting_contact_field(String visiting_contact){
			return enter(visiting_contact_field, visiting_contact);
	}
		
	// verify visiting contact field
		public	NBDOldKioskPage verify_visiting_contact_field(String visiting_contact){
			return verify_element_attribute_value(visiting_contact_field, "value", visiting_contact);
	}		
		
    // Enter contact title field
		public	NBDOldKioskPage enter_contact_title_field(String contact_title){
			return enter(contact_title_field, contact_title);
	}
		
	// Verify contact title field
		public	NBDOldKioskPage verify_contact_title_field(String contact_title){
			return verify_element_attribute_value(contact_title_field, "value", contact_title);
	}		
		
    // Enter purpose of visit
		public	NBDOldKioskPage enter_purpose_of_visit(String purpose){
			return enter(purpose_field, purpose);
	}
		
	// Verify purpose of visit
		public	NBDOldKioskPage verify_purpose_of_visit(String purpose){
			return verify_element_attribute_value(purpose_field, "value", purpose);
	}		
		
    // Enter purpose of visit
		public	NBDOldKioskPage select_department_to_be_visit(String department){
			return select_by_name(department_to_be_visited, department);
	}		
		
}
