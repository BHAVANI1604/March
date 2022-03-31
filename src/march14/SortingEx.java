package march14;

public class SortingEx {

	public static void main(String[] args) {
		String[] arr=args[0].split(",");
		int a=Integer.parseInt(arr[0]);
		int b=Integer.parseInt(arr[1]);
		int c=Integer.parseInt(arr[2]);
		int d=Integer.parseInt(arr[3]);
		int e=Integer.parseInt(arr[4]);
		
	//	int arr[]= {2,1,4,9,7};
		int ar[]= {a,b,c,d,e};
		int temp=0;
		for(int i=0;i<ar.length;i++) {
			
			for(int j=i+1;j<ar.length;j++) {
				//int temp=0;
				if(ar[i]<ar[j]) {
					
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]);
		}
		

	}

}
