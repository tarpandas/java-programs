public class ArithmeticOperationMethodOverloading {
    static float add(int iNum1, int iNum2) {
        return (float)(iNum1 + iNum2);
    }
    static float add(int iNum1, float iNum2) {
        return (float)iNum1 + iNum2;
    }
    static float add(float iNum1, int iNum2) {
        return iNum1 + (float)iNum2;
    }
    static float add(float iNum1, float iNum2) {
        return (float) (iNum1 + iNum2);
    }
    public static void main(String[] args) {
        System.out.println("23 + 25 = "+add(23,25));
        System.out.println("23 + 25.1 = "+add(23,25.1f));
        System.out.println("23.2 + 25 = "+add(23.2f,25));
        System.out.printf("23.3 + 25.4 = %.2f",add(23.3f, 25.4f));
    }
}
