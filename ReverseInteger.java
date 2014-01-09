/*
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */

public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        //System.out.println(Math.log10(Math.abs(x)));
        
        int length = (int) Math.log10(Math.abs(x)) + 1;
        System.out.println("length " + length);
        for (int i=0; i<length; i++) {
            int digit = x % 10;
            x = x/10;
            //System.out.println(Math.pow(length-1, 10));
            result += digit * Math.pow(10, length-i-1);
            System.out.println(digit + " " + x +" " + result);
        }
        return result;
    }
    
    public static void main(String[] args){
        System.out.println(reverse(0));
    }
}
