
import java.util.Arrays;

/**
 * 
 * @author florafeng Given an array of n positive integers and a positive
 *         integer s, find the minimal length of a subarray of which the sum ≥
 *         s. If there isn't one, return 0 instead. For example, given the array
 *         [2,3,1,2,4,3] and s = 7, the subarray [4,3] has the minimal length of
 *         2 under the problem constraint, return 2.
 */
public class MinSubArrayLen {
	public int minSubArrayLen(int[] arr, int target) {

		if (arr == null || arr.length <= 1) {
			return 0;
		}

		Arrays.sort(arr);

		int result = arr.length;
		int i = 0;
		int cut = 0;
		int sum = 0;
		boolean flag = false;

		while (i <= arr.length) {
			if (sum < target) {
				if (i == arr.length) {
					break;
				}
				sum += arr[i];
				i++;
			} else if (sum >= target) {
				flag = true;
				if (cut == i - 1) {
					return 1;
				} else {
					result = Math.min(result, i - cut);
					sum -= arr[cut];
					cut++;
				}
			}
		}
		if (flag) {
			return result;
		} else
			return 0;

	}

	public static void main(String[] args) {
		MinSubArrayLen i = new MinSubArrayLen();
		int[] arr = { 1, 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(i.minSubArrayLen(arr, 10));
	}

}
