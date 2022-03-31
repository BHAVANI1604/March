package test;

public class Example2 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		System.out.println(a+" "+b);
		for(int i=2;i<5;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		

	}

}
