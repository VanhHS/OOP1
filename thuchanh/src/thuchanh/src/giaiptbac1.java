import java.util.Scanner;

public class giaiptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double a,b,c;
        System.out.print("a :");
        a = sc.nextDouble();
        System.out.print("b :");
        b = sc.nextDouble();
        System.out.print("c :");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c -b)/ a;
            System.out.printf("Equation pass with x = 0f1\n", answer);
        }else  {
            if (b == 0) {
                System.out.print("The solution is al x!");
            }else {
                System.out.print("No solution");
            }
        }
    }
}