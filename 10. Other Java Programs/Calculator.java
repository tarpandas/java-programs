import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 'y';

        while(c == 'y' || c == 'Y') {
            System.out.println("---Enter number1, followed by symbol, followed by number 2---");
            System.out.println("---Allowed Operations: Addition, Subtraction, Multiplication and Division---");
            int num1 = sc.nextInt();
            char op = sc.next().charAt(0);
            int num2 = sc.nextInt();

            switch(op) {
                case '+': System.out.println("Sum: "+ (num1 + num2));
                            break;
                case '-': System.out.println("Difference: "+ (num1 - num2));
                            break;
                case '*': System.out.println("Product: "+ (num1 * num2));
                            break;
                case '/': System.out.println("Quotient: "+ (num1 / num2)+"\nRemainder: "+ (num1 % num2));
                            break;
                default: System.out.println("ERROR!");
            }

            System.out.print("Do you want to continue? ");
            c = sc.next().charAt(0);
            
            if(c=='y' || c == 'Y') {
                continue;
            } else {
                System.out.println("Thank you very much!");
                break;
            }
        }
        sc.close();
    }
}
