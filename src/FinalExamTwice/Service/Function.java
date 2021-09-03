package FinalExamTwice.Service;

import FinalExamTwice.Controller.Main;
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
        System.out.print("Vui long chon the loai san pham:\n" +
                "1. Nhap khau.\n" +
                "2. Xuat khau.\n" +
                "Chon: ");
        int loaiSanPham = scanner.nextInt();
        switch (loaiSanPham) {
            case 1:
                String a = scanner.nextLine();
                String giaNhapKhau = inputGiaNhapKhau();

                System.out.print("Vui long nhap tinh thanh nhap: ");
                String tinhThanhNhap = scanner.nextLine();
                String thueNhapKhau = inputThueNhapKhau();
                sanPhamList.add(new SanPhamNhapKhau(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat,
                        giaNhapKhau, tinhThanhNhap, thueNhapKhau));
                ReadAndWriteFile.write(sanPhamList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExamTwice\\Data\\products.csv");
                break;
            case 2:
                String b = scanner.nextLine();
                String giaXuatKhau = inputGiaXuatKhau();
                System.out.print("Vui long nhap quoc gia xuat khau: ");
                String quocGiaXuatKhau = scanner.nextLine();
                sanPhamList.add(new SanPhamXuatKhau(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau
                        , quocGiaXuatKhau));
                ReadAndWriteFile.write(sanPhamList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExamTwice\\Data\\products.csv");
                break;
        }
    }

    public void hienThi() {
        sanPhamList = (List<SanPham>) ReadAndWriteFile.read("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExamTwice\\Data\\products.csv");
        for (SanPham sanPham : sanPhamList) {
            System.out.println(sanPham.toString());
        }
        System.out.println("----------<>----------");
    }

    public void xoa() throws NotFoundProductException {
        String maSanPham = inputMaSanPham();
        checkMaSanPham(maSanPham);
        System.out.println("Ban muon xoa san pham: \n" +
                "1. Co\n" +
                "2. Khong\n");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                for (int i = 0; i < sanPhamList.size(); i++) {
                    if (sanPhamList.get(i).getMaSanPham().equals(maSanPham)) {
                        sanPhamList.remove(i);
                    }
                }
                System.out.println("Xoa thanh cong.");
                ReadAndWriteFile.write(sanPhamList, "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\FinalExamTwice\\Data\\products.csv");
                hienThi();
                System.out.println("----------<>----------");
                Main.displayMenu();
                break;
            case 2:
                Main.displayMenu();
                break;
        }

    }

    public void timKiem() throws NotFoundProductException {
        System.out.print("Vui long nhap ma san pham hoac ten san pham: ");
        String search = scanner.nextLine();
        for (int i = 0; i < sanPhamList.size(); i++) {
            if (search.equals(sanPhamList.get(i).getMaSanPham())) {
                System.out.println(sanPhamList.get(i).toString());
            }
            if (search.equals(sanPhamList.get(i).getTenSanPham())) {
                System.out.println(sanPhamList.get(i).toString());
            }
        }
        System.out.println("----------<>----------");
    }

    public Boolean checkMaSanPham(String maSanPham) throws NotFoundProductException {
        Boolean check = false;
        for (SanPham sanPham : sanPhamList) {
            if (sanPham.getMaSanPham() == maSanPham) {
                return check = true;
            } else return check;
        }
        if (check == false) {
            throw new NotFoundProductException("San pham khong ton tai!");
        }
        return null;
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
