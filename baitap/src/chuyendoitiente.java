import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc =  new Scanner(System.in);
        usd = sc.nextDouble();
        double quy_doi = usd * 23000;
        System.out.println("Giá trị VND" + quy_doi);
    }
}
