import lms.Addable;

public class UseMobile {
	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		//String name=args[0];
		//float score=Float.parseFloat(args[1]);
		//String name=args[1];
		//float weight=Float.parseFloat(args[1]);
		 
	Mobile u=(x,y,z)->(x+y+z);
	
	System.out.println(u.phone(a, b, c));

		
//		Mobile b=(a)->System.out.println(a);
//		b.phone(score);
		
		
		
	}

}
