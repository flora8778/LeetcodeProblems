/**
 * 
 * @author florafeng
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Note:
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * 		Input: numbers = [2,7,11,15], target = 9
 * 		Output: [1,2]
 * 		Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 */
import java.util.Arrays;
public class TwoSumIISortedArray{

public int[] twoSum(int[] arr, int target) {
		if (arr.length < 2 || arr == null) {
			return new int[] { 0, 0 };
		}

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int result = arr[left] + arr[right];
			if (result > target) {
				right -= 1;
			} else if (result < target) {
				left++;
			} else {
				return new int[] { left, right };
			}

		}
		throw new IllegalArgumentException("No two sum solution!");
	}

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 10;
		TwoSumIISortedArray a = new TwoSumIISortedArray();
		int[] o = a.twoSum(i, target);
		System.out.println(Arrays.toString(o));
	}
}
/*
 * Time complexity : O(n)
 * Space complexity : O(1). 
 */
