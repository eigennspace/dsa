package recursion.learn;

public class RussianDoll {
    static void openRussianDoll(int doll){
        if (doll == 1){
            System.out.println("You reach the last doll");
        } else {
            openRussianDoll(doll-1);
        }
    }

    public static void main(String[] args) {
        openRussianDoll(5);
    }
}