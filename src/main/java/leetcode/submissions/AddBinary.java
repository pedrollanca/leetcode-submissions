//67. Add Binary
//Easy
//
//899
//
//179
//
//Favorite
//
//Share
//Given two binary strings, return their sum (also a binary string).
//
//The input strings are both non-empty and contains only characters 1 or 0.
//
//Example 1:
//
//Input: a = "11", b = "1"
//Output: "100"
//Example 2:
//
//Input: a = "1010", b = "1011"
//Output: "10101"
package leetcode.submissions;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddBinary {
	public String addBinary(String a, String b) {
		Deque<Integer> number1 = new ArrayDeque<Integer>();
		Deque<Integer> number2 = new ArrayDeque<Integer>();
		int x, y, z = 0;
		StringBuilder sb = new StringBuilder();

		for (char c : a.toCharArray())
			number1.push(c - '0');

		for (char c : b.toCharArray())
			number2.push(c - '0');

		while (!number1.isEmpty() || !number2.isEmpty()) {
			if (!number1.isEmpty())
				x = number1.pop();
			else
				x = 0;

			if (!number2.isEmpty())
				y = number2.pop();
			else
				y = 0;

			if (x + y + z >= 2) {
				sb.insert(0, x + y + z - 2);
				z = 1;
			} else {
				sb.insert(0, x + y + z);
				z = 0;
			}
		}

		if (z > 0)
			sb.insert(0, 1);

		return sb.toString();
	}

}
