package examples;

public class Practise3 {
public static void main(String[] args) {
	String a="example";int count=0;int count1=0;
	char[] ab=a.toCharArray();
	for(int i=0;i<ab.length;i++) {
		if(ab[i]=='a'||ab[i]=='e'||ab[i]=='i'||ab[i]=='o'||ab[i]=='u') {
			System.out.println(ab[i]+"is a vowel");
			count++;
		}
		else {
			System.out.println(ab[i]+"is not a vowel");
			count1++;
		}
	}
	System.out.println(count);
	System.out.println(count1);
}
}
