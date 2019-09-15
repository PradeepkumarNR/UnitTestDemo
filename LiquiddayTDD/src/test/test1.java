package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	@Test
	void should_return_10_when_I_buy_one_item_of_10Rs() {
	
		Pricecalculator pricecalculator= new Pricecalculator();
		pricecalculator.item=1;
		pricecalculator.price=10;
		assertEquals(10, pricecalculator.calculateprice());
	}
	@Test
	void should_return_20_when_I_buy_one_item_of_20Rs() {
	
		Pricecalculator pricecalculator= new Pricecalculator();
		assertEquals(20, pricecalculator.calculateprice());
	}
	
	@Test
	void should_return_20_when_I_buy_Two_item_of_10Rs() {
	
		Pricecalculator pricecalculator= new Pricecalculator();
		pricecalculator.item=2;
		assertEquals(20, pricecalculator.calculateprice());
	}
	
	

}
