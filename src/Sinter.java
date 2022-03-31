
public class Sinter {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		SInterface2 s=(x)->{
			return x;
			};
		System.out.println(s.sum(a*a*a));

	}

}
