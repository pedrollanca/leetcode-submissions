package leetcode.submissions;

//Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

class ToLowerCaser {
	public String toLowerCase(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) < 91)
				result.append((char) (str.charAt(i) + 32));
			else
				result.append(str.charAt(i));
		}

		return result.toString();
	}
}