import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu 0 den 8");
        n = sc.nextInt();

        switch (n) {
            case 2: {
                System.out.println("Thứ 2 ");
                break;
            }
            case 3: {
                System.out.println("Thứ 3 ");
                break;
            }
            case 4: {
                System.out.println("Thứ 4 ");
                break;
            }
            case 5: {
                System.out.println("Thứ 5 ");
                break;
            }
            case 6: {
                System.out.println("Thứ 6 ");
                break;
            }
            case 7: {
                System.out.println("Thứ 7 ");
                break;
            }
            case 8: {
                System.out.println("Chủ nhật ");
                break;
            }
        }
    }
}
