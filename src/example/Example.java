package example;

public class Example {
	String  add(int a,int b) {
		if(a>b) {
			return "less";
		}else {
			return "fail";
		}
		
	}
	String add(String a, String b,String c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Example e=new Example();
		System.out.println(e.add(10, 20));
		System.out.println(e.add("hi", "hello", "h"));
		
	}

}
