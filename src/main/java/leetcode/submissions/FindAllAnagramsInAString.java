package leetcode.submissions;

//438. Find All Anagrams in a String
//Easy
//
//1417
//
//107
//
//Favorite
//
//Share
//Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
//
//Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
//
//The order of output does not matter.
//
//Example 1:
//
//Input:
//s: "cbaebabacd" p: "abc"
//
//Output:
//[0, 6]
//
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".
//Example 2:
//
//Input:
//s: "abab" p: "ab"
//
//Output:
//[0, 1, 2]
//
//Explanation:
//The substring with start index = 0 is "ab", which is an anagram of "ab".
//The substring with start index = 1 is "ba", which is an anagram of "ab".
//The substring with start index = 2 is "ab", which is an anagram of "ab".
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllAnagramsInAString {

	
	public List<Integer> findAnagrams1(String s, String p) {
		List<Integer> results = new ArrayList<Integer>();
		String tmp;

		for (int i = 0; i < s.length(); i++) {
			if (i + p.length() <= s.length()) {
				tmp = s.substring(i, i + p.length());
				if (isAnagram(tmp, p)) {
					results.add(i);

				}
			}
		}

		return results;
	}
	
// WORKS BUT NOT FOR TOO LONG STRINGS
//	boolean isAnagram(String s1, String s2) {
//		List<String> l1 = new ArrayList<String>(Arrays.asList(s1.split("")));
//		List<String> l2 = new ArrayList<String>(Arrays.asList(s2.split("")));
//
//		if (s1.length() != s2.length())
//			return false;
//		if (s1.equals(s2))
//			return true;
//
//		Collections.sort(l1);
//		Collections.sort(l2);
//
//		return l1.equals(l2);
//	}
	
	boolean isAnagram(String s1, String s2) {
		int[] counts1 = new int[26];
		int[] counts2 = new int[26];

		int i = 0;
		if (s1.length() != s2.length())
			return false;

		for (i = 0; i < s1.length(); i++) {
			counts1[s1.charAt(i) - 'a'] = counts1[s1.charAt(i) - 'a'] + 1;
		}

		for (i = 0; i < s2.length(); i++) {
			counts2[s2.charAt(i) - 'a'] = counts2[s2.charAt(i) - 'a'] + 1;
		}

		for (i = 0; i < 26; i++) {
			if (counts1[i] != counts2[i])
				return false;
		}

		return true;

	}
}
