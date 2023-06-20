package List_practice;
import java.util.*;

public class Sortlist {

	public static void main(String[] args) {
		ArrayList<Integer> v=new ArrayList<>();
		v.add(12);
		v.add(17);
		v.add(99);
		v.add(59);
		v.add(53);
		v.add(78);
		v.add(16);
		System.out.println(v);
		Collections.sort(v);
		System.out.println("ascendingorder: "+v);
		Collections.sort(v,Collections.reverseOrder());
		System.out.println("descendingorder: "+v);
		Sortlist.m1();
		Sortlist.m2();
		}
	  public static void m1() {
		  ArrayList<Integer> al= new ArrayList<>();
		  al.add(12);
		  al.add(26);
		  al.add(66);
		  al.add(11);
		  al.add(89);
		  al.add(48);
		  al.add(6);
		  int temp;
		  for(int i=0;i<al.size();i++) {
			  for(int j=i+1;j<al.size();j++) {
				  if(al.get(i)> al.get(j)) {
				   temp=al.get(i);
				   al.set(i, al.get(j));
				   al.set(j, temp);
			  }
		  }
		
	  }
		 for (int i:al) {
			  System.out.print(i+" ");

	}
		 System.out.println();

}
	  public static void m2() {
		  String[] name= {"kiran","soumya","amna","ramesh","sathavva","karthik"};
		 System.out.println(Arrays.asList(name));
	  }
}


