import java.util.Scanner;

public class runCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        String s= scanner.nextLine();
        System.out.println("Enter color:");
        String color = scanner.nextLine();

        Circle circle = new Circle(radius);

        double a = circle.getRadius();
        System.out.println("Diện tích hình tròn là" + circle.getArea());
        System.out.println("Màu của hình tròn là " + circle.color(color));
    }
}
