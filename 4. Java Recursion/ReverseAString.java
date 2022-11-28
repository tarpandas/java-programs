public class ReverseAString {
    public static void reverseString(String str) {
        if(str.length() == 1) {
            System.out.print(str.charAt(0));
            return;
        } else {
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args) {
        String str = new String("This is wrong!");
        System.out.println("Original String: "+str);
        System.out.print("Reverse string using recursion: ");
        reverseString(str);
    }
}
