import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); //khoi tao bien number
        if (number<2) {//Kiem tra xem number nhap vao vao có phai so nguyen to
            System.out.println(number + "number is not a prime");//In ra khi so vua nhap vao ko phai so nguyen to
        }else {

            int i = 2;//Khoi tao bien i
            boolean check = true;//Khoi tao bien check
            while (i <= Math.sqrt(number)) {//Kiem tra can bac 2 cua number
                if (number % i == 0) {//Neu number chia het cho 2 so do ko phai so nguyen to
                    check = false;//Bien check tra ve gia tri fasle
                    break;
                }
                i++;
            }
            if (check) {//Neu check = true tra ve so do la so nguyen to
                System.out.println(number + "is a prime");
            }else//Neu check = flase tra ve so do ko phai so nguyen to
                System.out.println(number + "is not a prime");
        }
    }
}
