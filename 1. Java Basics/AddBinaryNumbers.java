public class AddBinaryNumbers {
    public static void main(String[] args) {
        String iBinNum1 = "0010"; // 2
        String iBinNum2 = "0100"; // 6

        int iNum1=0, iNum2=0;
        int count=0;

        for(int i=iBinNum1.length() - 1; i>=0; i--) {
            iNum1 += Integer.parseInt(iBinNum1.charAt(i) + "") * Math.pow(2, count);
            count++;
        }

        count = 0;

        for(int i=iBinNum2.length() - 1; i>=0; i--) {
            iNum2 += Integer.parseInt(iBinNum2.charAt(i) + "") * Math.pow(2, count);
            count++;
        }
        int iSum = iNum1 + iNum2;

        System.out.println("Sum: "+ iSum);
    }
}
