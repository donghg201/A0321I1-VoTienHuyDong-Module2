package FinalExam.Utils;

import FinalExam.Models.BenhAn;
import FinalExam.Services.Functions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Compare implements Comparator<BenhAn> {
    @Override
    public int compare(Functions o1, Functions o2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDay1 = LocalDate.parse(o1.getNgayNhapVien(), dateTimeFormatter);
        LocalDate startDay2 = LocalDate.parse(o2.getNgayNhapVien(), dateTimeFormatter);
        LocalDate endDay1 = LocalDate.parse(o1.getNgayXuatVien(), dateTimeFormatter);
        LocalDate endDay2 = LocalDate.parse(o2.getNgayXuatVien(), dateTimeFormatter);

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
