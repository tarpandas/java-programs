public class NeonNumber {
    public static void main(String[] args) {
        int iNum1 = 81;

        int temp = iNum1, sumOfDigits = 0, remainder;

        while(temp != 0) {
            remainder = temp % 10;
            sumOfDigits += remainder;
            temp/=10;
        }

        if(Math.pow(sumOfDigits, 2) == (double)iNum1) {
            System.out.println("The number is a Neon Number.");
        } else {
            System.out.println("The number is not a neon number.");
        }
    }
}
