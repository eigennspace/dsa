package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray array = new SingleDimensionArray(5);
        array.insertArray(0, 4);
        array.insertArray(1, 5);
        System.out.println(Arrays.toString(array.getArray()));
        array.insertArray(1, 1);
        array.insertArray(5, 1);

        System.out.println("==== Array Traversal ====");
        array.arrayTraversal();
        System.out.println("================");

        int[] myArr = {1,2,3};
        System.out.println(Arrays.toString(myArr));

        System.out.println(Arrays.toString(array.getArray()));
    }
}