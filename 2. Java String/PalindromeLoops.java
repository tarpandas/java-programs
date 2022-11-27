public class PalindromeLoops {
    public static void main(String[] args) {
        String originalString = new String("abacb");
        int n = originalString.length();

        String reverseString = "";

        for(int i=n-1; i>=0; i--) {
            reverseString += originalString.charAt(i);
        }

        if(reverseString.equals(originalString)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
