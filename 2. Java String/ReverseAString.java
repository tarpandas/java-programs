public class ReverseAString {
    public static void main(String[] args) {
        String str = new String("This String is to be reversed.");
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
