class OctalToDecimal {
    public static void main(String[] args) {
        String octalNumber = "43";

        int octalToDecimal = Integer.parseInt(octalNumber, 8);

        System.out.println("Octal: "+octalNumber+"\nDecimal: "+octalToDecimal);
    }
}