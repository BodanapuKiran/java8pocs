package List_practice;
import java.util.*;

public class Nonreptdchar {

	public static void main(String[] args) {
      ArrayList<Character> al=new ArrayList<>();
      al.add('a');
      al.add('c');
      al.add('k');
      al.add('c');
      al.add('j');
      al.add('w');
      al.add('w');
      al.add('g');
      char firstnonrptdchar=' ';
      char firstrepeatedchar=' ';
      for(int i=0;i<al.size();i++) {
    	  for(int j=i+1;j<al.size();j++) {
    		  if(al.get(i)==al.get(j)) {
    			if(firstrepeatedchar==' ')
    				firstrepeatedchar= al.get(i);
    		  }
	
    	  
    	  else{
    		  if(firstnonrptdchar==' ')
    			  firstnonrptdchar= al.get(i);
    	    }
    	  }
    	  

      }
      System.out.println(firstnonrptdchar);
      System.out.println(firstrepeatedchar);

	} 
}
	


