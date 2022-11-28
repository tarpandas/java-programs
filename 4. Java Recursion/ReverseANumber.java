public class ReverseANumber {
    static void recursiveReverse(int num) {
        if(num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print((num%10));
            recursiveReverse(num / 10);
        }
    }
    public static void main(String[] args) {
        int iNum1 = 1234;
        int reverseNum1 = 0, remainder;
        for(int i=0;i<4;i++) {
            remainder = iNum1 % 10;
            reverseNum1 = reverseNum1 * 10 + remainder;
            iNum1 /= 10;
        }
        System.out.println("Using for loop, reverse: "+ reverseNum1);

        int iNum2 = 5678;
        int reverseNum2=0;
        while(iNum2 > 0) {
            remainder = iNum2 % 10;
            reverseNum2 = reverseNum2 * 10 + remainder;
            iNum2 /= 10;
        }
        System.out.println("Using while loop, reverse: "+reverseNum2);

        int iNum3 = 91011;
        System.out.print("Using recursion, reverse: ");
        recursiveReverse(iNum3);
    }
}