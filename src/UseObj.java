
public class UseObj {

	public static void main(String[] args) {
		Obj o= new Obj();
		o.name="bhavani";
		o.price=1;
		o.salary=120;
		
		Obj o1= new Obj();
		o1.name="bhavani123";
		o1.price=11;
		o1.salary=130;
		
		if(o.price>=1 || o1.price<10) {
			System.out.println("having hifhest price");
		}
		else {
			
			System.out.println("lowest price");
		}
		

	}

}
