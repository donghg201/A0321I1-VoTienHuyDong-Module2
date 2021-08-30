package CaseStudyModule2.Furama.Utils;

import CaseStudyModule2.Furama.Models.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDay1 = LocalDate.parse(o1.getDayStart(), dateTimeFormatter);
        LocalDate startDay2 = LocalDate.parse(o2.getDayStart(), dateTimeFormatter);
        LocalDate endDay1 = LocalDate.parse(o1.getDayEnd(), dateTimeFormatter);
        LocalDate endDay2 = LocalDate.parse(o2.getDayEnd(), dateTimeFormatter);

        if (startDay1.compareTo(startDay2) > 0) {
            return 1;
        } else if (startDay1.compareTo(startDay2) < 0) {
            return -1;
        } else {
            if (endDay1.compareTo(endDay2) > 0) {
                return 1;
            } else if (endDay1.compareTo(endDay2) < 0) {
                return -1;
            } else return 0;
        }
    }
}