package com.satish.list.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 1, -2, -3, 5, 4, 4 };
		int input1[] = Arrays.copyOf(input, input.length);
		int sum = 8;
		int from = -1, to = -1;
		Map<Integer, Integer> dict = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				input[i] = input[i];
			} else {
				input[i] = input[i - 1] + input[i];
			}
			dict.put(input[i], i);
//			if (dict.containsKey(input[i]-sum)) {
//				System.out.println("Found");
//				from = dict.get(input[i] - sum);
//				to = i;
//				break;
//
//			} else {
//				dict.put(input[i], i);//pos with numbers
//
//			}
		}
		System.out.println(dict);
		
		for (int i = 0; i < input.length; i++) {
		
				if (dict.containsKey(input[i]-sum)) {
					from = dict.get(input[i]-sum);
					to=i;
				}
		}
		
		if (from == -1) {
			System.out.println("Not Found");
		} else {

			for (int j = from + 1; j <= to; j++) {
				System.out.println(input1[j]);
			}
		}

	}

}
