package streem;

import java.util.ArrayList;

public class Num {

	public static void main(String[] args) {
	String	a[]=args[0].split(",");
	int a1=Integer.parseInt(a[0]);
	int a2=Integer.parseInt(a[1]);
	int a3=Integer.parseInt(a[2]);
	ArrayList<Integer>li=new ArrayList<Integer>();
	li.add(a1);
	li.add(a2);
	li.add(a3);
	
//	for(int i=0;i<li.size();i++) {
//		System.out.println(li.get(i));
//	}
	for(Integer i:li) {
		System.out.println(li.get(i));
	}

	}

}
