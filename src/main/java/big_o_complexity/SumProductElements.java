package big_o_complexity;

public class SumProductElements {
    static int sum(int[] a){
        int total = 0; //---------------------------> O(1)
        for (int i = 0; i < a.length; i++) { //-----> O(n)
            total += a[i]; //-----------------------> O(1)
        }
        return total; //----------------------------> O(1)

        // Time Complexity = O(1) + O(n) = O(n)
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,5};
        System.out.println(sum(a));
    }
}