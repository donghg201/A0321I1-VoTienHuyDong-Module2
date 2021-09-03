package FinalExam.Services;

import CaseStudyModule2.Furama.Models.Booking;
import FinalExam.Controller.MainController;
import FinalExam.Models.BenhAn;
import FinalExam.Models.BenhAnThuong;
import FinalExam.Models.BenhAnVip;
import FinalExam.Utils.ReadAndWriteFile;
import FinalExam.Utils.Regex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Functions {
    private Scanner scanner = new Scanner(System.in);
    public static final String REGEX_MA_BENH_AN = "(BA)[-][0-9]{3}";
    public static final String REGEX_MA_BENH_NHAN = "(BN)[-][0-9]{3}";
    public static final String REGEX_NGAY = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/]" +
            "(0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9]" +
            "[0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

    private static List<BenhAn> benhAnList = new ArrayList<>();

    public void themMoi() {
        try {
            int stt = soThuTu();
            String maBenhAn = inputMaBenhAn();
            String maBenhNhan = inputMaBenhNhan();
            System.out.print("Vui long nhap ten benh nhan: ");
            String tenBenhNhan = scanner.nextLine();
            String ngayNhapVien = inputNgayNhapVien();
            String ngayXuatVien = inputNgayXuatVien();
            System.out.print("Vui long nhap ly do xuat vien: ");
            String lyDoXuatVien = scanner.nextLine();
            System.out.print("Vui long chon loai benh an (1 la benh an thuong,2 la benh an VIP): ");
            String loaiBenhAn = scanner.nextLine();
            switch (loaiBenhAn) {
                case "1":
                    System.out.print("Vui long nhap phi nam vien: ");
                    String phiNamVien = scanner.nextLine();
                    benhAnList.add(new BenhAnThuong(stt, maBenhAn, maBenhNhan, tenBenhNhan,
                            ngayNhapVien, ngayXuatVien, lyDoXuatVien));
                    ReadAndWriteFile.write(benhAnList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
                    System.out.println("Them moi thanh cong!");
                    break;
                case "2":
                    System.out.print("Vui long nhap loai VIP: ");
                    String loaiVip = scanner.nextLine();
                    String a = scanner.nextLine();
                    System.out.print("Vui long nhap thoi han VIP: ");
                    String thoiHanVip = scanner.nextLine();
                    benhAnList.add(new BenhAnVip(stt, maBenhAn, maBenhNhan, tenBenhNhan,
                            ngayNhapVien, ngayXuatVien, lyDoXuatVien));
                    ReadAndWriteFile.write(benhAnList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
                    System.out.println("Them moi thanh cong!");
                    break;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
//        } catch (NotFoundMedicalRecordException e) {
//            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void displayList() {
        try {
            benhAnList = (List<BenhAn>) ReadAndWriteFile.read("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
            for (BenhAn benhAn : benhAnList) {
                System.out.println(benhAn.toString());
            }
            System.out.println();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void xoa() throws NotFoundMedicalRecordException {
        String maBenhAn = inputMaBenhAn();
        checkBenhAn(maBenhAn);
        System.out.println("Ban muon xoa benh an: \n" +
                "1. Co\n" +
                "2. Khong\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                for(int i = 0; i < benhAnList.size(); i++){
                    if(benhAnList.get(i).getMaBenhAn().equals(maBenhAn)){
                        benhAnList.remove(i);
                    }
                }
                System.out.println("Xoa thanh cong");
                ReadAndWriteFile.write(benhAnList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExam\\Data\\medical_records.csv");
                displayList();
                MainController.displayMenu();
                break;
            case 2:
                MainController.displayMenu();
                break;
        }
    }


    public int soThuTu() {
        if (benhAnList.isEmpty()) {
            return 1;
        } else return benhAnList.size() + 1;
    }


    public Boolean checkBenhAn(String maBenhAn) throws NotFoundMedicalRecordException {
        Boolean check = false;
        for (BenhAn benhAn : benhAnList) {
            if (benhAn.getMaBenhAn() == maBenhAn) {
                return check == true;
            } else return check;
        }
        if (check == false) {
            throw new NotFoundMedicalRecordException("Benh an khong ton tai!");
        }
        return null;
    }

    private String inputMaBenhAn() {
        System.out.print("Vui long nhap ma benh an: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_MA_BENH_AN, "Ma benh nhan bao gom ky tu BA- va 3 so!");
    }

    private String inputMaBenhNhan() {
        System.out.print("Vui long nhap ma benh nhan: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_MA_BENH_NHAN, "Ma benh nhaan bao gom ky tu BN- va 3 so!");
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
