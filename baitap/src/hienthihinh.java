import java.util.Scanner;

public class hienthihinh {
    public static void main (String[]args) {
            int choice = -1;
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("Exit");
            System.out.println("Enter your choice;");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter row:");
                    int row = input.nextInt();
                    System.out.println("enter colum");
                    int colum = input.nextInt();
                   for (int i = 0; i<=row; i++) {
                       for (int j =0; j< colum; j++ ) {
                           System.out.print(" *");
                       }
                       System.out.println();
                   }
                case 2:
                    int type = -1;
                    System.out.println("Menu");
                    System.out.println("1. top-left");
                    System.out.println("2. top-right");
                    System.out.println("3. bottom-left");
                    System.out.println("4. bottom-right");
                    System.out.println("Exit");
                    System.out.println("Enter your choice;");
                    type = input.nextInt();
                    int width = input.nextInt();
                    switch (type) {
                        case 1:
                               for (int b=width; b>0; b--){
                                   for (int a=b;a>0;a--){
                                       System.out.print(" * ");
                                   }
                                   System.out.println();
                               }
                        case 2:
                            for (int a=1;a<=9;a--){
                                for (int b=1; b<=a; b++){
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                    }
            }
    }
}
