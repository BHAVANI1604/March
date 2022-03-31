package methods;

public class ExamplePassValue {

	int a=10;
	void add(int a) {
		
		this.a=a+20;
		
	}
	
	public static void main(String[] args) {
		ExamplePassValue ex=new ExamplePassValue();
		System.out.println("before call by value:"+ex.a);
		
		ex.add(456);
		System.out.println(ex.a);
		

	}

}
