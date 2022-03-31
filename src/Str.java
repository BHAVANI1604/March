
public class Str {
String name;
int age;
boolean isMarried;
public Str(String name, int age, boolean isMarried) {
	super();
	this.name = name;
	this.age = age;
	this.isMarried = isMarried;
}
@Override
public String toString() {
	return "Str [name=" + name + ", age=" + age + ", isMarried=" + isMarried + "]";
}
}
