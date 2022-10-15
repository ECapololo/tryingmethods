public class TryingMethods {
    public static void main(String[] args) {
        ForLoop();
    }

    static void ForLoop(){
        int sum = 0;
        for (int i = 12; i <= 103; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
