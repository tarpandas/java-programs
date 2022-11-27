import java.util.*;
public class PalindromeQueue {
    public static void main(String[] args) {
        String originalString = new String("acaba");
        int n = originalString.length();

        System.out.println("Original String: "+ originalString);

        Queue <Character> queue = new LinkedList<Character>();

        for(int i=n-1;i>=0;i--) {
            queue.add(originalString.charAt(i));
        }

        String reverseString = "";

        for (int i=0; i<n; i++) {
            reverseString += queue.remove();
        }

        if(reverseString.equals(originalString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }
}
