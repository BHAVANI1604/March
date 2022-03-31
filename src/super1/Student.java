package super1;

public class Student extends Teacher {
	String designation;
	Student(String name,int id,float salary,String designation){
		
		super(name,id,salary);
		this.designation=designation;
		
		
	}
	void show() {
		System.out.println(name+" "+id+"  "+salary+" "+designation);
	}public static void main(String[] args) {
		Student s=new Student("bhavani",12,12.45f,"stu");
		s.show();
	}
}
