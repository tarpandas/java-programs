import java.util.ArrayList;
public class ArmstrongNoInRange {
    public static void main(String[] args) {
        int minNum = 1, maxNum = 500;

        for(int current =minNum; current < maxNum; current++){
            ArrayList<Integer> arr = new ArrayList<>();
            int temp = current, remainder, count =0;
    
            while(temp != 0) {
                remainder = temp % 10;
                temp /= 10;
                arr.add(remainder);
                count++;
            }

            int sum =0;
            for(int i=0; i<arr.size();i++) {
                temp = 1; // Reusing temp for storing temporary data
                for(int j=0; j < count ; j++) {
                    temp *= arr.get(i);
                }
                sum += temp;
            }
    
            if(sum == current) {
                System.out.println(current);
            }
        }
    }
}
