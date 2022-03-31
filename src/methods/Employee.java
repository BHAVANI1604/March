package methods;

import java.util.HashMap;

public class Employee {
	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "bhavani");
		hm.put(2, "anu");
		hm.put(3, "hello");
		
		for(Integer id:hm.keySet()) {
			String name =hm.get(id);
			System.out.println(id+"  "+name);
			
			
		}
		
		for(Integer id:hm.keySet()) {
			System.out.println(id);
		}
		
	}

}
