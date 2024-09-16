package BanHang;

public class HoaDon {

    private String MaHD, MaKH, MaMH;
    private int Val;
    private int LoiNhuan;
    private KhachHang khachHang;
    private MatHang matHang;
    static int cnt = 1;

    public HoaDon() {
    }

    public HoaDon(int i, KhachHang khachHang, MatHang matHang) {
        setMaHD(cnt++);
        this.khachHang = khachHang;
        this.matHang = matHang;
    }

    public void inHoaDon() {
        System.out.println(this.MaHD + " " + khachHang.getName() + " " + khachHang.getGtinh() + " " + khachHang.getNs()
                + " " + khachHang.getDchi() + " " + matHang.getName() + " " + matHang.getDvi() + " " + matHang.getLoiNhuan());
    }

    public void setMaHD(int n) {
        this.MaHD = Integer.toString(n);
        while (this.MaHD.length() < 3) {
            this.MaHD = '0' + this.MaHD;
        }
    }

    public void setMaKH(String Makh) {
        this.MaKH = Makh;
    }

    public void setMaMH(String Mamh) {
        this.MaMH = Mamh;
    }

    public void setVal(int val) {
        this.Val = val;
    }

    public void setLoiNhuan(int loiNhuan) {
        this.LoiNhuan = loiNhuan;
    }

    public String getMaHD() {
        return this.MaHD;
    }

    public String getMaKH() {
        return this.MaKH;
    }

    public String getMaMH() {
        return this.MaMH;
    }

    public int getVal() {
        return this.Val;
    }

    public int getLoiNhuan() {
        return this.LoiNhuan;
    }
}
