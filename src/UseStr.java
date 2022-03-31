import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStr {

	public static void main(String[] args) {
		String first[] = args[0].split(",");
		String second[] = args[1].split(",");
		String third[] = args[2].split(",");

		String s = first[0];
		int y = Integer.parseInt(first[1]);
		boolean a = Boolean.parseBoolean(first[2]);

		Str s0 = new Str(s, y, a);

		String s2 = second[0];
		int y2 = Integer.parseInt(second[1]);
		boolean a2 = Boolean.parseBoolean(second[2]);

		Str s1 = new Str(s2, y2, a2);

		String s3 = third[0];
		int y3 = Integer.parseInt(third[1]);
		boolean a3 = Boolean.parseBoolean(third[2]);

		Str s4 = new Str(s3, y3, a3);
//		String s=first[0];
//		int y=Integer.parseInt(first[1]);
//		boolean a =Boolean.parseBoolean(first[2]);

//		
//		s1.name=second[0];
//		s1.age=Integer.parseInt(second[1]);
//		s1.isMarried=Boolean.parseBoolean(second[2]);
//		
//		s2.name=third[0];
//		s2.age=Integer.parseInt(third[1]);
//		s2.isMarried=Boolean.parseBoolean(third[2]);

		ArrayList<Str> li = new ArrayList<>();
		li.add(s0);
		li.add(s1);
		li.add(s4);

		// System.out.println(li);

		List<Integer> l2 = li.stream().filter(t -> t.age < 23).map(t -> t.age+2).collect(Collectors.toList());
//System.out.println(l2);
		l2.forEach(abc->System.out.println(abc));
	}

}
