package BanHang;

import java.util.Scanner;

public class MatHang {

    private String MaMH;
    private String Name;
    private String Dvi;
    private int Mua;
    private int Ban;
    public static int cnt = 1;

    static Scanner in = new Scanner(System.in);

    MatHang(){
        
    }
    public static MatHang NhapMH() {
        MatHang A = new MatHang();
        A.setMaMH(A.cnt++);
        System.out.print("Nhập tên mặt hàng: ");
        String Name = in.nextLine();
        A.setName(Name);
        System.out.print("Nhập đơn vị: ");
        String Dvi = in.nextLine();
        A.setDvi(Dvi);
        System.out.print("Nhập giá mua: ");
        int mua = in.nextInt();
        A.setMua(mua);
        System.out.print("Nhập giá bán: ");
        int ban = in.nextInt();
        A.setBan(ban);
        in.nextLine(); // Loại bỏ ký tự newline thừa
        System.out.println("Bắt đầu nhập khách hàng tiếp theo");
        return A;
    }

    public void setMaMH(int Ma) {
        this.MaMH = Ma + "";
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setDvi(String dvi) {
        this.Dvi = dvi;
    }

    public void setMua(int Mua) {
        this.Mua = Mua;
    }

    public void setBan(int Ban) {
        this.Ban = Ban;
    }

    public String getMa() {
        return this.MaMH;
    }

    public String getName() {
        return this.Name;
    }

    public String getDvi() {
        return this.Dvi;
    }

    public int getMua() {
        return this.Mua;
    }

    public int getBan() {
        return this.Ban;
    }

    public int getLoiNhuan() {
        return this.Ban - this.Mua;
    }
}
