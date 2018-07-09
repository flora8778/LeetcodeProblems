/**
 * 
 * @author florafeng
 * There are N children standing in a line. 
 * Each child is assigned a rating value. 
 * You are giving candies to these children subjected to the following requirements:
 * 1. Each child must have at least one candy. 
 * 2. Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 */

public class Candy {
		public int candy(int[] rating){
		if(rating.length==0 && rating == null){
			return 0;
		}
		int[] candies = new int[rating.length];

		for(int i=1; i<rating.length;i++){
			if(rating[i] > rating[i-1] && candies[i] <= candies[i-1]){
				candies[i] = candies[i-1] + 1;
			}
		}
		// case that second last one is 1 candy, also rating > last one rating. 
		// so should do once more from right to left.
		for(int i=rating.length-2; i>=0;i--){
			if(rating[i] > rating[i+1] && candies[i]<=candies[i+1]){
				candies[i] = candies[i+1] + 1;
			}
		}
		
		int sum = candies.length; //this is to assign each kid 1 candy.
		for(int i=0; i<candies.length;i++){
			sum+=candies[i];
		}
		return sum;
	}
}
