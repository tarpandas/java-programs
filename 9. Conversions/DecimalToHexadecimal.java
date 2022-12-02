public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimalNumber = 11;
        String hexaDecimal = Integer.toHexString(decimalNumber);

        System.out.println("Decimal: "+decimalNumber+"\nHexadecimal: "+hexaDecimal);
    }
}
