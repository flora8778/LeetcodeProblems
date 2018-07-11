
/**
 * @author florafeng Given two strings S and T, determine if they are both one
 *         edit distance apart.
 */
public class OneDigitDistance {
	public boolean isOneDigitDistance(String arr1, String arr2) {
		int diff = 0;

		if (arr1 == null || arr2 == null) {
			return false;
		}

		if (Math.abs(arr1.length() - arr2.length()) > 1) {
			return false;
		}
		// make two pointers to each array
		int i = 0;
		int j = 0;

		while (i < arr1.length() && j < arr2.length()) {
			if (arr1.charAt(i) == arr2.charAt(j)) {
				i++;
				j++;
			} else {
				diff++;
				if (diff > 1) {
					return false;
				}

				if ( arr1.length() > arr2.length()) {
					i++;
				} else if (arr1.length() < arr2.length()) {
					j++;
				} else {
					i++;
					j++;
				}
			}
		}
		if (i < arr1.length() || j < arr2.length()) {
			diff++;
		}

		if (diff == 1) {
			return true;
		}
		return false;

	}
}
