public class BinaryToDecimal {
    public static void main(String[] args) {
        String binNum = "101011";
        int decimalNum = Integer.parseInt(binNum,2);

        System.out.println("Binary: "+binNum+"\ndecimalNum: "+decimalNum);
    }
}
