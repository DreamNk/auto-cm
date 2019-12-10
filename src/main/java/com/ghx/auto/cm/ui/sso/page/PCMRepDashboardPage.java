package com.ghx.auto.cm.ui.sso.page;

import org.openqa.selenium.By;

import com.ghx.auto.cm.ui.page.CMAbstractPage;

public class PCMRepDashboardPage extends CMAbstractPage<PCMRepDashboardPage> {

	private By contractingHeaderName = By.id("headerAppName");
	
	public PCMRepDashboardPage verify_contracting_and_compliance_name() {
		wait_until(5);
		return verify_element_by_text(contractingHeaderName, "Contracting & Compliance Solutions");
	}
}
