import java.util.Arrays;

/**
 * @author florafeng 
 * 
 * Follow up for "Remove Duplicates": What if duplicates are
 *         allowed at most twice? For example, given sorted array A =
 *         [1,1,1,2,2,3], your function should return length = 5, and A is now
 *         [1,1,2,2,3]. So this problem also requires in-place array
 *         manipulation.
 */
public class RemoveDuplicateII {
	public int removeDuplicate(int[] arr) {
		if (arr.length < 2 || arr == null) {
			return arr.length;
		}

		Arrays.sort(arr);

		int curr = 2;
		int pre = 1;

		while (curr <= arr.length - 1) {
			if (arr[curr] == arr[pre] && arr[curr] == arr[pre - 1]) {
				curr++;
			} else {
				pre++;
				arr[pre] = arr[curr];
				curr++;
			}
		}

		return pre + 1;

	}
	
	public static void main(String[] args) {
		RemoveDuplicateII i = new RemoveDuplicateII();
		int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,4};
		System.out.println(i.removeDuplicate(arr));
	}
}
/*
 * Time Complexity: O(n)
 */
