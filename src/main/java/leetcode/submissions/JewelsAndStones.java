package leetcode.submissions;

//771. Jewels and Stones
//Easy
//
//1304
//
//244
//
//Favorite
//
//Share
//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: J = "z", S = "ZZ"
//Output: 0
//Note:
//
//S and J will consist of letters and have length at most 50.
//The characters in J are distinct.
import java.util.*;

class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int result = 0;

		for (String stone : Arrays.asList(S.split(""))) {
			if (map.containsKey(stone)) {
				map.put(stone, map.get(stone) + 1);
			} else
				map.put(stone, 1);
		}

		for (String jewel : Arrays.asList(J.split(""))) {
			if (map.containsKey(jewel))
				result += map.get(jewel);
		}

		return result;
	}
}
