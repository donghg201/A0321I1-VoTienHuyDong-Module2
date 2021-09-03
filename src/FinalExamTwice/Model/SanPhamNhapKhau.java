package FinalExamTwice.Model;

import java.io.Serializable;

public class SanPhamNhapKhau extends SanPham implements Serializable {
    private String giaNhapKhau;
    private String tinhThanhNhap;
    private String thueNhapKhau;

    public SanPhamNhapKhau(int idSanPham, String maSanPham, String tenSanPham,
                           String giaBan, String soLuong, String nhaSanXuat, String giaNhapKhau,
                           String tinhThanhNhap, String thueNhapKhau) {
        super(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public String getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(String giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public String getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" + super.getIdSanPham() + ", " +
                super.getMaSanPham() + ", " +
                super.getTenSanPham() + ", " +
                super.getGiaBan() + ", " +
                super.getSoLuong() + ", " +
                super.getNhaSanXuat() + ", " +
                this.getGiaNhapKhau() + ", " +
                this.getTinhThanhNhap() + ", " +
                this.getThueNhapKhau()
                + '}';
    }
}
