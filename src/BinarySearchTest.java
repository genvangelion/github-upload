/**
 * BinarySearchTest Class
 * Tests the ObjectBinarySearcher and ObjectQuickSorter classes on a string 
 * containing the names of the rappers in the rap group "XXL Freshman Class of 2016".
 * Java implementation and demonstration of the QuickSort and Binary Search algorithms.
 * @author Genesis Montejo COSC-2436.250
 * 7/9/2021
 */
public class BinarySearchTest {
	public static void main(String[] args)
	{
		// unsorted String array
		String[] xxl_2016 = {"Kodak Black", "21 Savage", "Lil Uzi Vert", "Lil Yachty", "Denzel Curry"};
		// display unsorted array
		System.out.println("XXL Freshman Class of 2016 Rappers (Unsorted):");
		for (String rapper : xxl_2016)
			System.out.println(rapper);
		
		// create ObjectBinarySearcher and ObjectQuickSorter objects
		ObjectQuickSorter oqs = new ObjectQuickSorter();
		ObjectBinarySearcher obs = new ObjectBinarySearcher();
		
		// sort the String array with quick sort method
		oqs.objectQuickSorter(xxl_2016, 0, xxl_2016.length-1);
		// at this point, the list xxl_2016 is now sorted
		System.out.println("\nXXL Freshman Class of 2016 Rappers (Sorted):");
		for (String rapper : xxl_2016)
			System.out.println(rapper);
		
		// search for two different values in the array
		System.out.println("\nSearch for rappers \"Lil Mosey\" and \"Lil Uzi Vert\" in xxl_2016:");
		String[] search_for = {"Lil Mosey", "Lil Uzi Vert"};
		for (String rapper : search_for)
		{
			int result = obs.objectBinarySearcher(xxl_2016, 0, xxl_2016.length-1, rapper);
			if (result >= 0)
				System.out.println(rapper + " is in the XXL Freshman Class of 2016.");
			else
				System.out.println(rapper + " is not in the XXL Freshman Class of 2016.");
		}
	}
}
