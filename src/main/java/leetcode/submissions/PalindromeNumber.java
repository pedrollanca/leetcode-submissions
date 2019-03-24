package leetcode.submissions;

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//Example 1:
//
//Input: 121
//Output: true
//Example 2:
//
//Input: -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3:
//
//Input: 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
class PalindromeNumber {
	public boolean isPalindrome(int x) {
		StringBuilder s1, s2;

		if (x < 0)
			return false;
		s1 = new StringBuilder(x + "");
		s2 = new StringBuilder(x + "");
		s1.reverse();
		return s1.toString().compareTo(s2.toString()) == 0;

	}
}