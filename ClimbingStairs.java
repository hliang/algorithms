/* 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class ClimbingStairs {
    // recursive. slow!
    public static int climbStairs2slow(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            // take one step or two steps
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

    public static int climbStairs(int n) {
        if (n <=2 ) {     // two or less steps
            return n;
        } else {          // three or more steps
            int[] arr = new int[n];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            for(int i = 3; i < n; i++) {
                // combine two previous results
                arr[i] = arr[i-1] + arr[i-2];
            }
            return arr[n-1] + arr[n-2];
        }
    }

    public static void main(String[ ] args) {
        int n = 4;
        System.out.println(climbStairs2slow(n));
        System.out.println(climbStairs(n));
    }
}
