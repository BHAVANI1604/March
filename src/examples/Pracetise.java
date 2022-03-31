package examples;

public class Pracetise {

	public static void main(String[] args) {
		int count=0;int oddCount=0;
		for(int i=0;i<7;i++) {
			if(i%2==0) {
			count=count+i;
			//System.out.println(count);
		}else {
			oddCount=oddCount+i;
			//System.out.println(oddCount);
		}

	}System.out.println(count);
	System.out.println(oddCount);

}
}