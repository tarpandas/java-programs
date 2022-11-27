import java.util.*;
public class OccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Enter the character:");
        char c = sc.next().charAt(0);

        int count=0;
        for(int i=0; i< str.length(); i++) {
            if(str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("Character '"+c+"' occured "+count+" times.");
        sc.close();
    }
}
