import java.util.Scanner;
public class FindingASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        int charToASCII = (int) c;

        System.out.println(c+" is having an ASCII value of "+charToASCII);

        sc.close();
    }
}
