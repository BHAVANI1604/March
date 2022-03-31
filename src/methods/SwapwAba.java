package methods;

public class SwapwAba {
	void swapFunction(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ " "+b);
	}

	public static void main(String[] args) {
		SwapwAba s=new SwapwAba();
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		s.swapFunction(a, b);

	}

}
