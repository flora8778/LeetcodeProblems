/** Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 Example:
	 Given nums = [2, 7, 11, 15], target = 9,
	 Because nums[0] + nums[1] = 2 + 7 = 9,
	 return [0, 1].
*/
	 import java.util.Arrays;
	 import java.util.HashMap;

	 class TwoSum{
	 	
	 	public int[] twoSum(int[] numbers, int target){
	 		
	 		if(numbers.length<2 || numbers == null){
	 			return new int[]{0,0};
	 		}

	 		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

	 		for(int i = 0; i<numbers.length;i++){
	 			int com = target - numbers[i];
	 			if(map.containsKey(com)){
	 				return new int[]{map.get(com),i};
	 			}else{
	 				map.put(numbers[i],i);
	 			}
	 		}
	 		throw new IllegalArgumentException("No two sum solution!");
	 	}

	 	public static void main(String[] args) {
	 		int[] arr = {1,2,3,4,5,6,7,8};
	 		int target = 9;

	 		TwoSum t = new TwoSum();
	 		int[] result = t.twoSum(arr,target);
	 		System.out.println(Arrays.toString(result));
	 	}
	 }

/*
 * Complexity Analysis:
Time complexity : O(n). 
We traverse the list containing nn elements only once. 
Each look up in the table costs only O(1) time.

Space complexity : O(n). 
The extra space required depends on the number of items stored in the hash table, 
which stores at most nn elements.
 */

/*
Brute Force Algorithm */



