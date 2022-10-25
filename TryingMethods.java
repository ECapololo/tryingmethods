/*
 * I created here in this class all the static and dynamic methods as a way of testing
 */
public class TryingMethods {
    public static void main(String[] args) {
        TryingMethods test = new TryingMethods();
        test.dayOfTheWeekString(1);
        test.message(12);
        add();
        forLoop();
    }

//One of the static methods uses a while loop to find the sum of all numbers less than 1000 and return the result.
    public static void add() {
        int number = 1;
        int sum = 0;
        while (number < 1000) {
            number += 1;
            sum += number;
        }
        System.out.println(sum);
    }

//Lastly, the last method uses a for loop to find the sum of even numbers between 12 and 103.    
    static void forLoop() {
        int sum = 0;
        for (int i = 12; i <= 103; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

//Print a message to the console using an if statement with at least 3 blocks.    
    String message(int age) {
        if (age <= 17) {
            System.out.println("Is a small children");
        } else if (age >= 18 || age <= 60) {
            System.out.println("Is a Young boy or girl");
        } else {
            System.out.println("Is a Older man");
        }

        return "";
    }

// It return a string of the day of the week based on the argument that was provided:  dynamic methods
    String dayOfTheWeekString(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
        return "";
    }

}
