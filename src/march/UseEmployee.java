package march;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp=new Employee("bhavani", 1, "java");
		Employee emp1=new Employee("anusuri", 2, "c");
		Employee emp2=new Employee("ganga", 3, "c++");
		Employee emp3=new Employee("veera", 4, "java123");
		ArrayList<Employee>e=new ArrayList<Employee>();
		e.add(emp);
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		System.out.println(e);
		System.out.println("--------filter------------");
		List<Employee>li=e.stream().filter(a->a.getName().equalsIgnoreCase("bhavaNi")).collect(Collectors.toList());
		System.out.println(li);
//		List<Employee>li=e.stream().filter(a->a.getId()>=2).collect(Collectors.toList());
//		li.forEach(abc->System.out.println(abc));
		System.out.println("--------map------------");
		List<String>l=e.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(e.get(i));
		}
		for(String abc1:l) {
			System.out.println(abc1);
		}
		l.forEach(xyx->System.out.println(xyx));
		
long i=e.stream().map(a->a.getId()>2).count();
System.out.println(i);

long ln=e.stream().filter(a->a.getName().startsWith("g")).count();
System.out.println(ln);
	}
	

}
