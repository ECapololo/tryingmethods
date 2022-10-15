public class TryingMethods {
    public static void main(String[] args) {
        TryingMethods test = new TryingMethods();
        test.dayOfTheWeekString(3);
        test.message(12);
    }

    String message (int age){
       if (age <= 17) {
            System.out.println("Is a small children");
        } else if (age >= 18 || age <= 60) {
            System.out.println("Is a Young boy or girl");
        } else {
            System.out.println("Is a Older man");
        }         
        
        return "";
    }

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
