
public class ArrayUtil {
	/** Shifts each array element to the next higher index, discarding the 
	 *  original last element, and inserts the new number at the front. 
	 *  @param arr the array to manipulate
	 * 		Precondition: arr.length > 0
	 *  @param num the new number to insert at the front of arr
	 * 		Postcondition: The original elements of arr have been shifted to 
	 * 				 	   the next higher index, and arr[0] == num. 
	 * 				  	   The original element at the highest index has been 
	 * 	  				   discarded.
	*/
	public static void shiftArray(int[] arr, int num) 
	{ 
		int temp1 = arr[0];
		for (int i=0; i<arr.length-1; i++) {
			int temp = arr[i+1];
			arr[i+1] = temp1;
			temp1 = temp;
		}
		arr[0] = num;
	}
	
	// There may be methods that are not shown.
}
