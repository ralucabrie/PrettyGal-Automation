package com.pages;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

    @FindBy(css="footer > a.button-primary")
    private WebElementFacade viewCartButton;
    
    @FindBy(css="li.product.has-hr")
    private List<WebElementFacade> productList;
    
    @FindBy(css="input.product-quantity-input")
    private List<WebElementFacade> quantityList;
	
	public void click_viewCartButton() {
		viewCartButton.click();
	}
	
	public int count_types_of_product() {
		return productList.size();
	}
	
	public int get_product_quantity_from_index(int index) {
		
		WebElementFacade productQuantityElement = quantityList.get(index);
		String productQuantityStr = productQuantityElement.getValue();
		int productQuantity = Integer.parseInt(productQuantityStr);
		return productQuantity;
		
		// the lines above are equivalent to the following:
		//return Integer.parseInt(quantityList.get(index).getValue());
	}
	
}