package methods;

public class Aeio {

	public static void main(String[] args) {
	String arr[]= {"bhavani","anu","satya"};
	int count =0;
	int count1=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].contains("a")||arr[i].contains("u")||arr[i].contains("g")) {
			
			count=count+1;
			
		}
		else {
			
			count1=count1+1;
			
		}
		
		
		
	}
	System.out.println(count);
	System.out.println(count1);

	}

}
