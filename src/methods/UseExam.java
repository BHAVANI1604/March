package methods;

public class UseExam {
 int temp=0;
	void swapfun(int a, int b) {
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
		
	}
	
	public static void main(String[] args) {
	//	Exam e=new Exam();
		//System.out.println(e.x+" "+e.y);
//		System.out.println(fun());
//		
//
//	}
//	int fun() {
//		return 20;
		
//		for(int i=0;1;i++) {
//			System.out.println("hai");
//			break;
//		}
		
		UseExam u=new UseExam();
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		u.swapfun(a, b);
		
		
		
	}

}
