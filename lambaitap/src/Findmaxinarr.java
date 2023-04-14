public class Findmaxinarr {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] arrNums = {5, 9, 7, 2, 3, 8, 1, 6, 4, 0};

        // Tìm giá trị lớn nhất
        int max = arrNums[0];
        for(int i = 1; i < arrNums.length; i++) {
            if(arrNums[i] > max) {
                max = arrNums[i];
            }
        }

        // In giá trị lớn nhất
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}
