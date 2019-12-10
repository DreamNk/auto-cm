package com.ghx.auto.cm.ui.angularjs.page;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import ch.qos.logback.core.pattern.parser.Parser;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class AjsNBDAppointmentsPage extends CMAbstractPage<AjsNBDAppointmentsPage>{

	private By appointments_tab = By.id("appointments");
	private By click_start_date = By.xpath("/html/body/div[4]/div/div/div[1]/div/div/accordion/div/div[1]/div[2]/div/div/div/div[2]/vision-data-table/div[5]/div/div[2]/div/table/thead/tr[2]/th[2]/div/div/div/div/input");
	private By select_month_year = By.cssSelector("[ng-click='toggleMode()']");
	private By click_end_date = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[1]/tr/th[3]/div/span/input[1]");
	private By enter_appt_subject = By.id("loadAppointmentGrid_appointmentGrid_subject");
	private By verify_appt_name_in_search = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[11]/div");
	private By enter_createdby_id = By.id("loadAppointmentGrid_appointmentGrid_createdBy");
	private By verify_createdby_id = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[12]/div");
	private By enter_location_name = By.id("loadAppointmentGrid_appointmentGrid_locationForDisplay");
	private By verify_location_name_in_result = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[10]/div");
	private By enter_department_name = By.id("loadAppointmentGrid_appointmentGrid_departmentForDisplay");
	private By verify_department_name_in_result = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[9]/div");
	private By enter_staff_name = By.id("loadAppointmentGrid_appointmentGrid_buyersDetailsForDisplay");
	private By verify_staff_name_in_result = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[8]/div");
	private By enter_email_id = By.id("loadAppointmentGrid_appointmentGrid_repsEmailForDisplay");
	private By verify_email_id = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[7]/div/a"); 
	private By enter_user_name = By.id("loadAppointmentGrid_appointmentGrid_userForDisplay");
	private By verify_user_name = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[6]/div/a");
	private By enter_company_name = By.id("loadAppointmentGrid_appointmentGrid_legalName");
	private By verify_company_name = By.xpath(".//div[@id='appointmentGrid_Content']/table/tbody[3]/tr/td[5]/div/a");
	private By click_filter_button = By.id("loadAppointmentGrid_appointmentGrid_dataTableFilterContainer");
	private By click_clear_link = By.id("loadAppointmentGrid_appointmentGrid_ClearAnchor");
	private By select_month = By.id("popupCalContainer_nav_month");
	private By select_year = By.id("popupCalContainer_nav_year");
	private By apptdetails_iframe = By.id("iFrameDetails");
	private By apptdetails_vendorname = By.xpath("./html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td/strong");
	private By apptdetails_username = By.xpath("./html/body/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/strong"); 
	private By appt_backtolist_link = By.linkText("back to list"); 
	
	
	
	public	AjsNBDAppointmentsPage click_start_date_field(){
		return click_button(click_start_date);
		 
	}
	
	public	AjsNBDAppointmentsPage click_year_or_month_field(){
		return click_button(select_month_year);
	}


// Select Year -----------------------------------------------------------
	public	AjsNBDAppointmentsPage select_year(String year){		 
		 int i;
	        wait_until(2);
	        
	        for (i = 1; i < 15; i++) {
	            String xpath = "/html/body/div[" +i +"]";
	            String style = find_element_attribute_value(By.xpath(xpath), "style");
	            if(style.contains("block")) {
	                break;
	            }
	        }
	        
	        wait_until(2);
	        //tr
	    
	     loop1:   
	        for (int j = 1; j <= 5; j++) {
	            //td
	            for (int k = 1; k <= 4; k++) {
	                
	                String year_xpath = "/html/body/div[" +i +"]/div/div[1]/table/tbody/tr[" +j +"]/td[" +k +"]/button";
	                	                
	                boolean result = find_element_text(By.xpath(year_xpath)).equalsIgnoreCase(year);
	                if (result == true) {
	                    click(By.xpath(year_xpath));
	                    break loop1;
	                }
	            }
	        }
	        return this;
	}
	        
	
// Select month -------------------------------------------------------
	  public	AjsNBDAppointmentsPage select_month(String month){
	        int a;
	        wait_until(2);
	        
	        for (a = 1; a < 15; a++) {
	            String xpath = "/html/body/div[" +a +"]";
	            String style = find_element_attribute_value(By.xpath(xpath), "style");
	            if(style.contains("block")) {
	            break;
	            }
	        }
	        
	 loop2:
		 // tr - 
		 for (int j = 1; j <= 4; j++) {
	            //td
            for (int k = 1; k <= 3; k++) {
	                
                String month_xpath = "/html/body/div[" +a +"]/div/div[1]/table/tbody/tr[" +j +"]/td[" +k +"]/button";
                                
                boolean result = find_element_text(By.xpath(month_xpath)).equalsIgnoreCase(month);
                if (result == true) {
                    click(By.xpath(month_xpath));
                    break loop2;
                }
            }
        } 
		return this;
	}
	
//Select Date--------------------------------------------------------	  
	public	AjsNBDAppointmentsPage select_date(int date){
		
		int i;
		for (i = 1; i < 15; i++) {
			String xpath = "/html/body/div[" +i +"]";
			String style = find_element_attribute_value(By.xpath(xpath), "style");
			if(style.contains("block")) {
				break;
			}
		}
		
		wait_until(2);
		int d = 1;
		if(date >= 25){
			d = 2;
		}
	        
	loop3:
		// tr -
		for (int j = d; j <= 6; j++) {
				// td - 
			for (int k = 1; k <= 7; k++) {

				String date_xpath = "/html/body/div[" +i +"]/div/div[1]/table/tbody/tr[" +j +"]/td[" +k +"]/button";
				String date_string = Integer.toString(date);

				boolean result = find_element_text(By.xpath(date_xpath)).equalsIgnoreCase(date_string);
				if (result == true) {
					click(By.xpath(date_xpath));
					break loop3;
				}
			}
		}
	return this;
	}
	
	
	public	AjsNBDAppointmentsPage click_appointments_tab(){
		wait_until(4);
		return click_button(appointments_tab);
		 
	}
	
	
}
