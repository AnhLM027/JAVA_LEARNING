package BanHang;

import java.util.Scanner;


public class QuanLyBanHang {
    
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = in.nextInt();
//	System.out.println(n);
        HoaDon[] HD = new HoaDon[10];
        for (int i = 0; i < n; i++) {
            KhachHang KH = KhachHang.NhapKH();
            MatHang MH = MatHang.NhapMH();
            HD[i] = new HoaDon(i, KH, MH);
        }
        for (int i = 0; i < n; i++) {
            HD[i].inHoaDon();
        }
    }

}
