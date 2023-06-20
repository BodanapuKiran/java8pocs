package com.map;
import java.util.*;
import java.util.Map.Entry;
public class mpractice {

	public static void main(String[] args) {
   Map <Integer,String> m =new Hashtable<>();
     m.put(101, "a.sandeep");
     m.put(102, "b.kiran");
     m.put(103, "sharath");
     m.put(104, "kattappa");
     m.put(105, "srikanth");
     m.put(106, "arjun");
     m.put(107, "venu");
     m.put(108, "naresh");
     m.put(109, "dilip");
     m.put(110, "imran");
     m.put(111, "bharath");
    //System.out.println( m.get(109));
        Set<Integer> keys = m.keySet();
        //for (Integer key : keys) {
			//System.out.println(key+" >>>>>>");
			//System.out.println(m.values());
			
		//}
        Collection<String> values = m.values();
        for (String value : values) {
			//System.out.println(value);
		}
        Set<Entry<Integer, String>> set = m.entrySet();
        for (Entry<Integer, String> entry : set) {
			System.out.println(entry);
		}
        }
	}


