public class FactorialOfANumber {
    public static int factorialNum(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorialNum(num - 1);
    }
    public static void main(String[] args) {
        int iNum1 = 5;
        int answer = factorialNum(iNum1);
        System.out.print("Factorial of "+iNum1+" is: "+answer);
    }
}
