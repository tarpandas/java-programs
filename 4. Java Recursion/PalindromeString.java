public class PalindromeString {

    public static boolean checkPalindrome(String str) {
        if(str.length() == 0 || str.length() == 1) {
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length() - 1)) {
            return checkPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
    public static void main(String[] args) {
        String str = new String("Abcba");

        if(checkPalindrome(str.toLowerCase())) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("Not a palindrome.");
        }

    }
}
