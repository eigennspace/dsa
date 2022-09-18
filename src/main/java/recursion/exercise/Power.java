package recursion.exercise;

public class Power {
    static double powerMethod(int number, int power){
        if (power>0){
            return number * powerMethod(number, power - 1);
        }
        else if (power<0){
            return 1/powerMethod(number, -power);
        } else {
            return 1;
        }
    }
    static int numberMin(int n){
        return -n;
    }

    public static void main(String[] args) {
        System.out.println(powerMethod(2,-1));
        System.out.println(numberMin(-1));
    }
}