public class NGUOI {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private long CCCD;

    public NGUOI() {
    }

    public NGUOI(String hoTen, String ngaySinh, String gioiTinh, long CCCD) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public long getCCCD() {
        return CCCD;
    }

    public void setCCCD(long CCCD) {
        this.CCCD = CCCD;
    }
}
