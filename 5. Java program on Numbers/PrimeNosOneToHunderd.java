public class PrimeNosOneToHunderd {
    public static void main(String[] args) {
        boolean isPrime = true;
        System.out.println("Prime nos. between 1 and 100: ");
        for(int i=2;i<100;i++) {
            isPrime = true;
            for(int j=2; j<i/2; j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                System.out.print(i+" ");
            }
        }
    }
}
