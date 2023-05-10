import java.util.Scanner;

public class reversephantu {
    public static void main(String[] args) {
        int size;//khởi tạo biến độ dài mảng
        int[] array;//khởi tạo mảng
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();//nhập độ dài của mảng
            if (size>20);//
            System.out.println("Size does not exceed 20");
        }while (size > 20);

        array = new int[size];//gán giá trị cho độ dài của mảng
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i +1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array:","");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");//in ra mảng đã nhập
        }
        for (int j = 0; j < array.length; j++) {
            int temp = array[j];//luu lai giá trị của phần tử có vị trí j cho biến temp
            array[j] = array[size - 1 -j];//gán giá trị của phần tử có vị trí size - 1 - j cho phần tử j
            array[size - 1 - j] = temp;//gán giá trị biến temp cho phần tử có vị trí size - 1 - j
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");//in ra mảng đã đảo ngược các phần tử
        }
    }
}
