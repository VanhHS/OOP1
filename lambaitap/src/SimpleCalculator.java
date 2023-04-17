import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Khai bao bien Scanner
        int num1, num2;//Khai bao 2 bien num1, num2


        System.out.println("Nhập số thứ nhất: ");
        num1 = input.nextInt();//Nhap va gan gia tri cho bien num1
        System.out.println("Nhập so thu hai: ");
        num2 = input.nextInt();//NHap va gan gia tri cho bien num2

        System.out.print("Nhap phep tinh (+,-,*,/,%)");
        char pheptinh = input.next().charAt(0);//Nhap va gan gia chi cho pheptinh

        switch (pheptinh) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;

            default:
                System.out.println("Phep tinh khong hop le.");
                break;
        }
    }
}
