public class LongestSubstringRepeat {
    public static void main(String[] args) {
        String str = new String("AAAbbcccccccccdefffff");

        int count = 1, maxLength = -1;
        for (int i=0;i<str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count+=1;
            }
            else {
                count=1;
            }
            if(count > maxLength) {
                maxLength = count;
            }
        }
        System.out.println("Length: "+ maxLength);
    }
}
