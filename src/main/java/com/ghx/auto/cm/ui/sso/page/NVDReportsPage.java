package com.ghx.auto.cm.ui.sso.page;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;
import com.ibm.icu.util.Calendar;

public class NVDReportsPage extends CMAbstractPage<NVDReportsPage>{

	private By standardReports = By.xpath(".//div[@class='panel-heading']/h4/a/span/a/span");
	private By shareMyCredentialsReport = By.linkText("Share My Credentials History Report");
	private By shareMyCredentialsReportText = By.xpath(".//div[@class='row ng-scope']/row ng-scope");
	private By fromDate = By.id("fromDate");
	private By toDate = By.id("toDate");
	private By noCredentialsShareMessage = By.xpath(".//div[@class='col-sm-12 col-md-12 col-lg-12']/vision-data-table/div[3]/div[2]/div");
	private By backToReports = By.linkText("back to reports");
	
	private By shareStaffMyCredentialsReport = By.linkText("Share Staff Credentials History Report");
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date=new Date();
	
	
	//***********************************************************
	public NVDReportsPage click_standard_report(){
		wait_until(1);
		return click_button(standardReports);
	}
	
	public NVDReportsPage click_share_my_credentials_report(){
		wait_until(5);
		return click(shareMyCredentialsReport);
	}
	
	
	public NVDReportsPage verify_from_date(){
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -7);
	    System.out.println(" From Date = " + dateFormat.format(cal.getTime()));
		wait_until(1);
		return verify_element_by_value(fromDate,dateFormat.format(cal.getTime()));
	}
	
	public NVDReportsPage verify_toDate(){
		System.out.println("to date = " + dateFormat.format(date));
		return verify_element_by_value(toDate,dateFormat.format(date));
		
	}
	public NVDReportsPage click_share_staff_credentials_report(){
		wait_until(1);
		return verify_element_by_text(shareMyCredentialsReportText, "Share Staff Credentials History Report");
	}
	
	public NVDReportsPage click_back_to_reports_link(){
		wait_until(1);
		return click_link(backToReports);
	}
	
	public NVDReportsPage click_share_staff_my_credentials_report_link(){
		wait_until(1);
		return click_link(shareStaffMyCredentialsReport);
		
	}
	
	public NVDReportsPage verify_no_credentials_share_message(){
		wait_until(1);
		return verify_element_by_text(noCredentialsShareMessage, "There were no credentials shared that match the date range selected.");
	}
	
}
