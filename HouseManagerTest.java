package com.abinanth;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class HouseManagerTest {

	
	@Test
	public void testAddHouse() {
		int noOfHouses = HouseManager.getAllHouses().size();
		HouseManager.addHouse("13", "anna", "CBE");

		int actualSize = HouseManager.getAllHouses().size();
		assertEquals(noOfHouses+1, actualSize);
	}
	@Test
	public void test() {
		String house = "13" + "," + "anna" + "," + "CBE";	
		HouseManager.addHouse("13", "anna", "CBE");
		
		assertTrue(HouseManager.exists(house));
	}



}
