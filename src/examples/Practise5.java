package examples;

public class Practise5 {
	public static void main(String[] args) {
		String a="madam";
	String	rev="";
	
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+a.charAt(i);
		
	}if(a.equals(rev)) {
		System.out.println("pal");
	}else {
		System.out.println("no pal");
	}
	}

}
