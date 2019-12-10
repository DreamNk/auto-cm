/*
 * Copyright (c) 2015 Global Healthcare Exchange, LLC. All rights reserved.
 */

package com.ghx.auto.cm.ui.page;

import java.util.ResourceBundle;

import com.ghx.auto.core.ui.page.AbstractPage;

public abstract class CMAbstractPage<T extends CMAbstractPage<T>> extends AbstractPage<T> {

	private static String application_id = "CM";
	
    private static ResourceBundle pageTitles =  ResourceBundle.getBundle(application_id + "_" + "PageTitles");

    @Override
    public String getApplicationId() {
        return this.application_id;
    }
    
    @Override
    public ResourceBundle getPageTitles() {
        return this.pageTitles;
    }
    
}
