package recursion.learn;

public class Factorial {

    static int factorialMethod(int n) {
        if (n == 1 || n==0) {
            return 1;
        }
        if (n<0) {
            return -1;
        }
        return n * factorialMethod(n - 1);
    }

    public static void main(String[] args) {
        /***
         * factorial(3)
         *      |_____ 3 * factorial(2)
         *              |______ 2 * factorial(1)
         *                      |_______ factorial (1) = 1
         */
        System.out.println(factorialMethod(3));
    }
}