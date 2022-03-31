package lambda123;

public class UseSmoking {
   public void smok(String a,String b, String c) {
	 String d=a.concat(b).concat(c);  
	 System.out.println(d);
	   
   }
	public static void main(String[] args) {
		UseSmoking  u=new UseSmoking ();
		Smoking s=u::smok;
	String h[]=args[0].split(",");
	String x=h[0];
	String y=h[1];
	String z=h[2];
	s.habbit(x, y, z);

	}

}
