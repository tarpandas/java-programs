import java.util.*;
public class SortAlphabeticalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Strings to compare: ");
        Integer limit = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<limit;i++) {
            String tempString = sc.nextLine();
            arr.add(tempString);
        }
        Collections.sort(arr);
        System.out.println("Sorted string: "+arr);
        sc.close();
    }
}
