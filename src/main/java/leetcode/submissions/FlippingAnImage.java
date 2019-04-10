//832. Flipping an Image
//Easy
//
//451
//
//94
//
//Favorite
//
//Share
//Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
//
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
//
//Example 1:
//
//Input: [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//Example 2:
//
//Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Notes:
//
//1 <= A.length = A[0].length <= 20
//0 <= A[i][j] <= 1
package leetcode.submissions;

public class FlippingAnImage {

	public int[][] flipAndInvertImage(int[][] A) {
		int i, j;
		for (i = 0; i < A.length; i++) {
			reverse(A[i]);
			invert(A[i]);
		}

		return A;
	}

	public void reverse(int[] a) {
		int tmp = 0;
		for (int i = 0; i < a.length / 2; i++) {
			tmp = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = tmp;
		}
	}

	public void invert(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				a[i] = 1;
			else
				a[i] = 0;
		}
	}

}
