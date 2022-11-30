import java.util.*;
public class AlternatePrimeNos {
    public static void main(String[] args) {
        boolean isPrime = true;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=2; i<100; i++) {
            isPrime = true;
            for(int j=2; j<=i/2;j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                arr.add(i);
            }
        }
        for(int i=0;i<arr.size();i+=2) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
