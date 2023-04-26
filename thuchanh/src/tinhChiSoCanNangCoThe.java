import java.util.Scanner;
public class tinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Your weight (in kilogram) :");
        weight = sc.nextDouble();
        System.out.print("Your height (in meter)");
        height = sc.nextDouble();

        bmi = weight/Math.pow(height,2);
        System.out.printf("0-20s0s");
    }
}
