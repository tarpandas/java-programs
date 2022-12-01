class BubbleSort {
    static public void main(String [] args) {
        int [] arr = {12,45,89,34,78,54,96};

        for( int i=0; i< arr.length; i++) {
            for( int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }

        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}