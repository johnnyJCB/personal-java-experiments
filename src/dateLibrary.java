import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateLibrary {
    public static void main(String[] args) {
//        Date currentDate = new Date();
//        System.out.println(currentDate);
//
//        SimpleDateFormat daysFormat = new SimpleDateFormat("EEE, MMM d, ''yy");
//        System.out.println(daysFormat.format(currentDate));
//
//        SimpleDateFormat hoursFormat = new SimpleDateFormat("hh 'o''clock' a, zzzz");
//        System.out.println(hoursFormat.format(currentDate));
//
//        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a, ''D");
//        System.out.println(clockFormat.format(currentDate));
    }
    public static void printStars(int number) {
        String str = "*";
        String repeated = str.repeat(number);
        System.out.println(repeated);
    }
}
//linkt to Class SimpleDateFormat: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html