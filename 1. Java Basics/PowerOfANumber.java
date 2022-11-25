public class PowerOfANumber {
    public static void main(String[] args) {
        int iNum1 = 12;
        int iNum2 = 2;

        long iPower = 1;

        for (int i=0;i<iNum2; i++) {
            iPower *= iNum1;
        }

        System.out.println("Power: "+ iPower);
    }
}
