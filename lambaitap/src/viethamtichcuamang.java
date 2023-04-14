public class viethamtichcuamang {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] arrNums = {5, 9, 7, 2, 3, 8, 1, 6, 4, 0};

        // Tính tích giá trị của toàn bộ phần tử trong mảng
        int product = 1;
        for(int num : arrNums) {
            product *= num;
        }

        // In tích giá trị của toàn bộ phần tử trong mảng
        System.out.println("Tích giá trị của toàn bộ phần tử trong mảng là: " + product);
    }
}
