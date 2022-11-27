public class EvenPosition {
    public static void main(String[] args) {
        Integer arr [] = {2,3,5,7,11,13,17,19};
        for(int i=0;i<arr.length;i++) {
            if(i % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
