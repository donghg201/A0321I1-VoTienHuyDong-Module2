package FinalExam.Models;

import java.io.Serializable;

public class BenhAnThuong extends BenhAn implements Serializable {
    private String phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan,
                        String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan,
                        String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
    }


    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" + getSoThuTu() + ", " +
                getMaBenhAn() + ", " +
                getMaBenhNhan() + ", " +
                getTenBenhNhan() + ", " +
                getNgayNhapVien() + ", " +
                getNgayRaVien() + ", " +
                getLyDoNhapVien() +
                '}';
    }
}
