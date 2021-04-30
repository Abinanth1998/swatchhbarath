package com.abinanth;

import java.util.ArrayList;

public class HouseManager {

	static ArrayList<String> houseList = new ArrayList<String>();

	public static void addHouse(String houseNo, String street, String city) {
		String house = houseNo + "," + street + "," + city;
		houseList.add(house);
		

	}
	
	public static ArrayList<String> getAllHouses(){
		return houseList;
	}
	
	public static boolean exists(String house){
		return houseList.contains(house);
	}
	
	
	public static void displayAllHouse() {
		for (String house : houseList) {
			System.out.println(house);
		}
	}

}
