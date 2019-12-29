package com.satish.list.code;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {2,3,4,5,6,3,4,5,3,4,4};
		int k=3;
		
		//remove duplicates if needed 
		Set<Integer> set = new HashSet<>();
		for(int i:input) {
			set.add(i);
		}
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
		set.forEach(s->{
			pq.add(s);
		});
		
		while(k-1>0) {
			pq.poll();
			k--;
		}
		
		System.out.println(pq.peek());

	}

}
