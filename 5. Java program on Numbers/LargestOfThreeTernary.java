public class LargestOfThreeTernary {
    public static void main(String[] args) {
        int iNum1 = 1123;
        int iNum2 = 145;
        int iNum3 = 67;

        int temp = iNum1>iNum2 ? iNum1:iNum2;
        temp = iNum3>temp ? iNum3 : temp;

        System.out.println(temp);
        
    }
}
