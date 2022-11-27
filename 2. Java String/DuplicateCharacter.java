import java.util.*;
public class DuplicateCharacter {
    public static void main(String[] args) {
        ArrayList<Character> arrLookUp = new ArrayList<Character>();
        String strRandomString = new String("this is sparta");
        int count = 0;
        for(int i=0; i<strRandomString.length(); i++) {
            for(int j=i; j<strRandomString.length(); j++) {
                if (strRandomString.charAt(i) == strRandomString.charAt(j)) {
                    count++;
                }    
            }
            if (count > 1 && strRandomString.charAt(i) != ' ') {
                if (arrLookUp.contains(strRandomString.charAt(i)))
                    continue;
                else
                    arrLookUp.add(strRandomString.charAt(i));
                System.out.println(strRandomString.charAt(i)+ " is a duplicate element. Count: "+ count);
            }
            count=0;
        }
    }
}
