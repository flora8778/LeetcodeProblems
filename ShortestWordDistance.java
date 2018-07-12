/**
 * 
 * @author florafeng
 * Given a list of words and two words word1 and word2,
 * return the shortest distance between these two words in the list.
 * For example, Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “coding”, word2 = “practice”, return 3. Given word1 = "makes", word2 = "coding", return 1.
 */
public class ShortestWordDistance {
	public int shortestWordDistance(String[] list, String a, String b){
		int p1 = -1;
		int p2 = -1;
		int min = Integer.MAX_VALUE;

		for(int i =0; i<list.length;i++){
			if(list[i].equals(a)){
				p1 = i;
				if(p2!=-1) {
					min = Math.min(min,p1-p2);
				}
			}else if(list[i].equals(b)){
				p2 = i;
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
		String a = "coding";
		String b = "makes";
		int result = s.shortestWordDistance(list, a, b);
		System.out.println(result);
	}
}
