import java.util.ArrayList;

public class DuplicateArrayElements {
    public static void main(String[] args) {
        Integer arr1 [] = {1,2,3,4,5,6,7,8,9,10,2,4,6,3,3};
        ArrayList<Integer> arrNew = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {
            if(arrNew.contains(arr1[i])) {
                System.out.println(arr1[i] +" is a dublicate.");
                continue;
            }
            arrNew.add(arr1[i]);
        }
    }
}
