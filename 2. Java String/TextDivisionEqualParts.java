public class TextDivisionEqualParts {
    public static void main(String[] args) {
        String str = new String("This is a text to be divided..");
        int noOfDivisions = 3;
        int lengthPerDivision = str.length() / 3;
        String arr [] = new String[noOfDivisions];
        int index=0;
        if(str.length() % noOfDivisions != 0) {
            System.out.println("No equal divisions");
        } else {
            for(int i=0; i<str.length(); i=i+lengthPerDivision) {
                String subStr = str.substring(i, i+lengthPerDivision);
                arr[index] = subStr;
                index++;
            }
            System.out.println("Parts are:");
            for(int i=0;i<noOfDivisions;i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
