import java.util.*;
public class PalindromeStack {
    public static void main(String[] args) {
        String strString = new String("acaba");
        int n = strString.length();

        System.out.println("Original string: "+ strString);

        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<n; i++) {
            stack.push(strString.charAt(i));
        }

        String reverseString = "";

        for(int i=0; i<n; i++) {
            reverseString += stack.pop();
        }
        if(reverseString.equals(strString))
            System.out.println("Palindrome.");
        else
            System.out.println("Not a palindrome.");
    }
}
