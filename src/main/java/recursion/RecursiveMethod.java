package recursion;

public class RecursiveMethod {
    static void recursiveMethod(int n){
        if(n<1){
            System.out.println("n is less that 1");
        } else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        /**
         * This method below using LIFO principe (Last in First Out)
         * recursive(3) will stack in the memory first, so it will be checked back later to execute next line
         * then it will be recursive again comparing 3 with 1
         * then produce new recursive(2)
         * recursive(2) will stack in the memory so on like recursive(3) before, until reach n < 1
         * so in the stack memory it will be stack like this from top to down ->
         *
         * STACK MEMORY
         *
         *      recursive(1)
         *          |.. recursive(2)
         *              |.. recursive(3)
         *
         * which means that the stack memory is in LIFO principe, so last in will be first out the stack
         * so the output will be 1,2,3
         */
        recursiveMethod(3);
    }
}