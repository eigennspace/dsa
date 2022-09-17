package recursion;

public class CallingMethod {
    static void firstMethod(){
        secondMethod();
        System.out.println("First method");
    }

    static void secondMethod(){
        thirdMethod();
        System.out.println("Second method");
    }

    static void thirdMethod(){
        fourthMethod();
        System.out.println("Third method");
    }

    static void fourthMethod(){
        System.out.println("Fourth method");
    }

    public static void main(String[] args) {
        /**
         * This method below using LIFO principe (Last In First Out)
         */
        firstMethod();
    }
}