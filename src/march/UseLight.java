package march;

public class UseLight implements LightSwitch {

	public static void main(String[] args) {
		boolean a=Boolean.parseBoolean(args[0]);
		UseLight u=new UseLight();
		System.out.println(u.findLight(a));
		
	}

}
