package com.satish.list.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KthMostLeastFrqNumInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {2,3,4,5,6,3,4,5,3,4,4};
		int k=3;
		
		Map<Integer, Integer> visitMap = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			
				visitMap.put(input[i], visitMap.getOrDefault(input[i], 0)+1);
		}
		
		System.out.println(visitMap);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->visitMap.get(a)-visitMap.get(b));
		
		visitMap.forEach((key,v)->{
			pq.add(key);
		});
		List<Integer> outList = new ArrayList<>();
		while(k>0) {
			outList.add(pq.poll());
			k--;
		}
		outList.forEach(l->{
			System.out.println(l);
		});

	}

}
