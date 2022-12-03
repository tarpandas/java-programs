import java.util.Scanner;
public class FibonacciUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert count: ");
        int count = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        for(int i=0; i<count; i++) {
            System.out.print(num1+" ");

            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        sc.close();
    }
}
