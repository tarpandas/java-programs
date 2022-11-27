public class CopyArrayElements {
    public static void main(String[] args) {
        Integer arr1 [] = {2,3,5,7,11,13,17,19};
        int arr2 [] = new int[arr1.length];
        for(int i =0; i<arr1.length;i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
