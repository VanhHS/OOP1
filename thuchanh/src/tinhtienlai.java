import java.util.Scanner;

public class tinhtienlai {
    public static void main(String[] args) {
        double money = 1.0; //Khai bao bien tien gui, thang gui va tien lai
        int month = 1;
        double interestRate= 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();//Gan gia tri cho bien money

        System.out.println("Enter number of month: ");
        month = input.nextInt();//Gan gia tri cho bien month

        System.out.println("Enter annual interest rate in percentage ");
        interestRate = input.nextDouble();//Gan gia tri cho bien ti le lai xuat

        double totalInterest = 0;
        for (int i = 0;i < month; i++){//Su dung vong lap for de tinh lai xuat cua nam
            totalInterest += money * (interestRate/100)/12*month;

            System.out.println("Total of interest: " + totalInterest);
        }
    }
}
