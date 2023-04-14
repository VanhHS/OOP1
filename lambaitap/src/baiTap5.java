import java.util.Scanner;

public class baiTap5 {
    public static void main(String[] args) {
        int[] arr = {3,4,6,10,2,3,1,6,11};

        int[] new_arr = new int[arr.length+1];
        for (int i = 0; i<arr.length; i++) {
            new_arr[i] = arr[i];
        }
        System.out.println("Nhap phan tu can them: ");
        Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            addElement(new_arr, number, 2);

            for (int num : new_arr) {
                System.out.println(num);
            }
            int[] arr2 = new int[100];
    }
    static void addElement(int[] arr, int element, int index) {
        for (int i = arr.length -1; i > index; i--){
            arr[i] = arr[i-1];
        }
    }
}
