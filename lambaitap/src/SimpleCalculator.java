import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1, num2;//Khai bao 2 bien num1, num2
        Scanner sc = new Scanner(System.in);//Khai bao bien Scanner

        System.out.println("Nhập số thứ nhất: ");
        num1 = sc.nextInt();//Gan gia tri cho bien num1
        System.out.println("Nhập so thu hai: ");
        num2 = sc.nextInt();//Gan gia tri cho bien num2

        System.out.println("Tổng hai số là: " + (num1 + num2));
        System.out.println("Tích hai số là: " + (num1 * num2));
        System.out.println("Thương hai số là: " + (num1 / num2));
        System.out.println("Phần dư khi chia hai số là: " + (num1 % num2));
        //In ra ket qua
    }
}
