// A positive number that contains a zero digit is called Duck Number. 
import java.util.ArrayList;
public class DuckNumber {
    public static void main(String[] args) {
        String num = "243013";
        int numToInteger = Integer.parseInt(num); // Removes preceeding zero
        System.out.println("Input Number: "+numToInteger);

        num = Integer.toString(numToInteger);
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i< num.length();i++) {
            arr.add(Integer.parseInt(num.charAt(i)+""));
        }

        if(arr.contains(0)) {
            System.out.println("Duck Number.");
        } else {
            System.out.println("Not a Duck Number.");
        }
    }
}
