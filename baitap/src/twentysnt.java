public class twentysnt {
    public static void main (String[]args) {
        System.out.println("Nhập số lượng số nguyên tố cần tìm: ");
        int number = 20;
        // numbers là số luong snt cần in ra
        System.out.println("%d Số nguyên tố đầu tiên là :");
        int count = 0;
        // đếm xem số lượng số nguyên tố cần in ra đã = numbers hay chưa
        int n = 2;
        // kiểm tra xem giá trị nó nhận đc có phải snt hay ko
        while (count < number) {
            if (isPrimeNumber(n)) {
                System.out.print(n + "");
                count++;
            }
            n++;
        }
    }
    public static boolean isPrimeNumber (int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int n = 2; n < squareRoot; n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return  true;
    }
}
