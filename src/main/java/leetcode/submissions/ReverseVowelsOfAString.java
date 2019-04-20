//345. Reverse Vowels of a String
//Easy
//
//368
//
//659
//
//Favorite
//
//Share
//Write a function that takes a string as input and reverse only the vowels of a string.
//
//Example 1:
//
//Input: "hello"
//Output: "holle"
//Example 2:
//
//Input: "leetcode"
//Output: "leotcede"
//Note:
//The vowels does not include the letter "y".
package leetcode.submissions;

public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
		if (s == null || s.isEmpty())
			return s;
		int i = 0, j = s.length() - 1;
		String vowels = "aeiouAEIOU";
		StringBuilder sb = new StringBuilder(s);
		char tmp;

		while (i <= j) {
			if (vowels.indexOf(sb.charAt(i)) > -1 && vowels.indexOf(sb.charAt(j)) > -1) {
				tmp = sb.charAt(i);
				sb.setCharAt(i, sb.charAt(j));
				sb.setCharAt(j, tmp);
				i++;
				j--;
			} else {
				if (vowels.indexOf(sb.charAt(i)) == -1)
					i++;
				if (vowels.indexOf(sb.charAt(j)) == -1)
					j--;

			}
		}

		return sb.toString();
	}

}
