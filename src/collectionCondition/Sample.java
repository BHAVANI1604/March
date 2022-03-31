package collectionCondition;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<Integer>();
		li.add(10);
		li.add(11);
		li.add(13);
		li.add(14);
		li.add(9);
		
		
		
		for(int i=0;i<li.size();i++) {
		if(li.get(i)%2==0) {
		System.out.println(li.get(i)+" even");
		}		else {
		System.out.println(li.get(i)+" odd");
	}
		}
		int count=0;
		for(int i=0;i<li.size();i++) {
			count=count+li.get(i);
		}
		System.out.println(count);
		
		for(int j=0;j<li.size();j++) {
			if(li.get(j)>11 && li.get(j)<14) {
				System.out.println(li.get(j));
			
			
		}
		
	}
	}
}
