package methods;

public class Methos12 {
	int add(int a) {
		return a*a;
	}

	public static void main(String[] args) {
		Methos12 m=new Methos12();
		int a=Integer.parseInt(args[0]);
		
		for(int i=0;i<a;i++) {
			int x=m.add(i);
			System.out.println(x);
			
		}
	

	}

}
