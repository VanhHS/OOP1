import java.util.Scanner;

public class nhapVaHienThi {
    public static void main(String[] args) {
        int n = 5; // Số phần tử trong mảng
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);

        // Gọi phương thức để nhập giá trị cho các phần tử trong mảng
        inputArray(arr, n, scanner);

        // Gọi phương thức để hiển thị các phần tử trong mảng
        outputArray(arr, n);
    }
    // Phương thức để nhập giá trị cho các phần tử trong mảng
    public static void inputArray(int[] arr, int n, Scanner scanner) {
        System.out.println("Nhập giá trị cho các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    // Phương thức để hiển thị các phần tử trong mảng
    public static void outputArray(int[] arr, int n) {
        System.out.println("Các phần tử trong mảng là:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

