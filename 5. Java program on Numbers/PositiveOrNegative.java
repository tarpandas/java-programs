import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("It's positive.");
        } else if (num < 0) {
            System.out.println("It's negative.");
        }
        else {
            System.out.println("It's zero.");
        }
        sc.close();
    }
}
