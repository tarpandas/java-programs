import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr [] = {13,5,19,17,11,2,7,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
