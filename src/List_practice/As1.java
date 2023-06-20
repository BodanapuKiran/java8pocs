package List_practice;
import java.util.*;

public class As1 {
	

	public static void main(String[] args) {
		As1.m2();
		As1 a=new As1();
		a.m1(); 
      Vector<Integer> v=new Vector<>();
      
      v.add(4);
      v.add(5);
      v.add(0);
      v.add(9);
      v.add(8);
      v.add(10);
      int count=0;
      int add=0;
      for(int i=0;i<v.size();i++) {
    	  
		add=add+v.get(i);
		count++;
	}
      System.out.println("sum:  "+add);
      System.out.println("average:  "+add/count);
	}
	public void m1() {
		Vector<Integer> v1=new Vector<>();
		 v1.add(4);
	      v1.add(5);
	      v1.add(4);
	      v1.add(9);
	      v1.add(8);
	      v1.add(4);
	      int add=0;
	      for(int i=0;i<v1.size();i++) {
	    	  if(v1.get(i)%2==0) {
	    		  add=add+v1.get(i);
	    	  }
	      }
	      System.out.println(add);
	      
	}
	public static void m2() {
		int [ ] x= {4,3,6,7,8,9,10};
		int add=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0) {
				add=add+x[i];
				
			}
		}
		System.out.println(add);
	}

}
