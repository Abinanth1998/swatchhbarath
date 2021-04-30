package com.abinanth;
import java.util.*;
public class TypeOfSubscription {
	
//	static ArrayList<Integer> period=new ArrayList<Integer>();
//	public static ArrayList<Integer> getSubcription(int subcription) {
//		int money=0;
//
////		subscription.add("shop");
////		subscription.add("industry");
//		period.add(6);
//		if(estimate()==6) {
//			money=6*10;
//		
//		} else if(estimate()==12) {
//			money=12*10;
//		}
//		return money;
//	}
//	public static int estimate() {
//		Integer value=0;
//		for(Integer i:period) {
//		 value=(period.get(0));
//			
//		}
//		return value;
//	}
//
//}
//	static HashMap<String,Integer> subscribe=new HashMap<String,Integer>();
//	public static void recidencyType(String recidency) {
//		if(recidency=="House") {
//			
//		}
//	}
	static ArrayList<String> subscribe=new ArrayList<String>();
		public static int getRecidencyType(String recidency,int month) {
			try {
			String type= recidency;
			int value=0;
			int payment=0;
			if(type=="house") {
				value=10;
				
			} else if(type=="shop") {
				value=50;
		
			} else if(type=="industry"){
				value=100;
			
			}
			payment=period(month,value);
				return payment;
		} catch(InputMismatchException e) {
			System.out.println(e);
		}
		}
static int period(int month,int value) {
	int payment=0;
	try {
	
	if(month==3) {
		payment=3*value;
	}

	else if(month==6)
	{
		payment=6*value;
	}
	else if(month==12)
	{
		payment=12*value;
	}
	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	return payment;
}
public static int getRecidencyType1(String recidency, int month) {
	// TODO Auto-generated method stub
	return 0;
}
}

