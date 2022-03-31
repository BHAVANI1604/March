package newLms;

public class UseStudent {

	public static void main(String[] args) {
		String a[]=args[0].split(",");
		Student s=new Student();
	s.name=a[0];
		s.age=Integer.parseInt(a[1]);
		
		String b[]=args[0].split(",");
		Student s1=new Student();
	s1.name=b[0];
		s1.age=Integer.parseInt(b[1]);
		
		if((s.name).equals(s1.name)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		

	}

}
