import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {12,45,89,34,78,54,96};

        int numberToSearch = 45;

        int first = 0;
        int last = arr.length -1;
        int mid = (last - first)/2;

        Arrays.sort(arr);

        while( first <= last) {
            if(arr[mid] < numberToSearch) {
                first = mid + 1;
            } else if(arr[mid] > numberToSearch) {
                last = mid;
            } else {
                System.out.println("The element is at index "+ mid);
                break;
            }
            mid = (first + last)/2;
        }

        if (first > last) {
            System.out.println("The element is not found.");
        }
    }
}
