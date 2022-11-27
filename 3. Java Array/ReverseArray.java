public class ReverseArray {
    public static void main(String[] args) {
        Integer arr [] = {2,3,5,7,11,13,17,19};
        int arrSize = arr.length;
        int arrReverse[] = new int [arrSize];
        for(int i=0;i<arrSize;i++) {
            arrReverse[i] = arr[arrSize - 1 - i];
        }
        System.out.println("Reverse Array:");
        int i = 0;
        while(i != arrSize){
            System.out.print(arrReverse[i]+ " ");
            i++;
        }
    }
}
