package march;

import java.util.HashMap;
import java.util.Iterator;

import com.switchex.example.Student;

public class UseStudent {
	public static void main(String[] args) {
		Teacher t=new Teacher("bhavani", 1, "cse");
		Teacher t1=new Teacher("ganga", 2, "ece");
		Teacher t2=new Teacher("satya", 3, "civil");
		Teacher t3=new Teacher("anu", 4, "eee");
		HashMap<Integer, Teacher>hm=new HashMap<>();
		hm.put(1, t);
		hm.put(2, t1);
		hm.put(3, t2);
		hm.put(4, t3);
		
		System.out.println(hm);
		
		for(Integer in:hm.keySet()) {
			System.out.println(in);
		}
		for(Teacher ter:hm.values()) {
			System.out.println(ter);
		}
		
		Iterator s1=hm.values().iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
		Iterator s2=hm.keySet().iterator();
		while(s2.hasNext()) {
			System.out.println(s2.next());
			
		}
		
	}

}
