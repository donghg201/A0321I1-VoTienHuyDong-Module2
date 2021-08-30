package CaseStudyModule2.Furama.Utils;

import CaseStudyModule2.Furama.Models.Booking;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserByYear {
    public int getYearInStartDAy(Booking o1){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate year = LocalDate.parse(o1.getDayStart(),dateTimeFormatter);
        return year.getYear();
    }
}
