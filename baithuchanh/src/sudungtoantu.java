import java.util.Scanner;

public class sudungtoantu {
    public static void main (String[]args) {
        float width;//khai bao bien chieu rong
        float height;//khai bao bien chieu dai
        Scanner scanner = new Scanner(System.in);
            //quet du lieu nhap vao
        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Khoi tao gia tri cho bien width va nhap gia tri cua bien width

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Khoi tao gia tri cho bien height va nhap gia tri cua bien height
        float area = width * height ;
        System.out.println("Area is =" + area);//su dung toan tu nhan tinh dien tich hcn
    }
}
