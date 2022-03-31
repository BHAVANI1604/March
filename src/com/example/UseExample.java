package com.example;

public class UseExample {

	public static void main(String[] args) {
	Example e=new Example();
	e.brand="cello";
	e.price=10;
	Example e2=new Example();
	e2.brand="leo";
	e2.price=5;
	
	Example e3=new Example();
	e3.price=7;
	e3.brand="apple";
	
	Example arr[]= {e,e2,e3};
	//int mini=0;
	int max=0;
	
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i].price>max) {
			max=arr[i].price;
		}
	}
	System.out.println(max);
	
	
//	String a=" ";
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i].price < mini) {
//			mini=arr[i].price;
//			a=arr[i].brand;
//			
//		}
//		
//		
//	}System.out.println(mini+" "+a);
//	
	
	
	
	}

}
