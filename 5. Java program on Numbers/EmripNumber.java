/**
 * A prime number is called Emirp number 
 * if we get a different prime number when its digits are reversed.
 */
public class EmripNumber {
    static boolean isPrime(int num) {
        if(num == 0 || num == 1 || num < 0) {
            return false;
        }
        boolean isPrime = true;
        for(int i=2; i<=num/2;i++) {
            if(num%i == 0) {
                isPrime=false;
            }
        }
        if(isPrime == true) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int iNum1 = 13;

        int temp = iNum1, remainder, reverseNum = 0;

        while(temp != 0){
            remainder = temp % 10;
            reverseNum = reverseNum*10 + remainder;
            temp/=10;
        }

        if(isPrime(iNum1) && isPrime(reverseNum)) {
            System.out.println(iNum1+" is a prime, whose emrip exists as "+reverseNum);
        } else {
            System.out.println(iNum1+" is either not prime or has no emrip number.");
        }        
    }
}
