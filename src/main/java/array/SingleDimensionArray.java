package array;

import java.util.Arrays;

public class SingleDimensionArray {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public SingleDimensionArray(int sizeOfArray){
        array = new int[sizeOfArray];
        Arrays.fill(array, Integer.MIN_VALUE);
    }

    public void insertArray(int location, int value){
        try {
            if (array[location] == Integer.MIN_VALUE) {
                array[location] = value;
                System.out.println("Success insert the value into the array");
            } else {
                System.out.println("The location already filled");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("The location is out of bond");
        }
    }

    public void arrayTraversal(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != Integer.MIN_VALUE){
                System.out.print(array[i] + " ");
            }
            if (array[i] == Integer.MIN_VALUE){
                count++;
            }
        }

        //checking unfilled value

        if (count == array.length){
            System.out.print("Your array is doesn't filled by value now");
        }
        System.out.println();
    }
}