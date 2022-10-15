public class TryingMethods {
    public static void main(String[] args) {
        TryingMethods men = new TryingMethods();
        men.message(12);
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

}
