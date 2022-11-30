public class SwapNoBitwiseOperator {
    public static void main(String[] args) {
        int iNum1 = 23;
        int iNum2 = 45;

        iNum1 = iNum1 ^ iNum2;
        iNum2 = iNum1 ^ iNum2;
        iNum1 = iNum1 ^ iNum2;

        System.out.println(iNum1+" "+iNum2);
    }
}
