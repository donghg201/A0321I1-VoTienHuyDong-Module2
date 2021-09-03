package FinalExamTwice.Model;

import java.io.Serializable;

public class SanPhamXuatKhau extends SanPham implements Serializable {
    private String giaXuatKhau;
    private String quocGiaXuatKhau;

    public SanPhamXuatKhau(int idSanPham, String maSanPham, String tenSanPham,
                           String giaBan, String soLuong, String nhaSanXuat, String giaXuatKhau, String quocGiaXuatKhau) {
        super(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaXuatKhau = quocGiaXuatKhau;
    }


    public String getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(String giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaXuatKhau() {
        return quocGiaXuatKhau;
    }

    public void setQuocGiaXuatKhau(String quocGiaXuatKhau) {
        this.quocGiaXuatKhau = quocGiaXuatKhau;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" + super.getIdSanPham() + ", " +
                super.getMaSanPham() + ", " +
                super.getTenSanPham() + ", " +
                super.getGiaBan() + ", " +
                super.getSoLuong() + ", " +
                super.getNhaSanXuat() + ", " +
                this.getGiaXuatKhau() + ", " +
                this.getQuocGiaXuatKhau()
                + '}';
    }
}
