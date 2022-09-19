package recursion.exercise;

public class RecursiveRange {
    static int recursiveRangeMethod(int n){
        if (n==0){
            return 0;
        }
        return n + recursiveRangeMethod(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveRangeMethod(6));
    }
}