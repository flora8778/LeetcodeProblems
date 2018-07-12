

import java.util.ArrayList;
import java.util.HashMap;

/** 
 * @author florafeng
 * This is a follow up of Shortest Word Distance. 
 * The only difference is now you are given the list of words and your method will be called repeatedly many times with different parameters.
 *  How would you optimize it?
 *  Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.
 *  For example, Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *  Given word1 = “coding”, word2 = “practice”, return 3. Given word1 = "makes", word2 = "coding", return 1.
 *
 */
public class ShortestWordDistanceII {
	HashMap<String, ArrayList<Integer>> map;

	public ShortestWordDistanceII(String[] wordsList){
		map = new HashMap<String, ArrayList<Integer>>();
		for(int i =0; i<wordsList.length;i++){
			if(map.containsKey(wordsList[i])){
				//if word already exsits, add one more index beyond previous index
				map.get(wordsList[i]).add(i);
			}else{
				//store the word and the index
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(wordsList[i], list);
			}
		}

	}

	public int shortest(String a, String b){
		ArrayList<Integer> index1 = map.get(a);
		ArrayList<Integer> index2 = map.get(b);

		int result = Integer.MAX_VALUE;

		int i = 0, j = 0;
		while(i<index1.size() && j<index2.size()) {
			result = Math.min(result, Math.abs(index1.get(i) - index2.get(j)));
			// to find the min distance: if index2>index1, try add i to min the subtraction
			if(index1.get(i)<index2.get(j)) {
				i++;
			}else {
				j++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] wordlist = {"practice", "makes", "perfect", "coding", "makes"};
		ShortestWordDistanceII  l = new ShortestWordDistanceII(wordlist);
		int result = l.shortest("makes", "perfect");
		System.out.println(result);
	}

}

