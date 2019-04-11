//965. Univalued Binary Tree
//Easy
//
//146
//
//25
//
//Favorite
//
//Share
//A binary tree is univalued if every node in the tree has the same value.
//
//Return true if and only if the given tree is univalued.
//
// 
//
//Example 1:
//
//
//Input: [1,1,1,1,1,null,1]
//Output: true
//Example 2:
//
//
//Input: [2,2,2,5,2]
//Output: false
// 
//
//Note:
//
//The number of nodes in the given tree will be in the range [1, 100].
//Each node's value will be an integer in the range [0, 99].
package leetcode.submissions;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class UniValuedBinaryTree {
	public boolean isUnivalTree(TreeNode root) {
		return checkTree(root, root.val);
	}

	public boolean checkTree(TreeNode root, int val) {
		if (root.val != val)
			return false;
		if (root.left != null && root.right != null)
			return checkTree(root.left, val) && checkTree(root.right, val);
		if (root.left != null)
			return checkTree(root.left, val);
		if (root.right != null)
			return checkTree(root.right, val);

		return true;
	}
}
