// A Sphenic number is a product of three distinct prime numbers.
// For example, 66 is a sphenic number as it is a product of 2, 3, 11 and all these numbers are prime.
import java.util.*;
public class SphenicNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 66;
        boolean isPrime = true;

        for(int i=2; i<=num/2; i++) {
            isPrime = true;
            for(int j=2; j<=i/2;j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                arr.add(i);
            }
        }

        int product=0;

        for(int i=0; i<arr.size();i++) {
            for(int j=0;j<arr.size(); j++) {
                for(int k=0;k<arr.size(); k++) {
                    product = arr.get(i) * arr.get(j) * arr.get(k);
                    if(product == num) {
                        System.out.println("It is a sphenic number.");
                        System.out.println("Prime numbers: "+arr.get(i)+", "+arr.get(j)+", "+arr.get(k));
                        System.exit(0);
                    }
                }
            }
        }

    }
}
