package march;

public class Teacher {
	private String name;
	private int id;
	private String branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Teacher(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	

}
