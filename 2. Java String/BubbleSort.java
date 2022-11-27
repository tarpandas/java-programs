import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of Strings: ");
        int limit = sc.nextInt();
        sc.nextLine();
        String arr [] = new String[limit];
        for(int i=0;i<limit; i++) {
            arr[i] = sc.nextLine();
        }
        
        for(int i=0;i<limit;i++) {
            for(int j=i+1;j<limit;j++) {
                if(arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Output: ");
        for(int i=0;i<limit;i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
