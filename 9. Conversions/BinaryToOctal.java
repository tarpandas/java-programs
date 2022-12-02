public class BinaryToOctal {
    public static void main(String[] args) {
        String binNum = "1011011";
        int decimalInt = Integer.parseInt(binNum, 2);
        String octalNumber = Integer.toOctalString(decimalInt);

        System.out.println("Binary: "+binNum+"\nOctal: "+octalNumber);
    }
}
