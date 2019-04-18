//125. Valid Palindrome
//Easy
//
//553
//
//1592
//
//Favorite
//
//Share
//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Note: For the purpose of this problem, we define empty string as valid palindrome.
//
//Example 1:
//
//Input: "A man, a plan, a canal: Panama"
//Output: true
//Example 2:
//
//Input: "race a car"
//Output: false
package leetcode.submissions;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null)
			return true;

		String s1 = s.replaceAll("[^a-zA-Z0-9]*", "").toLowerCase();
		StringBuilder sb = new StringBuilder(s1);
		sb.reverse();

		if (s1.compareTo(sb.toString()) == 0)
			return true;
		return false;

	}

}
