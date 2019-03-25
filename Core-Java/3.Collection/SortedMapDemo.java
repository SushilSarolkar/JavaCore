package com.techm.sushil;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<String, String> map=new TreeMap<>();
		map.put("1111", "abc");
		map.put("5555", "nop");
		map.put("6666", "qrs");
		map.put("2222", "def");
		map.put("3333", "hij");
		map.put("4444", "klm");
		map.forEach((k,v)->System.out.println(k+"--"+v));
		//find out headmap of sorted map
		SortedMap<String, String> hmap=map.headMap("3333");
		hmap.forEach((k,v)->System.out.println(k+"--"+v));
		//find out tailmap of sorted map
		SortedMap<String, String> tmap=map.tailMap("4444");
		tmap.forEach((k,v)->System.out.println(k+"--"+v));
	}

}
