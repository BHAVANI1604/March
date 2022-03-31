package newLms;

public class UseShopping {

	public static void main(String[] args) {
		Shopping s=new Shopping();
	
		s.price=1000;
		s.dress="chudi";
		s.discount=s.price+(10/100);
		
		Shopping s1=new Shopping();
		
		s1.price=700;
		s1.dress="pant";
		s1.discount=s.price+(5/100);
		
		Shopping s2=new Shopping();
		
		s2.price=1000;
		s2.dress="ci";
		s2.discount=s.price+(3/100);
		
		Shopping[] shopping= {s,s1,s2};
		int min_dis=shopping[0].discount;
		for(int i=0;i<shopping.length;i++) {
			if(shopping[i].discount<min_dis) {
				min_dis=shopping[i].discount;
			}
		}System.out.println(min_dis);

	}

}
