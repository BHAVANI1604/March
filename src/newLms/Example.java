package newLms;

public class Example {
  String display(String name) {
	  return name;
	  
  }
	public static void main(String[] args) {
		Example e=new Example();
		String name=args[0];
		System.out.println(e.display(name).toUpperCase());

	}

}
