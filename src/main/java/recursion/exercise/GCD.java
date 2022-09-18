package recursion.exercise;

/**
 * Greatest Common Divisor
 */
public class GCD {
    static int GCDMethod(int a, int b){
        if (a<0 || b<0){
            return -1;
        }
        if (b==0){
            return a;
        }
        return GCDMethod(b, a%b);
    }

    public static void main(String[] args) {
        System.out.println(GCDMethod(0,0));
    }
}