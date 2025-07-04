package quan_ly_thong_tin_danh_ba.model.entity;

public class DanhBa {
    private String soDienThoai;
    private String nhomDanhBa;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa() {
        this.soDienThoai = "";
        this.nhomDanhBa = "";
        this.hoTen = "";
        this.gioiTinh = "";
        this.diaChi = "";
        this.email = "";
    }

    public DanhBa(String soDienThoai, String nhomDanhBa, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhomDanhBa = nhomDanhBa;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Danh bạ: "
                + "Số điện thoại: " + this.soDienThoai + "\n"
                + "Nhóm: " + this.nhomDanhBa + "\n"
                + "Họ tên: " + this.hoTen + "\n"
                + "Giới tính: " + this.gioiTinh + "\n"
                + "Địa chỉ: " + this.diaChi + "\n";
    }

    public String getInfoToCSV() {
        return this.soDienThoai
                + "," + this.nhomDanhBa
                + "," + this.hoTen
                + "," + this.gioiTinh
                + "," + this.diaChi
                + "," + this.ngaySinh
                + "," + this.email;
    }
}
