
import java.util.Scanner;

public class khaiBaoKhoiTaoNhapVaIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();//gán giá trị cho độ dài mảng
        // khởi tạo mảng arr
        int[] arr = new int[n];// khởi tạo mảng  và thêm phần tử
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {//gán giá trị cho từng phần tử của mảng
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: ");
        show(arr);//in ra các phần tử của mảng
    }

    private static void show(int[] arr) {
    }
}
