import java.util.Arrays;

/**
 * @author florafeng 
 * 
 * Given an array nums, write a function to move all 0’s to the end of it 
 *  while maintaining the relative order of the non-zero elements. 
 * 		For example, given nums = [0, 1, 0, 3, 12], 
 * 					after calling your function, nums should be [1, 3, 12, 0, 0].
 */

public class MoveZeros {
	public void moveZeros(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			while (j < arr.length) {
				if (arr[i] == 0) {
					if (arr[j] != 0) {
						arr[i] = arr[j];
						arr[j] = 0;
						i++;
						j++;
					} else {
						j++;
					}
				} else {
					i++;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 0, 3, 4, 5, 0, 7 };
		MoveZeros i = new MoveZeros();
		i.moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}

/*
 * Time Complexity O(n)
 */




