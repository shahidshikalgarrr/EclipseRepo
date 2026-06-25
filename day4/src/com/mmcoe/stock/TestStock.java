package com.mmcoe.stock;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.getQuote();
		
		Exchange x = StockSingleton.getStock();
		x.setQuote();
		
		System.out.println(b==h);
		System.out.println(b==x);
		
	}

}
