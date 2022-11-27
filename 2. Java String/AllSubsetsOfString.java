// If the number of characters in a given string is n 
// then the number of possible subsets of that string would be: n(n+1)/2.
public class AllSubsetsOfString {
    public static void main(String[] args) {
        String str = "FOUR";
        int n = str.length();
        String arr[] = new String[(n*(n+1))/2];
        int index=0;

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                arr[index] = str.substring(i,j+1);
                index++;
            }
        }
        System.out.println("The possible substrings are:");
        for(int i = 0 ;i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
