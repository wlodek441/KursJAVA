package pl.futureprogramist;

public class Main {
    public static void main(String[] args) {
        int temperature1 = -5;
        int temperature2 = 6;
        int temperature3 = 0;
        int temperature4 = 10000;

        System.out.println(isPositive(temperature1));
        System.out.println(isPositive(temperature2));
        System.out.println(isPositive(temperature3));
        System.out.println(isPositive(temperature4));
    }
    public static boolean isPositive (int t){
        return t > 0;
    }
}