import java.util.Scanner;

public class tinhchisocannang {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height,  bmi;//Khai bao bien can nang va chieu cao , chi so khoi co the

        System.out.println("Your weight(in kilogram");
        weight = scanner.nextDouble();//Khoi tao va nhap gia tri cho bien

        System.out.println("Your height(in meter");
        height = scanner.nextDouble();//Khoi tao va nhap gia tri cho bien

        bmi = weight / Math.pow(height, 2);//Su dung toan tu tinh chi so can nang theo cong thuc

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
        // Hien thi chi so va phan loai ket qua
    }
}
