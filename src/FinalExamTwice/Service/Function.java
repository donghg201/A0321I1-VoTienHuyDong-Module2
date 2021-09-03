package FinalExamTwice.Service;

import FinalExamTwice.Model.SanPham;
import FinalExamTwice.Model.SanPhamNhapKhau;
import FinalExamTwice.Model.SanPhamXuatKhau;
import FinalExamTwice.Utils.ReadAndWriteFile;
import FinalExamTwice.Utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    private static final String REGEX_NUMBER = "^\\+?[1-9]\\d*$";
    private static final String REGEX_MA_SAN_PHAM = "(SP)[0-9]{5}";


    public static List<SanPham> sanPhamList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static int idSanPham() {
        if (sanPhamList.isEmpty()) {
            return 1;
        } else return sanPhamList.size() + 1;
    }

    public void themMoi() {
        int idSanPham = idSanPham();
        String maSanPham = inputMaSanPham();
        System.out.print("Vui long nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        String giaBan = inputGiaBan();
        String soLuong = inputSoLuong();
        System.out.print("Vui long nhap nha san xuat: ");
        String nhaSanXuat = scanner.nextLine();
        int choose = 0;
        System.out.print("Vui long chon the loai san pham:\n" +
                "1. Nhap khau.\n" +
                "2. Xuat khau.\n" +
                "Chon: ");
        switch (choose) {
            case 1:
                String giaNhapKhau = inputGiaNhapKhau();
                System.out.print("Vui long nhap tinh thanh nhap: ");
                String tinhThanhNhap = scanner.nextLine();
                String thueNhapKhau = inputThueNhapKhau();
                sanPhamList.add(new SanPhamNhapKhau(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat,
                        giaNhapKhau, tinhThanhNhap, thueNhapKhau));
                ReadAndWriteFile.write(sanPhamList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExamTwice\\Data\\products.csv");
            case 2:
                String giaXuatKhau = inputGiaXuatKhau();
                System.out.print("Vui long nhap quoc gia xuat khau: ");
                String quocGiaXuatKhau = scanner.nextLine();
                sanPhamList.add(new SanPhamXuatKhau(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau
                        , quocGiaXuatKhau));
                ReadAndWriteFile.write(sanPhamList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExamTwice\\Data\\products.csv");
        }
    }


    private String inputMaSanPham() {
        System.out.print("Vui long nhap ma san pham: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_MA_SAN_PHAM, "Mã sản phẩm bao gồm SP và 5 số.");
    }

    private String inputGiaBan() {
        System.out.print("Vui long nhap gia ban: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NUMBER, "Giá bán là số dương.");
    }

    private String inputSoLuong() {
        System.out.print("Vui long nhap so luong: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NUMBER, "Số lượng là số dương.");
    }

    private String inputGiaNhapKhau() {
        System.out.print("Vui long nhap gia nhap khau: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NUMBER, "Giá nhập khẩu là số dương.");
    }

    private String inputThueNhapKhau() {
        System.out.print("Vui long nhap thue nhap khau: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NUMBER, "Thuế nhập khẩu là số dương.");
    }

    private String inputGiaXuatKhau() {
        System.out.print("Vui long nhap gia xuat khau: ");
        return Regex.regexStr(scanner.nextLine(), REGEX_NUMBER, "Giá xuất khẩu là số dương.");
    }
}
