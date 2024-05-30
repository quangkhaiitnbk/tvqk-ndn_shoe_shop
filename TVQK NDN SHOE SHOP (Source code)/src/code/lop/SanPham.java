package code.lop;

public class SanPham {

    private String maSp;
    private String tenSp;
    private String ngayNhap;
    private int soluong;
    private int gia;
    private int giaban;
    private String loaisp;
    private String ngayban;
    private int Soluongban;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSp, String ngayNhap, int soluong, int gia, int giaban, String loaisp, String ngayban, int Soluongban) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.ngayNhap = ngayNhap;
        this.soluong = soluong;
        this.gia = gia;
        this.giaban = giaban;
        this.loaisp = loaisp;
        this.ngayban = ngayban;
        this.Soluongban = Soluongban;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public String getNgayban() {
        return ngayban;
    }

    public void setNgayban(String ngayban) {
        this.ngayban = ngayban;
    }

    public int getSoluongban() {
        return Soluongban;
    }

    public void setSoluongban(int Soluongban) {
        this.Soluongban = Soluongban;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", ngayNhap=" + ngayNhap + ", loaisp=" + loaisp + ", soluong=" + soluong + ", gia=" + gia + '}';
    }

    public String getXMLString() {
        return "<sanpham>\n"
                + "\t<maSp>" + maSp + "</maSp>\n"
                + "\t<tenSp>" + tenSp + "</tenSp>\n"
                + "\t<ngaynhap>" + ngayNhap + "</ngaynhap>\n"
                + "\t<loaiSp>" + loaisp + "</loaiSp>\n"
                + "\t<soluong>" + soluong + "</soluong>\n"
                + "\t<gia>" + gia + "</gia>\n"
                + "</sanpham>\n";
    }

    public String getXMLStringBanhang() {
        return "<sanpham>\n"
                + "\t<maSp>" + maSp + "</maSp>\n"
                + "\t<tenSp>" + tenSp + "</tenSp>\n"
                + "\t<ngayban>" + ngayban + "</ngayban>\n"
                + "\t<loaiSp>" + loaisp + "</loaiSp>\n"
                + "\t<soluongban>" + Soluongban + "</soluongban>\n"
                + "\t<giaban>" + giaban + "</giaban>\n"
                + "\t<gia>" + gia + "</gia>\n"
                + "</sanpham>\n";
    }

}
