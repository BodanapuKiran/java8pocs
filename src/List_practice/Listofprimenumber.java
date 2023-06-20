package List_practice;
import java.util.*;

public class Listofprimenumber {

	public static void main(String[] args) {
    Vector<Integer> v=new Vector<>();
    for(int i=2;i<=50;i++) {
    	int count=0;
    	for(int j=2;j<i;j++) {
    		if(i%j==0) {
    			count++;
    		}
    	}
    	if(count==0) {
    		v.add(i);
    	}
    }
    System.out.println(v);
	}

}
