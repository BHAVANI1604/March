package methods;

public class Calculator {
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10, 100);

	}

}
