/**
 * Peterson number
 * 145! = 1! + 4! + 5! = 1 + 24 + 120 = 145
 */ 
public class PetersonNumber {
    static public int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        int iNum1 = 145;
        int num = iNum1;
        int sum = 0, remainder;

        while(num != 0) {
            remainder = num % 10;
            sum += factorial(remainder);
            num /= 10;
        }

        if(sum == iNum1) {
            System.out.println("Peterson Number.");
        } else {
            System.out.println("Not a Peterson number");
        }
    }
}
