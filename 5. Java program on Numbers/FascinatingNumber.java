// A number is called Fascinating number if it satisfies all the following conditions:
//      Number contains at least three digits.
//      When we multiply the number by 2 & 3 and concatenate the results with the original number then it contains all the digits from 1 to 9 exactly once. 

import java.util.*;
public class FascinatingNumber {
    public static void main(String[] args) {
        int num = 219;
        ArrayList<Integer> arr = new ArrayList<>();

        if(Integer.toString(num).length() < 3) {
            System.out.println("Length of number should be atleast 3.");
            System.exit(0);
        }

        int numX2 = num * 2;
        int numX3 = num * 3;

        String strNum = Integer.toString(num);
        String strNumX2 = Integer.toString(numX2);
        String strNumX3 = Integer.toString(numX3);

        String numbers = strNum + strNumX2 + strNumX3;

        for(int i=0; i<numbers.length();i++) {
            arr.add(Integer.parseInt(numbers.charAt(i)+""));
            // System.out.println(arr.get(i));
        }

        boolean isFascinating = true;

        for(int i=1;i<=9;i++) {
            if(arr.contains(i) == false) {
                isFascinating = false;
                break;
            }
        }

        if(isFascinating) {
            System.out.println("It is a Fascinating number.");
        } else {
            System.out.println("It is not a fascinating number.");
        }

    }
}
