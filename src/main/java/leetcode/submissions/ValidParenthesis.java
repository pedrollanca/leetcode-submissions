package leetcode.submissions;

import java.util.LinkedList;

//20. Valid Parentheses
//Easy
//
//2664
//
//135
//
//Favorite
//
//Share
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//Example 2:
//
//Input: "()[]{}"
//Output: true
//Example 3:
//
//Input: "(]"
//Output: false
//Example 4:
//
//Input: "([)]"
//Output: false
//Example 5:
//
//Input: "{[]}"
//Output: true

class ValidParenthesis {
	public boolean isValid(String s) {
		LinkedList<Character> q = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '}':
				if (q.peek() != null && q.peek() == '{')
					q.pop();
				else
					q.push(s.charAt(i));
				break;
			case ']':
				if (q.peek() != null && q.peek() == '[')
					q.pop();
				else
					q.push(s.charAt(i));
				break;
			case ')':
				if (q.peek() != null && q.peek() == '(')
					q.pop();
				else
					q.push(s.charAt(i));
				break;
			default:
				q.push(s.charAt(i));
			}
		}
		System.out.println(q);
		return q.isEmpty();
	}
}
