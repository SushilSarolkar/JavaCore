package com.techm.sushil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<>();
		map.put("1111", "abcd");
		map.put("2222", "efgh");
		map.put("3333", "ijkl");
		map.put("4444", "mnop");
		//getting all keys of the map collection by keyset method.
		Set<String>set=map.keySet();
		//lambda expression used for printing key and values using forEach method.
		map.forEach((k,v)-> System.out.println(k+"--"+v));
		map.replaceAll((k,v)->v.toUpperCase());
		//lambda expression upper case the values.
		map.forEach((k,v)-> System.out.println(k+"--"+v));
		//trying to get values
		
		
	}

}
