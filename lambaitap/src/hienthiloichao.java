import java.util.Scanner;

public class hienthiloichao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Khai bao doi tuong Scanner
        System.out.println("Enter your name: ");
        String name = sc.nextLine();//Nhap gia tri du lieu voa bien name
        System.out.println("Hello: " + name);// In ra man loi chao + ten

    }
}
