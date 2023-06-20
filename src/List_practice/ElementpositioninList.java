package List_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class ElementpositioninList {

	public static void main(String[] args) {
		//ElementpositioninList el=new ElementpositioninList();
		ElementpositioninList.m1();
		Vector<Integer> v=new Vector<>();
		v.toArray();
 		v.add(31);
		v.add(67);
		v.add(52);
		v.add(44);
		v.add(6);
		v.add(7);
		System.out.println(v.get(3));
		System.out.println(v.indexOf(44));
		
	}
	public static void m1() {
		Stack<Integer> st=new Stack<>();
		st.push(55);
		st.push(6);
		st.push(9);
		st.push(8);
		st.push(4);
		st.push(6);
		st.push(2);
		System.out.println(st);
		System.out.println("position of an element: "+st.search(8));
		
	}

}
