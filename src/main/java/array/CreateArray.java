package array;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        System.out.println(Arrays.toString(intArray));

        int[] myInt = {1,2,3};
        System.out.println(Arrays.toString(myInt));

        int[] myArr = new int[6];
        for (int i = 0; i < 5; i++) {
            myArr[i] = i;
        }
        System.out.println(Arrays.toString(myArr));

        String[] arrayString = {"Harist", "Islami"};
        System.out.println(Arrays.toString(arrayString));

        String[] arrayStringDeclared = new String[10];
        for (int i = 0; i < arrayStringDeclared.length; i++) {
            if (i%2 != 0){
                arrayStringDeclared[i] = String.valueOf(i);
            }
            if (i%2 == 0) {
                arrayStringDeclared[i] = "mantap";
            }
        }
        System.out.println(Arrays.toString(arrayStringDeclared));
    }
}