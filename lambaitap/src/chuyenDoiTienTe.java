import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;//khai bao va gan gia tri cho bien vnd
        double usd;//khai bao bien usd
        Scanner sc = new Scanner(System.in);// khai bao doi tuong scanner
        System.out.println("Moi ban nhap so tien USD: ");
        usd = sc.nextDouble();//NHap gia tri tu ban phim va gan gia tri vua nhap vao bien usd
        double quydoi = usd * 23000;//Khai bao bien quysdoi va gan gia tri cho bien quydoi
        System.out.println("Gia tri VND:" + quydoi);
    }
}
