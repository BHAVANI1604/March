
public class UseSample {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		Sample s= (x,y)->(x+y);
		System.out.println(s.add(a, b));
		

	}

}
