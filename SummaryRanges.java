
import java.util.ArrayList;
import java.util.List;

/**
 * @author florafeng
 * Given a sorted integer array without duplicates, return the summary of its ranges for consecutive numbers.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {
	public List<String> summaryRanges(int[] arr){
		List<String> result = new ArrayList<String>();

		if(arr.length<1 || arr == null){
			return result;
		}

		if(arr.length == 1){
			result.add(arr[0] + "->");
			return result;
		}
		
		int pre = arr[0];
		int curr = pre;
		for(int i =1; i<arr.length;i++){
			if((arr[i]-pre) == 1){
				if(i==arr.length){
					result.add(pre + "->" + arr[i]);
				}else if(pre == curr){
					result.add(pre + " ");
				}else {
					result.add(curr + "->" + pre);
				}
				if(i == arr.length-1){
					result.add(arr[i] + " ");
				}
				curr = arr[i];
			}
	
			pre = arr[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		SummaryRanges s = new SummaryRanges();
		int[] arr = {1,2,3,6,7,9,10,11};
		List<String> result = s.summaryRanges(arr);
		System.out.println(result);
	}
}