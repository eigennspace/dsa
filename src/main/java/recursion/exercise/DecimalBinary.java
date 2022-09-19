package recursion.exercise;

public class DecimalBinary {
    static int decimalBinaryMethod(int n){
        if (n==0){
            return 0;
        }
        return n%2 + 10 * decimalBinaryMethod(n/2);
    }

    public static void main(String[] args) {
        System.out.println(decimalBinaryMethod(13));
    }
}