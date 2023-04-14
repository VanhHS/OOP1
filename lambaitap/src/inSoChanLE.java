import java.util.Scanner;

public class inSoChanLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Quet du lieu ng dung nhap voa
        System.out.println("Entern a number: ");
        int num= sc.nextInt() ; //Khai bao bien
        if(num % 2 == 0) {//Cau dk neu num chia het cho 2 thi so do la so chan
            System.out.println(num + " là số chẵn");
        }
        else {//Neu num = fasle so do la so le
            System.out.println(num + " là số lẻ");
        }
    }
}



