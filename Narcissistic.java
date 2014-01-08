// In recreational number theory, a narcissistic number 
// (also known as a pluperfect digital invariant (PPDI), an Armstrong number 
// or a plus perfect number) is a number that is 
// the sum of its own digits each raised to the power of the number of digits.

public class Narcissistic {
    public static boolean isNac(int n){
        int orig = n;                    // original number
        int k = (int) Math.log10(n) + 1; // number of digits
        
        // sum of its own digits each raised to the power of the number of digits.
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, k);
            n = n/10;
        }
        
        return orig==sum;
    }
    public static void main(String[] args){
        int num;
        // accept number from command line
        if(args.length > 0) {
            num = Integer.parseInt(args[0]);
        } else {
            // set number manually below
            num = 1111;
        }
        // check if the given number is Narcissistic
        // System.out.println(num + " is " + isNac(num)?"YES":"NOT" + " narcissistic number.");
        System.out.println(num + " is " + ( isNac(num) ? "" : "NOT " ) + "narcissistic number.");
        // print all Narcissistic number from 1 to givenNumber
        for(int i = 1; i <= num; i++){
            if(isNac(i)){
                System.out.println(i);
            }
        }
    }

}
