import java.util.Scanner;

public class AppQE {
    public static void main(String[] args) {
        double []dad;
        QuadraticEquation delta = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("A =");
        double a = scanner.nextDouble();
        System.out.println("B =");
        double b = scanner.nextDouble();
        System.out.println("C =");
        double c = scanner.nextDouble();


        delta.setA(a);
        delta.setB(b);
        delta.setC(c);
//        dad = delta.caculated();
//        for (int i = 0; i<dad.length;i++) {
//            System.out.println("Nghiem cua pt=" + dad);
//        }
       delta.getRoot1();
       delta.getRoot2();
        for (double display: delta.caculated()
             ) {
            System.out.println(display);
        }
//        System.out.println(delta.caculated());

    }
}
