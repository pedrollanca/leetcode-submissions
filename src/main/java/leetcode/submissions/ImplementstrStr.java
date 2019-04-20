//28. Implement strStr()
//Easy
//
//825
//
//1249
//
//Favorite
//
//Share
//Implement strStr().
//
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Example 1:
//
//Input: haystack = "hello", needle = "ll"
//Output: 2
//Example 2:
//
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1
//Clarification:
//
//What should we return when needle is an empty string? This is a great question to ask during an interview.
//
//For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
package leetcode.submissions;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.isEmpty() || haystack == null || haystack.compareTo(needle) == 0)
			return 0;

		int i, j;
		if (haystack.indexOf(needle.charAt(0)) == -1)
			return -1;

		for (i = haystack.indexOf(needle.charAt(0)); i + needle.length() - 1 < haystack.length(); i++)
			if (haystack.charAt(i) == needle.charAt(0))
				if (haystack.substring(i, i + needle.length()).compareTo(needle) == 0)
					return i;

		return -1;
	}
}
