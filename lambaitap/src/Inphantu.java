public class Inphantu {
    public static void main(String[] args) {
        // Khai báo mảng số nguyên gồm 10 phần từ
        // Khai báo 1 mảng số nguyên gồm 10 phần từ bất kỳ. In kết quả ra bằng for, while và foreach.
        int[] arrNums = {5, 9, 7, 2, 3, 8, 1, 6, 4, 0};

        // In kết quả bằng vòng lặp for
        System.out.println("In kết quả bằng vòng lặp for:");
        for(int i = 0; i < arrNums.length; i++) {
            System.out.println(arrNums[i]);
        }

        // In kết quả bằng vòng lặp while
        System.out.println("In kết quả bằng vòng lặp while:");
        int i = 0;
        while(i < arrNums.length) {
            System.out.println(arrNums[i]);
            i++;
        }

        // In kết quả bằng vòng lặp foreach
        System.out.println("In kết quả bằng vòng lặp foreach:");
        for(int num : arrNums) {
            System.out.println(num);
        }
    }
}
