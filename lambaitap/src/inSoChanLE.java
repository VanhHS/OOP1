import java.util.Scanner;

public class inSoChanLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Khai bao doi tuong  Scanner
        System.out.println("Entern a number: ");
        int num= sc.nextInt() ; //NHap gia tri tu ban phim va gan gia tri vua nhap vao bien num
        if(num % 2 == 0) {//Cau dk neu num chia het cho 2 thi so do la so chan
            System.out.println(num + " là số chẵn");
        }
        else {//Neu num = fasle so do la so le
            System.out.println(num + " là số lẻ");
        }
    }
}



