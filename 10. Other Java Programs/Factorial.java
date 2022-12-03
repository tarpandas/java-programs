import java.util.Scanner;
public class Factorial {
    static public void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int backup = number;
        int factorial;

        for(factorial = 1; number>0;number--) {
            factorial *= number;
        }

        System.out.println("Factorial of "+backup+" is "+factorial);
        sc.close();
    }
}
