package lambda123;


public class UseExample {

	public static void main(String[] args) {
		// int a=Integer.parseInt(args[0]);
		
		//String test=args[0];
		
//		Example e=(a->System.out.println(a.length()));
//		e.text(test);
		
		
		
		
//	Example e=(b)->{return b;};
//		System.out.println(e.add(a)*a);
		
		
		
////
		String text1=args[0];
	String text2=args[1];	
		
		Example e=(a,b)->{return a+"is the morning entering time \n"+b+"is the leaving time";};
		System.out.println(e.letter(text1, text2));
		
		
//	String text1=args[0];
//	String text2=args[1];	
//	Example e=(a,b)->{return a+ "this is from address and " +b +"is the to address";};
//	
//	//System.out.println(a.concat(b).endsWith(text2));
//	System.out.println(e.letter(text1, text2));
	//e.letter(text1, text2);

		
	}

}
