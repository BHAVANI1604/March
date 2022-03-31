package collectionCondition;

import java.util.ArrayList;

public class UseStudent {

	public static void main(String[] args) {
	Student s=new Student("bhavani", 1, 800, "cse");
	Student s1=new Student("satya", 2, 900, "eee");
	Student s2=new Student("anu", 3, 1200, "mech");
	Student s3=new Student("siva", 4, 1100, "ece");
	ArrayList<Student>li=new ArrayList<Student>();
	li.add(s);
	li.add(s1);
	li.add(s2);
	li.add(s3);
	for(int i=0;i<li.size();i++) {
	if(li.get(i).getMarks()>800) {
		System.out.println(li.get(i).getName());
	}
	}
	System.out.println("----------------enhanced for------------------");
	for(Student st:li) {
		if(st.getBranch().equals("cse")) {
			System.out.println(st.getName());
		}
	
		
	}

	}

}
