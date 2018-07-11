
/**
 * 
 * @author florafeng Given two sorted integer arrays A and B, merge B into A as
 *         one sorted array. Note: You may assume that A has enough space to
 *         hold additional elements from B. The number of elements initialized
 *         in A and B are m and n respectively.
 *
 */
public class MergeSortArray {
	public int[] mergeSort(int[] a, int[] b) {
		int i = a.length - 1;
		int j = b.length - 1;
		int[] c = new int[i+j+1];

		for (int k = a.length + b.length - 1; k >= 0; k--) {
			if (a[i] > b[j] || j<=0) {
				c[k] = a[i];
				i--;
			} else {
				if (a[i] < b[j] || i<=0) {
					c[k] = b[j];
					j--;
				}
			}
		}
		
		return c;
	}

	public static void main(String[] args) {
		MergeSortArray m = new MergeSortArray();
		int[] a = { 1, 3, 5, 7 };
		int[] b = { 2, 4, 6, 8 };
		
		int[] c = m.mergeSort(a, b);
		System.out.println(c);
		  
	}
}
