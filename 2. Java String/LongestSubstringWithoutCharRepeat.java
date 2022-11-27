public class LongestSubstringWithoutCharRepeat {
    public static void main(String[] args) {
        String str = new String ("Aabbbcdeeff");
        str = str.toLowerCase();
        String longStr = "";
        int maxLength = 0;
        String longestString = "";

        for(char c : str.toCharArray()) {
            String strChar = String.valueOf(c);
            if(longStr.contains(strChar)) {
                longStr = longStr.substring(longStr.indexOf(strChar)+1);
            }
            longStr += String.valueOf(c);
            // System.out.println(longStr);
            if(longStr.length() > maxLength) {
                longestString = longStr;
                maxLength = longStr.length();
            }
        }
        System.out.println("Longest substring with no repeating characters: "+ longestString);
        System.out.println("Length: "+ maxLength);
    }
}
