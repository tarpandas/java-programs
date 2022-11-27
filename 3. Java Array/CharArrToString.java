import java.util.Arrays;

public class CharArrToString {
    public static void main(String[] args) {
        char arr [] = {'H', 'e', 'l', 'l', 'o', '!'};
        String str = Arrays.toString(arr);
        System.out.println(str);
        System.out.println(str.getClass().getSimpleName());
    }
}
