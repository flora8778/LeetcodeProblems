/**
 * @author florafeng
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
 *  Find all unique quadruplets in the array which gives the sum of target.
 * Note: Elements in a quadruplet (a,b,c,d) must be in non-descending order.
 * (ie, a ≤ b ≤ c ≤ d) The solution set must not contain duplicate quadruplets.
 * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 *   A solution set is:
 *   (-1, 0, 0, 1)
 *   (-2, -1, 1, 2)
 *   (-2, 0, 0, 2)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] arr, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (arr == null || arr.length < 4) {
			return result;
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 3; i++) {
			if (i == 0 || arr[i] > arr[i - 1]) {
				int j = i + 1;
				int k = j + 1;
				int l = arr.length - 1;
				while (k < l) {
					if (arr[i] + arr[j] + arr[k] + arr[l] > target) {
						l--;
					} else if (arr[i] + arr[j] + arr[k] + arr[l] < target) {
						k++;
					} else {
						List<Integer> subList = new ArrayList<Integer>();
						subList.add(arr[i]);
						subList.add(arr[j]);
						subList.add(arr[k]);
						subList.add(arr[l]);
						result.add(subList);
						k++;
						l--;

						while (k < l && arr[l] == arr[l + 1]) {
							l--;
						}
						while (k < l && arr[k] == arr[k - 1]) {
							k++;
						}

					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		FourSum in = new FourSum();
		int[] arr = { -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<List<Integer>> l1 = in.fourSum(arr, 10);
		System.out.println(l1);

	}
}

/**
 * Time Complexity: O(n^2)
 */



