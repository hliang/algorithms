/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2].
 */

public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] A) {
		// empty array
		if(A.length == 0) {
			return 0;
		}
		
		int lastInt = A[0];
	    int j = 1;  // number of valid items.
	    for (int i = 1; i < A.length; i++) { // start from i=1
	    	if (A[i] != lastInt) { // meet a different value
	    		A[j] = A[i];       // store it
	    		j++;
	    	}
	    	lastInt = A[i];
	    }
		// System.out.println(java.util.Arrays.toString(A));
        return j;
    }
	
	public static void main(String[] args){
		int[] A = {1,1,2,2,2,3,4,4};
        System.out.println("First (" + removeDuplicates(A) + ") elements of " + java.util.Arrays.toString(A));
	}
}
