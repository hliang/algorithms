/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

public class Single {
    public static int singleNumber_slow1(int[] A) {
        for(int i=0; i<A.length; i++){
            int n = A[i];
            
            for(int j=0; j<A.length; j++){
                System.out.println(i + " " + n + " " + j + " " + A[j]);
                if(n==A[j] && i!=j){
                    System.out.println("=");
                    break;
                }
                
                if(j == A.length - 1){
                    return n;
                }
            }
        }
        return 0;
    }
    
    public static int singleNumber_slow2(int[] A) {
        java.util.List B = new java.util.ArrayList();
        for(int i : A){
            System.out.println(i);
            if(B.contains(i)){
                //System.out.println("remove: " + i);
                B.remove((Object) i);
                //System.out.println(B);
            } else {
                //System.out.println("add: " + i);
                B.add(i);
                //System.out.println(B);
            }
            System.out.println("\t" + B);
        }
        return (Integer) B.get(0);
    }
    
    // use XOR;
    // A XOR A = 0;
    public static int singleNumber(int[] A) {
    	int res=0;
        for(int i=0;i<A.length;i++){
            res=res ^ A[i];
        }
        return res;
    }
    
    public static void main(String[] args){
        int[] A = {55, 66, 88, 55, 66, 77, 88};
        System.out.println("Missing: " + singleNumber(A));
    }
    
}
