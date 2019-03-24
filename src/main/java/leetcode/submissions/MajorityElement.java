package leetcode.submissions;

import java.util.HashMap;
import java.util.Set;

//169. Majority Element
//Easy
//
//1463
//
//132
//
//Favorite
//
//Share
//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.
//
//Example 1:
//
//Input: [3,2,3]
//Output: 3
//Example 2:
//
//Input: [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int max = 0, num = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : nums) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}

		Set<Integer> keys = map.keySet();

		for (Integer key : keys) {
			if (max < map.get(key)) {
				max = map.get(key);
				num = key;
			}
		}

		return num;
	}
}
