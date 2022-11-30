import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int squaredNumber = sc.nextInt();

        int rootNumber = (int) Math.floor(Math.sqrt(squaredNumber));

        if(rootNumber * rootNumber == squaredNumber) {
            System.out.println("It is a perfect square.");
        } else {
            System.out.println("It is not a perfect square number.");
        }
        sc.close();
        
    }
}
