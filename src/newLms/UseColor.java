package newLms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseColor {

	public static void main(String[] args) {
		Color c=new Color("oppo", 10000, "white");
		Color c1=new Color("vivo", 20000, "black");
		Color c2=new Color("apple", 120000, "orange");
		ArrayList<Color>li=new ArrayList<Color>();
		li.add(c);
		li.add(c1);
		li.add(c2);
//		List<Color>l=li.stream().filter(a->  !a.getColor().equals("white")).collect(Collectors.toList());
//        l.forEach(ab->System.out.println(ab));
		
		List<String>l=li.stream().filter(r->r.getPrice()>10000).map(a->a.getBrand()).collect(Collectors.toList());
		l.forEach(abc->System.out.println(abc));
	}

}
