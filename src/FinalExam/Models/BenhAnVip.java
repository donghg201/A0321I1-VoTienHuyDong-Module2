package FinalExam.Models;

import java.io.Serializable;

public class BenhAnVip extends BenhAn implements Serializable {
    private String loaiVip;
    private String thoiHanVip;

    public BenhAnVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan,
                     String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip, String hanVip) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public BenhAnVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan,
                     String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                getSoThuTu() + ", " +
                getMaBenhAn() + ", " +
                getMaBenhNhan() + ", " +
                getTenBenhNhan() + ", " +
                getNgayNhapVien() + ", " +
                getNgayRaVien() + ", " +
                getLyDoNhapVien() +
                '}';
    }
}
