package newLms;

public class UseCar {

	public static void main(String[] args) {
		Car c=new Car();
		c.brand="nano12";
		c.model="xxa";
		c.pricre=300000;
		c.taxPercentage=c.pricre*10/100;
		c.netPrice=c.pricre+c.taxPercentage;
		
		Car c1=new Car();
		c1.brand="nano";
		c1.model="xx";
		c1.pricre=200000;
		c1.taxPercentage=c1.pricre*15/100;
		c1.netPrice=c1.pricre+c1.taxPercentage;
		
		Car c2=new Car();
		c2.brand="nanonano";
		c2.model="xadx";
		c2.pricre=100000;
		c2.taxPercentage=c2.pricre+10/100;
		c2.netPrice=c2.pricre+c2.taxPercentage;
		
		Car cars[]= {c,c1,c2};
		
		//for(int i=0;i<cars.length;i++) {
		    System.out.println(cars[0].brand+" "+cars[1].brand+" "+cars[2].brand);
			System.out.println(cars[0].model +" "  +cars[1].model+" "+cars[2].model);
			System.out.println(cars[0].pricre+" "+cars[1].pricre+" "+cars[2].pricre);
			System.out.println(cars[0].taxPercentage+" "+cars[1].taxPercentage+" "+cars[2].taxPercentage);
			System.out.println(cars[0].netPrice+" "+cars[1].netPrice+" "+cars[2].netPrice);
		
	//	System.out.println(cars[i].brand+" "+cars[i].model+" "+cars[i].pricre+" "+cars[i].netPrice);
//		System.out.println(cars[i].model);
//		System.out.println(cars[i].netPrice);
//		
	//	}
		
		

	}

}
