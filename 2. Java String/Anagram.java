// Anagram of a string is another string with the same characters 
// but order of the characters can be different.
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second String: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("They are not anagram.");
        } else {
            char [] arr1 = str1.toCharArray();
            char [] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            }else {
                System.out.println("Not anagram.");
            }
        }
        
        sc.close();
    }
}
