import java.util.Scanner;

public class mangHaiChieu {
    public static void main(String[] args) {
        int [][] matrix = new  int[2][2];
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        //Nhập giá trị cho phần tử cuar mảng
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        //Dùng vòng lap duyệt mảng xong in ra
        int max = matrix[0][0];
        int index = 1;
        int index2 = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (max < matrix[row][column]) {
                    max = matrix[row][column];
                    index = row;
                    index2 = column;
                }
            }
        }
        //Dùng vòng lặp duyệt mảng tìm ra số lớn nhất của mảng 2 chiều
        System.out.println("MAx: " + max);

    }
}
