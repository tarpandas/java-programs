import java.util.*;
public class AutobiographicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();

        System.out.print("Enter the number: ");
        String numString = sc.nextLine();

        for(int i=0; i<numString.length(); i++) {
            arr.add(Integer.parseInt(numString.charAt(i)+""));
        }

        ArrayList<Boolean> isAutobg = new ArrayList<>();

        int count = 0;
        for(int i=0;i<arr.size();i++) {
            count = 0;
            for(int j=0;j<arr.size();j++) {
                if(arr.get(j) == i)
                    count++;
                    // System.out.println(arr.get(j)+" "+i+" "+count);
            }
            if(count == arr.get(i)) {
                isAutobg.add(true);
            } else {
                isAutobg.add(false);
            }
        }

        /*
        for(int i=0;i<isAutobg.size();i++) {
            System.out.println(isAutobg.get(i));
        }
        */

        if(isAutobg.contains(false)) {
            System.out.println("Not autobiographical number.");
        } else {
            System.out.println("Autobiographical number.");
        }
        
        sc.close();
    }
}
