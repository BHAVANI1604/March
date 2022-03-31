package march14;

public class BinaryEx {
	public static void main(String[] args) {
//		int dec=Integer.parseInt(args[0]);
//		String a=Integer.toBinaryString(dec);
//		System.out.println(a);
		
		//int a=Integer.parseInt(args[0]);
		int n = 20;
		StringBuffer b=new StringBuffer();
		while(n>0) 
		//for(int i=0;i<n;i++)
		{
		int	r=n%2;
		n=n/2;
		System.out.print(r);
		
		}
		
		
		
		
	}

}
