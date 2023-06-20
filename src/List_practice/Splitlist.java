package List_practice;
import java.util.*;

public class Splitlist {

	public static void main(String[] args) {
		Splitlist sl=new Splitlist();
		sl.m1();
    ArrayList<Integer> al=new ArrayList<>();
    al.add(10);
    al.add(22);
    al.add(15);
    al.add(88);
    al.add(55);
    al.add(44);
    al.add(51);
    List<Integer> first=new ArrayList<>();
    List<Integer> second=new ArrayList<>();
    for(int i=0;i<al.size()/2;i++) {
    	first.add(al.get(i));
    }
    for(int i=al.size()/2;i<al.size();i++) {
    	second.add(al.get(i));
    }
   // System.out.println(first);
   // System.out.println(second);
	}
	public void m1() {
		 ArrayList<Integer> al=new ArrayList<>();
		 al.add(10);
		    al.add(22);
		    al.add(15);
		    ArrayList<Integer> al1=new ArrayList<>();
		    al1.add(88);
		    al1.add(55);
		    al1.add(44);
		    al1.add(51);
		    System.out.println(al);
		    System.out.println(al1);
		    al.addAll(al1);
		    
		    System.out.println(al);
	}

}
