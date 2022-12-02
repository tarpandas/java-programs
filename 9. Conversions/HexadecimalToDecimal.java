public class HexadecimalToDecimal {
    public static void main(String[] args) {
        String hexaDecimal = "435fd";

        int a = Integer.parseInt(hexaDecimal, 16);

        System.out.println("Hexadecimal: "+hexaDecimal+"\nInteger: "+a);
    }
}
