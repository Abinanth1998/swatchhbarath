package com.abinanth;

import static org.junit.Assert.*;

import org.junit.Test;

public class TypeOfSubcriptionTest {

	@Test
	public void test() {
		
		int money=TypeOfSubscription.getRecidencyType("industry", 3);;
	    assertEquals(300,money);
	}

	@Test
	public void test2() {
	
		int money=TypeOfSubscription.getRecidencyType("house", 3);
	    assertEquals(30,money);
	}
	
	@Test
	public void test3() {
	
		int money=TypeOfSubscription.getRecidencyType("shop", 3);
	    assertEquals(150,money);
	}
}
