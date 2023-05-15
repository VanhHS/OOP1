import java.util.Scanner;

public class phuongThucChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kì :  " );
        int num;
        num = scanner.nextInt();
        if (num%2 == 0){
            System.out.println(num + "là số chẵn");
        }else {
            System.out.println(num + " là số lẻ");
        }
    }
}
