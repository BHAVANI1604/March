package newLms;

public class Discount {
	
	int netprice(int price,int taxPercentage) {
		
		int netPrice=price+taxPercentage;
		
		return netPrice;
	}

	public static void main(String[] args) {
		Discount d=new Discount();
		int price=Integer.parseInt(args[0]);
		int taxPercentage=Integer.parseInt(args[1]);
		System.out.println(d.netprice(price, taxPercentage));

	}

}
