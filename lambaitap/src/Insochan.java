public class Insochan {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] arrNums = {5, 9, 7, 2, 3, 8, 1, 6, 4, 0};

        // In các số chẵn trong mảng
        for(int num : arrNums) {
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
