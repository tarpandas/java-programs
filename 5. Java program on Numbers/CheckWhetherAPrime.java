import java.util.Scanner;
public class CheckWhetherAPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. to check: ");
        int num = sc.nextInt();
        boolean isPrime=true;
        for(int i=2; i<=num/2; i++) {
            if(num%i == 0)
                isPrime=false;
        }
        if(isPrime){
            System.out.println("The number is Prime.");
        } else {
            System.out.println("The number is not prime.");
        }
        sc.close();
    }
}
