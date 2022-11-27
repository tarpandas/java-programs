import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Integer arr1 [] = {1,2,3,4,5,6,7,8,9,10,2,4,6,3,3};
        ArrayList<Integer> arrNew = new ArrayList<>();
        for(int i=0;i<arr1.length;i++) {
            if(arrNew.contains(arr1[i])) {
                arrNew.remove(arr1[i]);
            }
            arrNew.add(arr1[i]);
        }
        System.out.println("Array elements: ");
        for(int i=0; i<arrNew.size();i++) {
            System.out.print(arrNew.get(i)+" ");
        }
    }
}