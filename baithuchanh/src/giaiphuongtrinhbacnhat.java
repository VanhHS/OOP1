import java.util.Scanner;

public class giaiphuongtrinhbacnhat {
    public static void main (String[]args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a question as'a * x +b =c',please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();//Khoi taoo bien a kieu bien double

        System.out.print("b: ");
        double b = scanner.nextDouble();//Khoi tao bien b kieu bien double

        System.out.print("c: ");
        double c = scanner.nextDouble();//Khoi tao bien c kieu bien double
        if (a != 0) {//Cau dieu kien neu a khac 0 phuong trinh bac nhac nhat co duy nhat 1 nghiem
            double answer = (c - b) /a;//Khoi tao nghiem cua phuong trinh bac nhat & su dung toan tu tinh ra nghiem cua phuong trinh bac nhat
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {// a == 0 tra ve 2 kha nag
                if (b==c) {//Dieu kien neu c==b tra ve ket qua
                    System.out.print("The solution is all x!");
                }else {// b khong bang c phuong trinh ko co nghiem
                    System.out.print("No solution!");
                }
        }
    }
}
