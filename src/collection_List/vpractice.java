package collection_List;
import java.util.*;

public class vpractice {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<> ();
   v1.add("kiran");
   v1.add("soumya");
   v1.add("amna");
   v1.add(0,"ramesh");
   v1.add("satya");
   v1.add("karthi");
   Vector <String> v2=new Vector<>();
   v2.add(null);
   v2.add("house");
   v2.add("job");
   
   Vector <String> v3=new Vector<>();
   v3.add("java");
   v3.add("is");
   v3.add("powerful");
   
   v1.addAll(0,v2);
   v1.addAll(2,v3);
       System.out.println(v1);
 v1.set(2, "kiran");
	      System.out.println(v1);
	      System.out.println(v1.size());
	      System.out.println(v1.capacity());
	     // System.out.println(v1.indexOf("kiran"));
	      System.out.println(v1.indexOf("kiran",1));
	      Object[] arr=v1.toArray();
	      System.out.println(Arrays.toString(arr));

	}
	
	

}
