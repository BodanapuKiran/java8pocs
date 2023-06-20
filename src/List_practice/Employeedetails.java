package List_practice;

import java.util.*;

public class Employeedetails {

	public static void main(String[] args) {
            Vector<Integer> v=new Vector<>();
          v.add(10);  
          v.add(12); 
          v.add(25); 
          v.add(48); 
          v.add(78); 
          v.add(55); 
          Object[] array=v.toArray();
          System.out.println(Arrays.toString(array));
        
    }
}