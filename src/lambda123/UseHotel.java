package lambda123;

public class UseHotel {
//	public String nonveg(String a) {
//		
//		//String a="hai";
//		//return Integer.parseInt(a);
//		//System.out.println(a);
//		return a;
//		
//	}


	void busloan(int score) {
		if(score>700 && score<900) {
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
	}
	public static void main(String[] args) {
//		
//		UseHotel u=new UseHotel();
//	
//		Hotel h=u::nonveg;
//		System.out.println(h.eat(args[0]));
//		
//
		
		UseHotel u=new UseHotel();
		int score=Integer.parseInt(args[0]);
		Hotel h=u::busloan;
		h.loan(score);
		
		
	}

}
