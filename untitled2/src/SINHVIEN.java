import java.io.Serializable;
import java.util.Scanner;

public class SINHVIEN extends NGUOI implements TAIKHOAN, Serializable {
    private static final long serialVersionUID = 1L;

    private int maSV;
    private String nganhNghe;
    private String tenTk;
    private String matKhau;

    public SINHVIEN(String hoTen, String ngaySinh, String gioiTinh, long CCCD, int maSV, String nganhNghe) {
        super(hoTen, ngaySinh, gioiTinh, CCCD);
        this.maSV = maSV;
        this.nganhNghe = nganhNghe;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String[] nhapTaiKhoan() {
        Scanner sc = new Scanner(System.in);
        String[] taiKhoan = new String[2];
        System.out.println("--Nhập tên tài khoản: ");
        taiKhoan[0] = sc.nextLine();
        System.out.println("--Nhập mật khẩu: ");
        taiKhoan[1] = sc.nextLine();
        return taiKhoan;
    }

    @Override
    public String toString() {
        return "SINHVIEN{" +
                "maSV=" + maSV +
                ", nganhNghe='" + nganhNghe + '\'' +
                ", tenTk='" + tenTk + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", hoTen='" + getHoTen() + '\'' +
                ", ngaySinh='" + getNgaySinh() + '\'' +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", CCCD='" + getCCCD() + '\'' +
                '}';
    }


}
