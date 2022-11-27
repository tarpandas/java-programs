public class AverageOfNumbers {
    public static void main(String[] args) {
        Integer arr [] = {2,3,5,7,11,13,17,19};
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Average: "+ sum/arr.length);
    }
}
