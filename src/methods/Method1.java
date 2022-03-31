package methods;

public class Method1 {
	String words(String a) {
		if(a.equalsIgnoreCase("hyderabad")) {
			return "this is hyderabad";
		}
		else
		
		return "other state";
	}
//	void add(int a,int b) {
//		System.out.println(a+b);
//	
//	}
 public static void main(String[] args) {
	 Method1 m=new Method1();
//	 int a=Integer.parseInt(args[0]);
//	 int b=Integer.parseInt(args[1]);
//	 m.add(a, b);
	 System.out.println(m.words("hello"));
}
	
		
	}


