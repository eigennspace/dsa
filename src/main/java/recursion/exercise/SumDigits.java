package recursion.exercise;

public class SumDigits {
    static int sumDigitMethod(int n){
        if (n==0 || n<0){
            return 0;
        }
        return n%10 + sumDigitMethod(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigitMethod(31));
    }
}