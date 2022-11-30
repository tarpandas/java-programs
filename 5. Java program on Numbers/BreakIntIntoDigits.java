import java.util.ArrayList;
public class BreakIntIntoDigits {
    public static void main(String[] args) {
        int num = 12341242;
        ArrayList<Integer> arr = new ArrayList<>();
        int remainder;
        while(num!=0) {
            remainder = num%10;
            arr.add(remainder);
            num /= 10;
        }
        System.out.println("Each digits are:");
        for(int i=arr.size()-1;i>=0;i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
