/**
 * A positive integer is called an Armstrong number (of order n) if 
 * abcd... = an + bn + cn + dn + 
 */
import java.util.ArrayList;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 407;
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = num, remainder, count =0;

        while(temp != 0) {
            remainder = temp % 10;
            temp /= 10;
            arr.add(remainder);
            count++;
        }

        int sum =0;
        for(int i=0; i<arr.size();i++) {
            temp = 1; // Reusing temp for storing temporary data
            for(int j=0; j < count ; j++) {
                temp *= arr.get(i);
            }
            sum += temp;
        }

        if(sum == num) {
            System.out.println("Is armstrong.");
        } else {
            System.out.println("Is not armstrong.");
        }
    }
}
