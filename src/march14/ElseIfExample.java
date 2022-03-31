package march14;

public class ElseIfExample {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if(a>50 &&a<40 ) {
			System.out.println("old");
		}
		else if(a>39 && a<20) {
			System.out.println("adult");
		}
		else {
			System.out.println("child");
		}

	}

}
