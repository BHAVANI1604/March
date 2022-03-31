package examples;

public class Practise2 {

	public static void main(String[] args) {
		int arr[]= {2,3,4,-1,-4,-6};int count=0;int count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				
				System.out.println(arr[i]+"positive");
				count++;
			}else {
				System.out.println(arr[i]+"negitive");
				count1++;
			}
			
		}
		System.out.println("positive"+count);
		System.out.println("negitive"+count1);

	}

}
