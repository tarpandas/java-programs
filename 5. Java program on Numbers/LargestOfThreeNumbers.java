import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. 1: ");
        int iNum1 = sc.nextInt();
        System.out.print("Enter no. 2: ");
        int iNum2 = sc.nextInt();
        System.out.print("Enter no. 3: ");
        int iNum3 = sc.nextInt();

        if(iNum1 > iNum2) {
            if(iNum1 > iNum3) {
                System.out.println(iNum1+" is the largest.");
            } else if (iNum3 > iNum1) {
                System.out.println(iNum3+" is the largest.");
            }
        } else if (iNum2 > iNum1){
            if(iNum2 > iNum3) {
                System.out.println(iNum2+" is the largest.");
            } else if (iNum3 > iNum2) {
                System.out.println(iNum3+" is the largest.");
            }
        } else {
            System.out.println(iNum3+ " is the largest.");
        }
        sc.close();
    }
}
