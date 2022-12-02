class DecimalToOctal {
    public static void main(String[] args) {
        int integerNumber = 35;

        String octalNumber = Integer.toOctalString(integerNumber);

        System.out.println("Decimal: "+integerNumber+"\nOctal: "+octalNumber);
    }
}