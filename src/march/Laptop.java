package march;

import java.util.HashMap;
import java.util.Iterator;

public class Laptop {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(1, "bhavani");
		hm.put(2, "satya");
		System.out.println(hm);
		
		for(Integer i:hm.keySet()) {
			System.out.println(i);
		}
		for(String s:hm.values()) {
			System.out.println(s);
		}
		Iterator itr=hm.values().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
