/** 
 * @author florafeng
 *Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 *Find all unique triplets in the array which gives the sum of zero.
 *Note:
 *The solution set must not contain duplicate triplets and must be in non-descending order.
 *	Example:
 *		Given array nums = [-1, 0, 1, 2, -1, -4],
 *		A solution set is
 *		[ [-1, 0, 1], [-1, -1, 2] ]
 */

import java.util.*;

public class ThreeSum{
public List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (arr.length < 3 || arr == null) {
			return result;

		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			if (i == 0 || arr[i] > arr[i - 1]) {
				int j = i + 1;
				int k = arr.length - 1;
				while (j < k) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(arr[i]);
						l.add(arr[j]);
						l.add(arr[k]);
						result.add(l);

						j++;
						k--;

						while (j < k && arr[j] == arr[j - 1]) {
							j++;
						}

						while (j < k && arr[k] == arr[k + 1]) {
							k--;
						}

					} else if (arr[i] + arr[j] + arr[k] < 0) {
						j++;
					} else {
						k--;
					}

				}
			}
		}
		return result;
	}
}












