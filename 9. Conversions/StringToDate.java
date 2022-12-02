import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate {
    public static void main(String[] args) throws Exception{
        String currentDate = "02-12-2022";
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = dateFormat.parse(currentDate);
        System.out.println(dateFormat.format(date));
    }
}
