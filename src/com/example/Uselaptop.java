package com.example;

public class Uselaptop {

	public static void main(String[] args) {
		Laptop l=new Laptop();
        l.brand="hp";
        l.price=60000;
        Laptop l1=new Laptop();
        l1.brand="lenovo";
        l1.price=30000;
        Laptop l3=new Laptop();
        l3.brand="apple";
        l3.price=40000;
        Laptop arr[]= {l,l1,l3};
        
        int max=arr[0].price;
        int min=arr[0].price;
        for(int i=0;i<arr.length;i++) {
        	if(arr[0].price>max) {
        		max=arr[i].price;
        		
        	}else if(arr[0].price<min) {
        		min=arr[i].price;
        	}
        	
        }System.out.println(min);
        System.out.println(max);
        
        
	}

}
