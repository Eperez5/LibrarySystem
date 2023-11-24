
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateComparison {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date1 = "11/12/2023";
        String date2 = "11/30/2023";

        LocalDate d1 = LocalDate.parse(date1, dtf);
        LocalDate d2 = LocalDate.parse(date2, dtf);

        long ndays = d1.datesUntil(d2).count();
        System.out.println(ndays);

        LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));

        d1 = LocalDate.now();
        ndays = d1.datesUntil(d2).count();
        System.out.println(ndays);
        
        d1 = LocalDate.now().plusDays(10);
        System.out.println(d1);
        System.out.println(d2);
        
    }
}
