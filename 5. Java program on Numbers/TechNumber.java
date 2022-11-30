/**
 *  A number is called Tech number, if it has an even number of digits, 
 *  and when we split the number into two halves then the square of the sum of those halves is equal to the number itself.
 */
public class TechNumber {
    public static void main(String[] args) {
        int iNum1 = 2025;

        int temp = iNum1, count=0;

        while(temp!= 0) {
            temp /= 10;
            count++;
        }

        if(count % 2 == 0) {
            int firstHalf = iNum1 % (int) (Math.pow(10,(count/2)));
            int secondHalf = (iNum1 - firstHalf) / (int) (Math.pow(10,(count/2)));

            // System.out.println(firstHalf+" "+secondHalf);

            double result = Math.pow((firstHalf+secondHalf), 2);

            if((double)iNum1 == result){
                System.out.println("It's a tech number");
            } else {
                System.out.println("It is not a tech number.");
            }
        }
    }
}
