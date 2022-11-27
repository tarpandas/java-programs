public class RightRotate {
    public static void main(String[] args) {
        Integer arr1 [] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = new int[arr1.length];
        int timesRotate = 3;
        int j=arr1.length - timesRotate;
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[j];
            j++;
            if(j==arr1.length)
                j = 0;
        }
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}