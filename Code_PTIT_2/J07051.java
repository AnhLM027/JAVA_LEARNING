package Code_PTIT_2;


import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class J07051 {
    public static String ns(String s){
        String[] a=s.split("/");
        if(a[0].length()==1)a[0]="0"+a[0];
        if(a[1].length()==1)a[1]="0"+a[1];
        return a[0]+"/"+a[1]+"/"+a[2];
    }
    public static long thoigian(String checkin,String checkout) throws ParseException{
        checkin=ns(checkin);
        checkout=ns(checkout);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        return  sdf.parse(checkout).getTime()-sdf.parse(checkin).getTime();
    }
    public static String convert(String s){
        s=s.trim();
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
    static class KH{
        private String id,sophong,ten;
        private long tien,songayo;
 
        public KH(int id, String ten,String sophong, String checkin, String checkout, long tien) {
            this.id = "KH"+String.format("%02d", id);
            String[] a=ten.split("\\s++");
            String res="";
            for(int i=0;i<a.length;++i){
                res=res+convert(a[i])+" ";
            }
            this.ten = res.trim();
            this.sophong=sophong;
            this.tien = tien;
            try{
                songayo=   thoigian(checkin,checkout)/(24*60*60*1000)+1;
            }catch(ParseException ex){
 
            }
        }
        public long gia(){
            String tmp= sophong.substring(0, 1);
            if(tmp.equals("1"))return 25*songayo+tien;
            else if(tmp.equals("2"))return 34*songayo+tien;
            else if(tmp.equals("3"))return 50*songayo+tien;
            else return 80*songayo+tien;
 
        }
 
        @Override
        public String toString() {
            return id+" "+ten+" "+sophong+" "+songayo+" "+gia();
        }
 
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc= new Scanner (new File("KHACHHANG.in"));
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<KH> arr= new ArrayList<>();
        for(int i=1;i<=t;++i){
            KH x= new KH(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),  Long.parseLong(sc.nextLine()));
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<KH>(){
            @Override
            public int compare(KH o1, KH o2) {
                return (int) (o2.gia()-o1.gia());
            }
 
        });
        for(KH x: arr){
            System.out.println(x);
        }
    }
}