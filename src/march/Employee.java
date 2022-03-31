package march;

public class Employee {
	private String name;
	private int id;
	private String sub;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public Employee(String name, int id, String sub) {
		super();
		this.name = name;
		this.id = id;
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sub=" + sub + "]";
	}
	

}
