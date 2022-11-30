public class FirstHunderdPrimeNos {
    public static void main(String[] args) {
        boolean isPrime = true;
        int count=0;
        for(int i=2; count < 100; i++) {
            isPrime = true;
            for(int j=2; j<=i/2;j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                count++;
                System.out.print(i+" ");
            }
        }
    }
}
