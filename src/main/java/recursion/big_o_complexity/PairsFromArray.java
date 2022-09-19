package recursion.big_o_complexity;

import java.util.List;

public class PairsFromArray {
    static void pairs(int[] array){
        for (int i = 0; i < array.length; i++) { //------------------> O(n)
            for (int j = 0; j < array.length; j++) { //--------------> O(n) --- O(n) * O(n) = O(n^2)
                System.out.print(array[i] +""+ array[j] + " "); //---> O(1)
                //Time complexity = O(n^2) + O(1) = O(n^2)
            }
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,5};
        pairs(a);
    }
}