package firstPractice;

import java.util.Arrays;

/**
 * 
 * @author florafeng Given two sorted integer arrays A and B, merge B into A as
 *         one sorted array. Note: You may assume that A has enough space to
 *         hold additional elements from B. The number of elements initialized
 *         in A and B are m and n respectively.
 *
 */
public class MergeSort {
	public int[] mergeSort(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int[] c = new int[a.length + b.length];
		int k = 0;

		while (i<a.length && j< b.length ) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;

			} else {
				if (a[i] > b[j]) {
					c[k] = b[j];
					k++;
					j++;
				}
			}
		}
		//copy remaining numbers
		while(i<a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		
		if(j<b.length) {
			System.arraycopy(b, j, c, k, b.length-j);
		}
			
		return c;
	}

	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		int[] a = { 1, 3, 5, 7, 9, 10, 11 };
		int[] b = { 2, 4, 6, 8 };
		int[] c = m.mergeSort(a, b);
		System.out.println(Arrays.toString(c));

	}

}
