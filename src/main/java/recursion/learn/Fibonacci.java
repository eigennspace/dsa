package recursion.learn;

public class Fibonacci {
    static long fibonacciMethod(int n){
        if (n<0){
            return -1;
        }
        if (n==0 || n==1){
            return n;
        }
        return fibonacciMethod(n-1) + fibonacciMethod(n-2);
    }

    static void fibonacciMethodIterative(int n){
        int a;
        int b =0;
        int c=1;
        for (int i = 0; i <= n ; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        /**
         * fibonacciMethod(3)
         *      |____ fibonacciMethod(2) + fibonacciMethod(1) -> fibonacciMethod(2) = 1
         *                                                               |____ fibonacci(1) + fibonacci(0) = 2
         */
        System.out.println(fibonacciMethod(50));
    }
}