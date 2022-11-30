// A number which either ends with 7 or divisible by 7 is called Buzz number. 
public class BuzzNumber {
    public static void main(String[] args) {
        int num = 34257;

        if((num % 10 == 7) || (num % 7 == 0)) {
            System.out.println("Buzz Number.");
        } else {
            System.out.println("Not a buzz Number.");
        }
    }
}
