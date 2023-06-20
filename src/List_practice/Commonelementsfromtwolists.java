package List_practice;
import java.util.*;

public class Commonelementsfromtwolists {
       
	public static void main(String[] args) {
		Commonelementsfromtwolists cml=new Commonelementsfromtwolists();
        cml.deleteduplicateelements();
    ArrayList<Integer> al=new ArrayList<>();
    al.add(4);
    al.add(5);
    al.add(6);
    al.add(9);
    al.add(7);
    al.add(99);
    ArrayList<Integer> al1=new ArrayList<>();
    al1.add(10);
    al1.add(4);
    al1.add(99);
    al1.add(6);
    al1.add(5);
    al1.add(9);
    ArrayList<Integer> al2=new ArrayList<>();
    for(int i=0;i<al.size();i++) {
    	for(int j=0;j<al1.size();j++) {
    		if(al.get(i)==al1.get(j)) {
    			al2.add(al.get(i));
    		}
    	}
    }
    System.out.println(al2);
    
	}
  public void deleteduplicateelements() {
	  ArrayList<Integer> al=new ArrayList<>();
	    al.add(4);
	    al.add(5);
	    al.add(6);
	    al.add(9);
	    al.add(7);
	    al.add(99);
	    ArrayList<Integer> al1=new ArrayList<>();
	    al1.add(10);
	    al1.add(4);
	    al1.add(99);
	    al1.add(6);
	    al1.add(5);
	    al1.add(9);
	    System.out.println(al1);
	    for(int i=0;i<al.size();i++) {
	    	for(int j=0;j<al1.size();j++) {
	    		if(al.get(i)==al1.get(j)) {
	    			al.remove(i);
	    		}
	    	}
	    }
	    System.out.println(al);
  }
}
