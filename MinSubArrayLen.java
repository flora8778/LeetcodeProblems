/**
 * 
 * @author florafeng
 *Given an array of n positive integers and a positive integer s,
 * find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 * For example, given the array [2,3,1,2,4,3] and s = 7,
 * the subarray [4,3] has the minimal length of 2 under the problem constraint, return 2.
 */
public class MinSubArrayLen {
	public int minSubArrayLen(int[] arr, int target){
		int result = 0;
		Array.sort(arr);

		if(arr == null || arr.length ==1){
			return result;
		}

		for(int i=0; i< arr.length-2;i++){
			int j=arr.length-1;
			if(arr[i] + arr[j] == target){
				resultList.add(arr[i]);
				resultList.add(arr[j]);
				return resultList;
			}
			else if(arr[i] + arr[j] > target){
				i++;
			}
			else if(arr[i] + arr[j] > target){
				j--;
			}else{
				int k = j+1;
			}
		}


	}
}
