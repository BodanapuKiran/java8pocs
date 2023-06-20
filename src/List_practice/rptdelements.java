package List_practice;
import java.util.*;

public class rptdelements {

	public static void main(String[] args) {
		rptdelements rp=new rptdelements();
		rp.m1();
		rp.m2();
		ArrayList<Integer> al= new ArrayList<>();
		  al.add(4);
	      al.add(5);
	      al.add(4);
	      al.add(9);
	      al.add(8);
	      al.add(99);
	      int count=0;
	      for(int i=0;i<al.size();i++) {
	    	 
	    			  
	    		  }
	    	  
	      
	      
	      
	}
	public void m1() {
		ArrayList<Integer> al= new ArrayList<>();
		  al.add(4);
	      al.add(5);
	      al.add(4);
	      al.add(9);
	      al.add(8);
	      al.add(99);
	     
	      int a=al.get(0);
	      for(int i=0;i<al.size();i++) {
	    	  if(a<al.get(i)) {
	    		  a=al.get(i);
	    		   }
	      }
	      System.out.println(a);
	}
	public void m2() {
		ArrayList<Integer> al= new ArrayList<>();
		  al.add(4);
	      al.add(5);
	      al.add(4);
	      al.add(9);
	      al.add(5);
	      al.add(99);
				
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					System.out.println(al.get(i));
					
				}
				
			}
			
		}
		
	}

}
