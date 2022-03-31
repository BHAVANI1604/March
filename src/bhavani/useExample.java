package bhavani;

public class useExample {

	public static void main(String[] args) {
	Example e=new Example();
	Example e1=new Example();
	Example e2=new Example();
	e.name="bhavani";
	e.id=1;
	e.contactNo=1234567l;
	
	e1.name="satya";
	e1.id=2;
	e1.contactNo=1234890l;
	
	e2.name="lova";
	e2.id=3;
	e2.contactNo=987543l;
	
	
	Example ex[]= {e,e1,e2};
	System.out.println(ex[0].name+" "+ex[0].id+" "+ex[0].contactNo);
	System.out.println(ex[1].name+" "+ex[1].id+" "+ex[2].contactNo);
	System.out.println(ex[2].name+" "+ex[2].id+" "+ex[2].contactNo);
	for(int i=0;i<ex.length;i++) {
		System.out.println(ex[i]);
		
		//System.out.println(e.name+" "+e.id+" "+e.contactNo+" "+e1.name+" "+e1.id+" "+e1.contactNo+" "+e2.name+" "+e2.id+" "+e2.contactNo);
	}
	
	
	
	

	}

}
