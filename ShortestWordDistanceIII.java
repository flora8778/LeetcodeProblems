package firstPractice;
/**
 * 
 * @author florafeng
 *This is a follow-up problem of Shortest Word Distance. 
 *The only difference is now word1 could be the same as word2.
 *Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 *word1 and word2 may be the same and they represent two individual words in the list.
 *For example, Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *Given word1 = “makes”, word2 = “coding”, return 1. Given word1 = "makes", word2 = "makes", return 3.
 */
public class ShortestWordDistanceIII {

	public int shortestWordDistance(String[] list, String a, String b){
		int p1 = -1;
		int p2 = -1;
		int min = Integer.MAX_VALUE;
		int turn = 0;

		if(a.equals(b)){
			turn =1;
		}

		for(int i =0; i<list.length;i++){
			if(list[i].equals(a) && turn == 0){
				p1 = i;
				if(p2!=-1) {
					min = Math.min(min,p1-p2);
				}
			}else if(list[i].equals(b) && turn == 0){
				p2 = i;
				if(p1!=-1) {
					min = Math.min(min, p2-p1);
				}
				// the case if a==b
			}else if(list[i].equals(a) && turn == 1){
				p1 = i;
				turn = 2;
				if(p2!=-1) {
					min = Math.min(min,p1-p2);
				}
			}
			else if(list[i].equals(b) && turn == 2){
				p2 = i;
				turn = 1;
				if(p1!=-1) {
					min = Math.min(min, p2-p1);
				}

			}
		}

		return min;
	}
	
	public static void main(String[] args) {
		ShortestWordDistance s = new ShortestWordDistance();
		String[] list = {"practice", "makes", "perfect", "coding", "makes"};
		String a = "makes";
		String b = "makes";
		int result = s.shortestWordDistance(list, a, b);
		System.out.println(result);
	}

}
