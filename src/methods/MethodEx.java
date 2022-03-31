package methods;

public class MethodEx {
	int cal(int n1, int n2) {
		int min;
		if(n1>n2) {
			min=n2;
		}else {
			min=n1;
		}
		return min;
		
		
	}
	

	public static void main(String[] args) {
		MethodEx m=new MethodEx();
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println(m.cal(n1, n2));

	}

}
