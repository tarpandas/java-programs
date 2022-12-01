public class LinearSearch {
    public static void main(String[] args) {
        
        int [] arr = {12,45,89,34,78,54,96};

        int numberToSearch = 34, index = -1;

        for(int i=0;i<arr.length; i++) {
            if(arr[i] == numberToSearch) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("The element is not present.");
        } else {
            System.out.println("The element is present at index "+index);
        }
    }
}
