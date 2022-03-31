package super1;

public class Method2 extends Method1 {
void sleep() {
	System.out.println("sleeping");
}
void work() {
 sleep();
 super.eat();
}
public static void main(String[] args) {
	Method2 m=new Method2();
	m.work();
}
}
