
import java.util.Arrays;

/**
 * 
 * @author florafeng
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 *     For example, given array S = {-1 2 1 -4}, and target = 1.
 *         The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

public class ThreeSumClosest {
	public int threeSumClosest(int[] arr, int target){
		Arrays.sort(arr);

		int diff = Integer.MAX_VALUE;
		int result = 0;

		if(arr.length<3 || arr== null){
			return result;
		}

		for(int i=0; i<arr.length-2; i++){
			int j=i+1;
			int k=arr.length-1;
			while(j<k){

				if(arr[i] + arr[j] + arr[k] == target ){
					return arr[i] + arr[j] + arr[k];
				}

				if(arr[i] + arr[j] + arr[k] < target){
					j++;
				}
				if(arr[i] + arr[j] + arr[k] > target){
					k--;
				}
				if(arr[i] + arr[j] + arr[k] - target < diff){
					diff = arr[i] + arr[j] + arr[k] - target;
					result = arr[i] + arr[j] + arr[k];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ThreeSumClosest in = new ThreeSumClosest();
		int[] arr = { -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int l1 = in.threeSumClosest(arr, 1);
		System.out.println("The sum closet to target is " + l1);

	}
}

/*
 * Time complexity is O(n^2)
 */









 
