package leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//977. Squares of a Sorted Array
//Easy
//
//171
//
//27
//
//Favorite
//
//Share
//Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
//
// 
//
//Example 1:
//
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Example 2:
//
//Input: [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
//Note:
//
//1 <= A.length <= 10000
//-10000 <= A[i] <= 10000
//A is sorted in non-decreasing order.
public class SquareOfASortedArray {
	public int[] sortedSquares(int[] A) {
		return Arrays.stream(A).map(value->value*value).sorted().toArray();
	}
	
}
