package collection_List;
import java.util.*;

public class LL_practice {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("y1");
		al.add("y2");
        al.add("y3");
		
      LinkedList<String> ll=new LinkedList<>();
      ll.add("kiran");
      ll.add("soumya");
      ll.add("amna");
      ll.add(0,"amna");
      ll.add("ramesh");
      ll.add("sathavva");
      ll.add("karthik");
      ll.add(null);
      ll.add("amna");
      ll.add(null);
      ll.addAll(0,al);
      System.out.println(ll);
      System.out.println(ll);

	}

}
