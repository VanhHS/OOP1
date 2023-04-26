import java.awt.*;
import java.util.Scanner;

public class uocchunglonnhat {
    public static void main(String[] args) {
        int a;//khoi tao 2 bien a b
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        a = input.nextInt();//gan gia tri cho bien a
        System.out.println("Enter b:");
        b = input.nextInt();//gan gia tri cho bien b

        a = Math.abs(a);//sư dung ham tri tuyet doi
        b = Math.abs(b);

        if (a == 0 || b == 0) {//su dung toan tu logic
            System.out.println("No greatest common factor");
        }
        while (a != b) {//vong lap se chay neu a khac b
            if (a>b)//neu a>b uoc chung cua a = b-a
                a = a -b;
            else//neu b >a uoc chung = b = b-a
                b = b - a;
        }
        System.out.println("Greates common factor: "+ a);
    }
}
