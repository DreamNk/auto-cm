package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class NBDReportsPage extends CMAbstractPage<NBDReportsPage> {

	//private By reportsParentNode = By.xpath("//*[contains(@title,'Reports')]");
	private By reportsParentNode = By.xpath(".//div[@id='report_resources']/div/div/div/table/tbody/tr/td[2]/span");
	private By participationChildNode = By.xpath("//*[contains(@id,'ygtvcontentel2')]");
	
	public NBDReportsPage verify_reports_parent_node(){
		wait_until(20);
		return verify_element_by_text(reportsParentNode, "Reports");
	}
	
	public NBDReportsPage verify_participation_child_node(){
		wait_until(1);
		return click(participationChildNode);
	}
}
