public class CharToStringViceVersa {
    public static void main(String[] args) {
        Character charExample = 'a';
        System.out.println(charExample.getClass().getSimpleName());
        String stringConverted = Character.toString(charExample);
        System.out.println(stringConverted.getClass().getSimpleName());
        Character characterConverted = stringConverted.charAt(0);
        System.out.println(characterConverted.getClass().getSimpleName());
    }
}