import java.util.Scanner;

public class tongSoLe {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 4;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 ==0) {
                int max = arr[0];
                int index = 1;
                for (int j = 0; j < arr.length; j++){
                    if (arr[j] > max){
                        max = arr[j];
                        index = j +1;
                        System.out.println(arr[j]);
            }
        }
    }
    }
    }
}
