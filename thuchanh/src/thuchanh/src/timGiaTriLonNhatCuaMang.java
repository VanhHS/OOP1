import java.util.Scanner;

public class timGiaTriLonNhatCuaMang {
    public static void main(String[] args) {
        int size;
        int []array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
        //Khai báo biến và nhập kiểm tra kích thước mảng
                System.out.println("Size shouldn't exceed 20");
        }while (size > 20);
        array  = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("Enter element" + (i +1) + " : ");
            array[i]= scanner.nextInt();
            i++;
        //Nhập giá trị cho các phần tử của mảng
        }
        System.out.print("Propety list: ");
        for (int j =0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        //in ra danh sách đã nhập
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j +1;
        //Duyệ các phần tử trong mảng để tìm giá trị lớn nhất
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
