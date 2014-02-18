/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

import java.util.Arrays;

public class RemoveElement {
    // solution of my own:
    public static int removeElement(int[] A, int elem) {
        int l = A.length;
        int k = 0;
        for(int i = 0; i<l; i++) {
            while (A[i] == elem && i < l-k) {
                k++;
                A[i] = A[l-k];
            }
        }
        return l-k;
    }

    // another method from internet:
    public static int removeElement2(int[] A, int elem) {
        int count = 0;
        for (int i = 0; i < A.length; ++i) {
            if (A[i] == elem) {
                ++count;
            } else if(count > 0) {
                A[i - count] = A[i];
            }
        }
        return A.length - count;
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 2, 3, 2, 4, 5}; 
        //int[] a = {1}; 
        int b = 2;
        System.out.println(Arrays.toString(a));
        System.out.println(removeElement(a, b));
        System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.copyOfRange(a, 0, b));
        // int[] newArr = Arrays.copyOfRange(a, 0, b);
        // System.out.println( newArr );
    }
}
