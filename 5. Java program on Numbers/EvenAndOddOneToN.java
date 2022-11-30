public class EvenAndOddOneToN {
    public static void main(String[] args) {
        int iNum1 = 1;
        int iNum2 = 100;

        System.out.println("Even Nos. are: ");
        for(int i=iNum1;i<iNum2;i++) {
            if(i%2 == 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println("Odd nos. are: ");
        for(int i=iNum1; i<iNum2; i++) {
            if(i%2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
