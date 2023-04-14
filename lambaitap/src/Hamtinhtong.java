public class Hamtinhtong {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] arrNums = {5, 9, 7, 2, 3, 8, 1, 6, 4, 0};

        // Tính tổng giá trị của toàn bộ phần tử trong mảng
        int sum = 0;
        for(int num : arrNums) {
            sum += num;
        }

        // In tổng giá trị của toàn bộ phần tử trong mảng
        System.out.println("Tổng giá trị của toàn bộ phần tử trong mảng là: " + sum);
    }
}
