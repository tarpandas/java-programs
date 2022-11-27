import java.util.*;
public class FrequencyOfEachElement {
    public static void main(String[] args) {
        Integer arr [] = {2,3,5,7,11,13,17,19,2,5,13,19,7,19};
        int size = arr.length;
        ArrayList<Integer> arrList = new ArrayList<>();
        int count;
        for(int i=0;i<size;i++) {
            count=1;
            for(int j=i+1;j<size;j++) {
                if(arrList.contains(arr[i])) {
                    break;
                }
                if(arr[i] == arr[j])
                    count++;
            }
            if(arrList.contains(arr[i]) == false){
                arrList.add(arr[i]);
                System.out.println(arr[i] +" is present "+count+" times.");
            }    
        } 
    }
}
