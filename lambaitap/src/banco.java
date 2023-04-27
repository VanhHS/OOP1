import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap so cot cua ban co");
        n = scanner.nextInt();//Gan gia tri cho bien n
        int m;
        System.out.println("Nhap so hang cua ban co");
        m = scanner.nextInt();//Gan gia tri cho bien m
        int i;
        int j;
        //Khoi tao bien
        for (j = 0; j < m; j++) {//Su dung vong lap for de in ra so hang
            System.out.print("");
            for (i = 0; i < n; i++) {//Su dung vong lap de in ra so cot
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
