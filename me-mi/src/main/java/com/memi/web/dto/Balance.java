package com.memi.web.dto;

import java.io.Serializable;

public class Balance implements Serializable{

	private static final long serialVersionUID = 1L;
	ShopDto shop = new ShopDto();
	
	public ShopDto getShop() {
		return shop;
	}
	public void setShop(ShopDto shop) {
		this.shop = shop;
	}
	
	public String getShopName(){
		return shop.getShopNm();
	}
	

}
