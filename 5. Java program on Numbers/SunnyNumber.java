public class SunnyNumber {
    public static void main(String[] args) {
        int iNum1 = 15;

        double n = Math.sqrt(iNum1 + 1);

        if((double)iNum1 + 1 == n*n) {
            System.out.println("Sunny Number");
        } else {
            System.out.println("Not a sunny number.");
        }
    }
}
