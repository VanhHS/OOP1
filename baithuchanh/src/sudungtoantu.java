import java.util.Scanner;

public class sudungtoantu {
    public static void main (String[]args) {
        float width;//khai bao bien chieu rong
        float height;//khai bao bien chieu dai
        Scanner scanner = new Scanner(System.in);
            //quet du lieu nhap vao
        System.out.println("Enter width: ");//nhap do dai chieu rong
        width = scanner.nextFloat();//quet du lieu nhap vao

        System.out.println("Enter height: ");// nhap do dai chieu dai
        height = scanner.nextFloat();//quet du lieu nhap vao

        float area = width * height ;
        System.out.println("Area is =" + area);//su dung toan tu nhan tinh dien tich hcn
    }
}
