package presentation;

import business.design.ICategoryDesign;
import business.design.IProductDesign;
import business.designimpl.CategoryDesignImpl;
import business.designimpl.ProductDesignImpl;

public class ShopManagement {
	ICategoryDesign categoryDesign = new CategoryDesignImpl();
	IProductDesign productDesign = new ProductDesignImpl();
	
	public static void main(String[] args) {
		
		ShopManagement shopManagement = new ShopManagement();
		
	}
}
