package newLms;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		String a=args[0];
		char[] b=a.toCharArray();
		ArrayList<Character>li=new ArrayList<Character>();
		li.add(b[0]);
		li.add(b[1]);
		li.add(b[2]);
		li.add(b[3]);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		

	}

}
