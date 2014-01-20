/* Given a sorted array and a target value,
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */

public class SearchInsertPosition {
	
	public static int searchInsert_slow(int[] A, int target) {
        for(int i=0; i<A.length; i++){
        	System.out.println(i + " " + A[i]);
            if(A[i] >= target){
                return i;
            }
        }
        return A.length;
    }
	
	// recursive method
	// issue: get an exception when input Array is empty.
	public static int searchInsert(int[] A, int target) {
		// System.out.println(java.util.Arrays.toString(A));
        int mid = A.length / 2;
        // System.out.println("k = " + mid + " A[k] = " + A[mid]);
        if(target > A[mid]) {
        	// System.out.println(target + " > " + A[mid]);
        	if(mid == 0) { return 1;}
        	int[] sliceA = java.util.Arrays.copyOfRange(A, mid, A.length);
        	// System.out.println("new array: " + java.util.Arrays.toString(sliceA));
        	return searchInsert(sliceA, target) + mid;
        } else {
        	// System.out.println(target + " < " + A[mid]);
        	if(mid == 0) { return 0;}
        	int[] sliceA = java.util.Arrays.copyOfRange(A, 0, mid);
        	// System.out.println("new array: " + java.util.Arrays.toString(sliceA));
        	return searchInsert(sliceA, target);
        }
    }
	
	public static void main(String[] args){
		int[] A = {1,3,5,6};
        System.out.println("Missing: " + searchInsert(A, 5)); // 2
        System.out.println("Missing: " + searchInsert(A, 2));  // 1
        System.out.println("Missing: " + searchInsert(A, 7));  // 4
        System.out.println("Missing: " + searchInsert(A, 0));  // 0
	}
}
