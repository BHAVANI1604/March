package examples;

public class Palo {

	public static void main(String[] args) {
		String name="Malayalam";
		
	String rev = "";
	for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}if(name.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("palo");
		}
		else {
			System.out.println("no palo");
	}


	}

}
