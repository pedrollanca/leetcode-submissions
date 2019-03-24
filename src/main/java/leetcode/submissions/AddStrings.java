package leetcode.submissions;

//415. Add Strings
//Easy
//
//366
//
//122
//
//Favorite
//
//Share
//Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
//
//Note:
//
//The length of both num1 and num2 is < 5100.
//Both num1 and num2 contains only digits 0-9.
//Both num1 and num2 does not contain any leading zero.
//You must not use any built-in BigInteger library or convert the inputs to integer directly.
public class AddStrings {
	public static String addStrings(String num1, String num2) {
		int[] n1;
		int[] n2;
		int tmp = 0;
		int i = 0, j = 0;
		int max = 0;
		StringBuilder results = new StringBuilder();

		if (num1.length() >= num2.length())
			max = num1.length();
		else
			max = num2.length();

		n1 = new int[max];
		n2 = new int[max];

		for (i = num1.length() - 1, j = max - 1; i >= 0; i--, j--) {
			n1[j] = num1.charAt(i) - '0';
		}

		for (i = num2.length() - 1, j = max - 1; i >= 0; i--, j--) {
			n2[j] = num2.charAt(i) - '0';
		}

		for (i = n1.length - 1; i >= 0; i--) {
			tmp = n1[i] + n2[i];
			if (tmp >= 10) {
				results.append(tmp - 10);
				if (i > 0)
					n1[i - 1] += 1;
				else
					results.append(1);
			} else
				results.append(tmp);
		}

		results.reverse();

		if (results.length() == 1)
			return results.toString();

		i = 0;
		while (i < results.length() && results.charAt(i) == '0') {
			i++;
		}

		return results.substring(i);

	}

	public static void main(String args[]) {
		System.out.println(addStrings("9", "99"));
	}
}
