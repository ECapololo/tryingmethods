public class TryingMethods {
    public static void main(String[] args) {

        Add();
    }

    public static void Add() {
        int number = 1;
        int sum = 0;
        while (number < 1000) {
            number += 1;
            sum += number;
        }
        System.out.println(sum);
    }

}
