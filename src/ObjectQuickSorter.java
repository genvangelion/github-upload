/**
 * ObjectQuickSorter Class
 * Includes objectQuickSorter method and helper partition and swap methods to
 * quickly sort an array with the QuickSort algorithm.
 * Java implementation of the QuickSort algorithm.
 * @author Genesis Montejo COSC-2436.250
 * 7/9/2021
 */
public class ObjectQuickSorter {
	/**
	 * objectQuickSorter method - Recursive QuickSort algorithm that sorts
	 * arrays of any type that implements Comparable
	 * @param <T> - type parameter that accepts any type that implement Comparable
	 * @param arr - array to be sorted
	 * @param start - start index of list/sublist to be sorted
	 * @param end - end index of list/sublist to be sorted
	 */
	public <T extends Comparable<T>>
	void objectQuickSorter(T[] arr, int start, int end)
	{
		if (start < end)
		{
			int pivot = partition(arr, start, end);	// retrieve pivot index after partitioning
			objectQuickSorter(arr, start, pivot-1);	// recursively quicksort left sublist
			objectQuickSorter(arr, pivot+1, end);	// recursively quicksort right sublist
		}
	}
	
	/**
	 * partition helper method - partitions given list/sublist 
	 * @param <T> - type parameter that accepts any type that implements Comparable
	 * @param arr - list/sublist to be partitioned
	 * @param start - start index of list/sublist
	 * @param end - end index of list/sublist
	 * @return - index of pivot value
	 */
	public <T extends Comparable<T>>
	int partition(T[] arr, int start, int end)
	{
		T pivot = arr[start];	// arbitrarily select first element as pivot
		int endLeft = start;	// end of less-than-pivot values (subscript val)
		
		// traverse sublist
		for (int scan = start+1; scan <= end; scan++)
		{
			// if element at scan index is < pivot, increment endLeft then swap with scan item
			if (arr[scan].compareTo(pivot) < 0)
			{
				endLeft++;
				swap(arr, endLeft, scan);
			}
		}
		// swap the pivot with endLeft item to put pivot between left and right sublists
		swap(arr, start, endLeft);
		return endLeft;	// because pivot swapped places with endLeft, endLeft holds the index of the pivot
	}
	
	/**
	 * swap helper method- swaps elements at specified indexes of a list
	 * @param <T> - type parameter that must extend Comparable
	 * @param arr - array whose elements will be swapped
	 * @param a - index a whose element will be swapped with element at b
	 * @param b - index b whose element will be swapped with element at a
	 */
	public <T extends Comparable<T>>
	void swap(T[] arr, int a, int b)
	{
		T temp = arr[a];	// store value of item at index a
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
