package FinalExam.Models;

public class BenhAnThuong extends BenhAn {
    private String phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn, String tenBenhNhan,
                        String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phiNamVien, String benhAn) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "phiNamVien='" + phiNamVien + '\'' +
                '}';
    }
}
