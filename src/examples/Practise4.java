package examples;

public class Practise4 {
	public static void main(String[] args) {
		String a="bha123ni";int count=0;int count1=0;
		char[] ab=a.toCharArray();
		for(int i=0;i<ab.length;i++) {
			if(ab[i]>0||ab[i]<9) {
				count=count+1;
				
			}else {
				count1=count+1;
			}
			
		}
		System.out.println("no"+count);
		System.out.println("alp"+count1);
	}

}
