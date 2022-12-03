import java.util.Scanner;
class FloydsTriangle {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        int number = 1;

        for(int i=0;i<rows;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print(number+" ");
                number ++;
            }
            System.out.println();
        }

        sc.close();
    }
}