public class RemoveAllWhitespaces {
    public static void main(String[] args) {
        String str = new String("This is a random string");
        String newString = "";
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) != ' ') {
                newString += str.charAt(i) + "";
            }
        }
        System.out.println(newString);
    }
}
