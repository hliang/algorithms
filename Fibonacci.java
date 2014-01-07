// takes a command-line argument N and prints out the first N Fibonacci numbers
//
public class Fibonacci {
    // recursion, slow!!!
    public static long fib(int n) {
        if(n==0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }

    // non-recursion
    public static int fib2(int n) {
        int a=0, b=1;
        for(int i=2; i<n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return a+b;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(N + " : " + fib2(N));
        //System.out.println(N + " : " + fib(N));
        for(int i = 1; i <= N; i++) {
            System.out.println(i + " : " + fib2(i));
        }
    }
}
