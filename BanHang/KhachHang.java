package BanHang;

import java.util.Scanner;

public class KhachHang {

    private String MaKH;
    private String Name;
    private String Gtinh;
    private String Ns;
    private String Dchi;
    static int cnt = 1;

    static Scanner in = new Scanner(System.in);

    public static KhachHang NhapKH() {
        KhachHang A = new KhachHang();
        A.setMaKH(A.cnt++);
        System.out.print("Nhập tên khách hàng: ");
        String Name = in.nextLine();
        A.setName(Name);
        System.out.print("Nhập giới tính: ");
        String Gtinh = in.next();
        A.setGtinh(Gtinh);
        System.out.print("Nhập ngày sinh: ");
        String Ns = in.next();
        A.setNs(Ns);
        in.nextLine();  // Loại bỏ ký tự newline thừa
        System.out.print("Nhập địa chỉ: ");
        String Dchi = in.nextLine();
        A.setDchi(Dchi);
        return A;
    }

    public void setMaKH(int Ma) {
        this.MaKH = Ma + "";
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setGtinh(String gt) {
        this.Gtinh = gt;
    }

    public void setNs(String ns) {
        this.Ns = ns;
    }

    public void setDchi(String Dchi) {
        this.Dchi = Dchi;
    }

    public String getMaKH() {
        return this.MaKH;
    }

    public String getName() {
        return this.Name;
    }

    public String getGtinh() {
        return this.Gtinh;
    }

    public String getNs() {
        return this.Ns;
    }

    public String getDchi() {
        return this.Dchi;
    }

}
