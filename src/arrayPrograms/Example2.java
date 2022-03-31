package arrayPrograms;

public class Example2 {

	public static void main(String[] args) {
		String name="bhavani";
		char c[]=name.toCharArray();
		for(int i=c.length-1;i>0;i--) {
			System.out.println(c[i]);
		}

	}

}
