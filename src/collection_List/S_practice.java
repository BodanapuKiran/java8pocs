package collection_List;

import java.util.*;

public class S_practice {

	public static void main(String[] args) {
   Stack<Integer> st=new Stack<>();
      st.push(28);
      st.push(88);
      st.push(99);
      st.push(7);
      st.push(65);
      st.push(44);
      st.push(58);
      st.push(55);

   System.out.println(st);
   System.out.println(st.peek());
   System.out.println(st.search(99));
   System.out.println(st.pop());

   
   
   
	}

}
