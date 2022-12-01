/*
Merge sort algorithm works by dividing a bigger problem into smaller problems. 
These smaller problems are further divided into sub-problems. 
These sub problems are solved individually and the outcome of these smaller 
    problems is combined to get the solution of main problem.
*/
public class MergeSort {

    public static void merge(int [] arr, int fIndex, int mid, int lIndex) {

        int len1 = mid - fIndex + 1;
        int len2 = lIndex - mid;

        int lArray [] = new int[len1];
        int rArray [] = new int[len2];

        for(int i=0;i<len1;i++) {
            lArray[i] = arr[fIndex+i]; 
        }
        for(int j=0;j<len2;j++) {
            rArray[j] = arr[mid+1+j];
        }

        // comaring the lesser elements between lArray and rArray

        int i=0, j=0, k=fIndex;
        while(i < len1 && j < len2) {
            if(lArray[i] <= rArray[i]) {
                arr[k] = lArray[i];
                i++;
            } else {
                arr[k] = rArray[j];
                j++;
            }
            k++;
        }

        // Placing the remaining elements in the array

        while (i < len1) {
            arr[k] = lArray[i];
            i++;
            k++;
        }

        while (j < len2) {
            arr[k] = rArray[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int [] arr, int fIndex, int lIndex) {
        if (fIndex < lIndex) {

            int mid = (fIndex + lIndex) / 2;

            mergeSort(arr, fIndex, mid);
            mergeSort(arr, lIndex, mid);

            merge(arr, fIndex, mid, lIndex);
        }
    }
    public static void main(String[] args) {
        int [] arr = {12,45,89,34,78,54,96};
        mergeSort(arr, 0, arr.length - 1);

        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}
