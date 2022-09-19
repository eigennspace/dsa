package recursion.exercise;

public class ProductOfArray {
    static int productofArray(int A[], int N)
    {
        //   TODO
        if(N == 0){
            return A[0];
        }

        return A[N-1] * productofArray(A, N-1);
    }

    public static void main(String[] args) {
        int[] x = new int[]{1,2,3,4,5};
        System.out.println(productofArray(x, x.length));
    }
}