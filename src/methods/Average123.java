package methods;

public class Average123 {
int average(int a,int b) {
	int dis=(a*b)/10;
	return dis;
	
}
	public static void main(String[] args) {
		Average123 a=new Average123();
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		System.out.println(a.average(x, y));

	}

}
