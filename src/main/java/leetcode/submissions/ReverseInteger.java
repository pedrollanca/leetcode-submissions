package leetcode.submissions;

//7. Reverse Integer
//Easy
//
//1994
//
//2970
//
//Favorite
//
//Share
//Given a 32-bit signed integer, reverse digits of an integer.
//
//Example 1:
//
//Input: 123
//Output: 321
//Example 2:
//
//Input: -123
//Output: -321
//Example 3:
//
//Input: 120
//Output: 21
//Note:
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
public class ReverseInteger {
	public int reverse(int x) {
		StringBuilder sb = new StringBuilder();
		if (x < 0) {
			sb.append(-x);
			sb.reverse();
			try {
				return -1 * Integer.parseInt(sb.toString());
			} catch (NumberFormatException e) {
				return 0;
			}
		} else if (x > 0) {
			sb.append(x);
			sb.reverse();
			try {
				return Integer.parseInt(sb.toString());
			} catch (NumberFormatException e) {
				return 0;
			}
		} else
			return 0;
	}
}
