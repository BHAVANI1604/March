package lms1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FileFastExample {

	public static void main(String[] args) {
//		Map<Integer,String>m=new HashMap<Integer, String>();
//		m.put(1, "bhavani");
//		m.put(2, "ganga");
//	Iterator itr=m.keySet().iterator();
//	while(itr.hasNext()) {
//	System.out.println(m.get(itr.next()));
//	m.put(4, "hai");
	// }
		
		ConcurrentHashMap<String , String>chm=new ConcurrentHashMap<String, String>();
		chm.put("hai", "hello");
		chm.put("one", "soft");
		Iterator itr=chm.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(chm.get(itr.next()));
			chm.put("hhp", "ha");
		}
		
	}

}
