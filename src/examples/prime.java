package examples;

public class prime {

	public static void main(String[] args) {
		int num=6;boolean isPrime = false;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
			isPrime=true;
			break;
		}}
		if(!isPrime) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not prime no");
		}

	}
	

}
