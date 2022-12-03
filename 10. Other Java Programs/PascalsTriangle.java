import java.util.Scanner;
public class PascalsTriangle {

    public static int fact(int num) {
        int factorial;
        for(factorial = 1; num > 1 ; num--) {
            factorial *= num;
        }
        return factorial;
    }

    public static int ncr(int n, int r) {
        return fact(n) / (fact(n-r) * fact(r));
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();

        for(int i=0;i<rows;i++) {
            for(int j=0;j<rows-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print(" "+ncr(i, j));
            }
            System.out.println();
        }
        sc.close();
    }
}
