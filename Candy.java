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
		if(rating.length<1 && rating == null){
			return 0;
		}

		int[] candies = new int[rating.length];

		for(int i=0; i<rating.length;i++){
			if(rating[i] > rating[i+1]){
				candies[i] = candies[i+1] +1;
			}
			if(rating[i] < rating[i+1]){
				candies[i+1] = candies[i] +1;
			}
			else{
				candies[i]+1;
			}
		}


		for(int i=0; i<candies.length;i++){
			if(candies[i])
		}
	}
}
