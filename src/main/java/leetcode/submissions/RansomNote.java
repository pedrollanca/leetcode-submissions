//383. Ransom Note
//Easy
//
//298
//
//107
//
//Favorite
//
//Share
//Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//
//Each letter in the magazine string can only be used once in your ransom note.
//
//Note:
//You may assume that both strings contain only lowercase letters.
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true
package leetcode.submissions;

import java.util.HashMap;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
		char[] mag = magazine.toCharArray();

		for (int i = 0; i < mag.length; i++) {
			if (!letters.containsKey(mag[i]))
				letters.put(mag[i], 1);
			else
				letters.put(mag[i], letters.get(mag[i]) + 1);
		}

		for (int j = 0; j < ransomNote.length(); j++)
			if (!letters.containsKey(ransomNote.charAt(j)))
				return false;
			else {
				if (letters.get(ransomNote.charAt(j)) == 0)
					return false;
				else
					letters.put(ransomNote.charAt(j), letters.get(ransomNote.charAt(j)) - 1);
			}

		return true;
	}

}
