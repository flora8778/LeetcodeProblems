
/**
 * @author florafeng Given an array and a value, remove all instances of that
 *         value in place and return the new length. (Note: The order of
 *         elements can be changed. It doesn’t matter what you leave beyond the
 *         new length.)
 */
public class RemoveElements {
	public int removeEle(int[] arr, int value) {
		int l = arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				l--;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int value = 0;
		int[] arr = { 0, 1, 0, 2, 0, 3, 0, 4 };
		RemoveElements i = new RemoveElements();
		int o = i.removeEle(arr, value);
		System.out.println(o);
	}
}
