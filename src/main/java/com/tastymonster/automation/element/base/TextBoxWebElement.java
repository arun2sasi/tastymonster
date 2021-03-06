package com.tastymonster.automation.element.base;

import com.tastymonster.automation.page.base.AbstractAutomationPage;

public class TextBoxWebElement extends AbstractSettableWebElement<String> implements ITextBox {

	public TextBoxWebElement( String id, AbstractAutomationPage page ) {
		super( id, page );
	}

	public void setWebValue() {
		this.getWebElement().sendKeys( this.getValue() );
	}

	public String getWebValue() {
		return getWebElement().getText();
	}
}
