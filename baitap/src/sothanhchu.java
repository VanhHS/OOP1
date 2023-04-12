import java.util.Scanner;

public class sothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter:");
        int number = scanner.nextInt();
        int lastNum = number % 10;
        int n = number / 10;
        int secondNum = n % 10;
        int firstNum = number / 100;
        if(number<0 || number>999){
            System.out.println("nhap sai");
        }else {
            String first[] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            String second[] = {"","ten","twenty","thirtty","fourty","fifty","sixty","seventy","eighty","ninety"};
            String last [] = {"hundred"};
            if (number<20){
                System.out.println(first[number]);
            } else if (number<100) {
                System.out.println(second[secondNum] +" "+ first[lastNum] );
            } else {
                System.out.println(first[firstNum] +" "+ last[0] +" "+ second[secondNum] +" "+ first[lastNum]);
            }
        }
    }
}
