import java.util.Scanner;

public class soThanhChu {
    public static void main(String[] args) {
        System.out.println("Nhap so ban can doc: ");
        Scanner sc = new Scanner(System.in);
        int soCanDoc;

        while (true) {
            soCanDoc = sc.nextInt();
            if (0 <= soCanDoc && soCanDoc < 10) {
                break;
            }
        }
    }
}
