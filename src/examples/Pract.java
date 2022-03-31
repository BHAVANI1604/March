package examples;

public class Pract {

	public static void main(String[] args) {
	String a= "bhAvani";int upp=0;int low=0;
	
	for(int i=0;i<a.length();i++) {
		char c=a.charAt(i);
		if(c >= 'A' && c >= 'Z') {
			upp++;
	}		else {
			low++;
		}
	}
	System.out.println(upp+" uppercase count");
	System.out.println(low+" lower count");


	}

}
