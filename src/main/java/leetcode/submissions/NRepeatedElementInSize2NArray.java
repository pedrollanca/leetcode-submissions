//961. N-Repeated Element in Size 2N Array
//Easy
//
//155
//
//112
//
//Favorite
//
//Share
//In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
//
//Return the element repeated N times.
//
// 
//
//Example 1:
//
//Input: [1,2,3,3]
//Output: 3
//Example 2:
//
//Input: [2,1,2,5,3,2]
//Output: 2
//Example 3:
//
//Input: [5,1,5,2,5,3,5,4]
//Output: 5
// 
//
//Note:
//
//4 <= A.length <= 10000
//0 <= A[i] < 10000
//A.length is even
package leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

public class NRepeatedElementInSize2NArray {
	public int repeatedNTimes(int[] A) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (list.contains(A[i]))
				return A[i];
			else
				list.add(A[i]);
		}

		return Integer.MIN_VALUE;
	}

}
