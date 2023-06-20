package List_practice;


public class ListintoArray {

	public static void main(String[] args) {
     int [] x= {10,55,101,99,100};
     int a=x[0];
     for(int i=0;i<x.length;i++) {
    	if(a<x[i]) {
    		a=x[i];
    	}
     }
     System.out.println(a);
     
	}

}
