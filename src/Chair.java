
public class Chair {
	private String color;
	private boolean isProof;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isProof() {
		return isProof;
	}
	public void setProof(boolean isProof) {
		this.isProof = isProof;
	}
	@Override
	public String toString() {
		return "Chair [color=" + color + ", isProof=" + isProof + "]";
	}

}
