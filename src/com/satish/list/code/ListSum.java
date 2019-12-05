package com.satish.list.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListSum {

	public static void main(String[] args) {
		
		List<Integer> l1= new ArrayList<>();
		List<Integer> l2= new ArrayList<>();
		l1.add(7);l1.add(1);l1.add(8);
		l2.add(4);l2.add(1);l2.add(2);
		
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "one");
		m.put(11, "1one");
		
		m.forEach((k,v)->{
			System.out.println(k+"-"+v);
		});
		
	}
	
}
