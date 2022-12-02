import java.util.Date;
public class DateToString {
    public static void main(String[] args) {
        Date date = new Date();
        String dateString = date.toString();

        System.out.println(dateString+" "+dateString.getClass().getSimpleName());
    }
}
