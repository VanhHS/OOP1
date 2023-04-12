import java.util.Scanner;

public class tinhsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.print("The month '2' has 28 or 29 days!");
                break;
            case 1:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
            case 3:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
        }
    }
}
