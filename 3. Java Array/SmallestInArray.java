public class SmallestInArray {
    public static void main(String[] args) {
        Integer arr1 [] = {1,2,3,4,5,6,7,8,9,10,2,4,6,3,3};
        int max = arr1[0];
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i] < max) {
                max = arr1[i];
            }
        }
        System.out.println("Smallest integer: "+ max);
    }
}
