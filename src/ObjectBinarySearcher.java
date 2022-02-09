/**
 * ObjectBinarySearcher Class
 * Includes recursive binary searcher method that searches an array for a value.
 * Returns -1 if not found, index of the target value if found.
 * The given array must be sorted in ascending order.
 * Java implementation of Binary Search algorithm.
 * @author Genesis Montejo COSC-2436.250
 * 7/9/2021
 */
public class ObjectBinarySearcher {
	/**
	 * objectBinarySearcher method
	 * Recursive method that searches a given list/sublist for a value.
	 * @param <T> - type parameter that accepts any type that implements Comparable
	 * @param arr - array that will be searched for the value x- must be sorted!
	 * @param lower - lower index where the search will be started
	 * @param upper - upper index where the search will end
	 * @param x - target value that is being searched for
	 * @return - returns -1 if the value x is not in arr,
	 * 			index of value matching x if found in arr
	 */
	public <T extends Comparable<T>> 
	int objectBinarySearcher(T[] arr, int lower, int upper, T x) {
		// compute middle index
		int middle = (upper + lower) / 2;
		
		// base case
		if (lower > upper)
			return -1;
		
		// if base case is not met, compare middle element to target
		if (x.compareTo(arr[middle]) == 0)							// middle element == target: return index of middle
			return middle;
		else if (x.compareTo(arr[middle]) > 0)						// middle element < target: search upper half
			return objectBinarySearcher(arr, middle+1, upper, x);
		else 														// middle element > target: search lower half
			return objectBinarySearcher(arr, lower, middle-1, x);
		
	}
}
