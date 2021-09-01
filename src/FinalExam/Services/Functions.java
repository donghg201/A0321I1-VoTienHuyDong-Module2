package FinalExam.Services;

import FinalExam.Models.BenhAn;
import FinalExam.Models.BenhAnThuong;
import FinalExam.Models.BenhAnVip;
import FinalExam.Utils.ReadAndWriteFile;
import FinalExam.Utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Functions {
    private Scanner scanner = new Scanner(System.in);
    public static final String REGEX_MA_BENH_AN = "(BA)[-][\\d]{3}";
    public static final String REGEX_MA_BENH_NHAN = "(BN)[-][\\d]{3}";
    public static final String REGEX_NGAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
            "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9]" +
            "[0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

    private static List<BenhAn> benhAnList = new ArrayList<>();

    public BenhAn findById(String maBenhAn) {
        for (BenhAn benhAn : benhAnList) {
            if (benhAn.getMaBenhAn() == maBenhAn) {
                return benhAn;
            }
        }
        return null;
    }

    public void themMoi() {
        String maBenhAn;
        do {
            System.out.print("Nhap ma benh an: ");
            maBenhAn = inputMaBenhAn();
        } while (findById(maBenhAn) != null);
        String a = scanner.nextLine();
        String maBenhNhan = inputMaBenhNhan();
        System.out.print("Vui long nhap ten benh nhan: ");
        String tenBenhNhan = scanner.nextLine();
        String ngayNhapVien = inputNgayNhapVien();
        String ngayXuatVien = inputNgayXuatVien();
        System.out.print("Vui long nhap ly do xuat vien: ");
        String lyDoXuatVien = scanner.nextLine();
        System.out.print("Vui long chon loai benh an (1 la benh an thuong,2 la benh an VIP): ");
        int loaiBenhAn = scanner.nextInt();
        if (loaiBenhAn == 1) {
            System.out.print("Vui long nhap phi nam vien: ");
            String phiNamVien = scanner.nextLine();
            benhAnList.add(new BenhAnThuong(soThuTu(), maBenhAn, maBenhNhan, tenBenhNhan,
                    ngayNhapVien, ngayXuatVien, lyDoXuatVien, phiNamVien));
            ReadAndWriteFile.write(benhAnList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
        } else if (loaiBenhAn == 2) {
            System.out.print("Vui long nhap loai VIP: ");
            String loaiVip = scanner.nextLine();
            System.out.print("Vui long nhap thoi han VIP: ");
            String thoiHanVip = scanner.nextLine();
            benhAnList.add(new BenhAnVip(soThuTu(), maBenhAn, maBenhNhan, tenBenhNhan,
                    ngayNhapVien, ngayXuatVien, lyDoXuatVien, loaiVip, thoiHanVip));
            ReadAndWriteFile.write(benhAnList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
        }
    }

    public void displayList() {
        benhAnList = (List<BenhAn>) ReadAndWriteFile.read("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
        if (benhAnList.isEmpty() == false) {
            for (BenhAn benhAn : benhAnList) {
                System.out.println(benhAn.toString());
            }
        }
    }

    public void xoa(){
        String maBenhAn;
        do {
            System.out.print("Nhap ma benh an: ");
            maBenhAn = inputMaBenhAn();
        } while (findById(maBenhAn) != null);
    }

    public int soThuTu() {
        if (benhAnList.isEmpty()) {
            return 1;
        } else return benhAnList.size() + 1;
    }

    private String inputMaBenhAn() {
        System.out.print("Vui long nhap ma benh an: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_MA_BENH_AN, "Ma benh an bao goi ky tu BA- va 3 so!");
    }

    private String inputMaBenhNhan() {
        System.out.print("Vui long nhap ma benh nhan: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_MA_BENH_NHAN, "Ma benh an bao goi ky tu BN- va 3 so!");
    }

    private String inputNgayNhapVien() {
        System.out.print("Vui long nhap ngay nhap vien: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NGAY, "Ngay thang phai theo dinh dang dd/mm/yyyy");
    }

    private String inputNgayXuatVien() {
        System.out.print("Vui long nhap ngay xuat vien: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NGAY, "Ngay thang phai theo dinh dang dd/mm/yyyy");
    }
}
