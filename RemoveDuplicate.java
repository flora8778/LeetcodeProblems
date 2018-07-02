/**
 * 
 * @author florafeng
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].
 */
public class RemoveDuplicate {
	public int reomveDuplicate(int[] arr){
		int count = arr.length;
		if(arr.length<2 || arr == null){
			return arr.length;
		}

		Arrays.sort(arr);

		for(int i=0; i<arr.length-1;i++){
			int j= i+1;
			if(arr[j] == arr[i]){
				count --;
			}
		}

		return count;
	}
}

/*
 * Time complexity: O(n)
 */