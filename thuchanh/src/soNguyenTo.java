public class soNguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố lớn hơn alf: ");
            for (int i = 0; i < 100; i++ ){
                if (isPrimeNumber(i)) {
                    System.out.print("," + i + "");
                }
            }
    }
    public  static boolean isPrimeNumber(int n) {//khởi tạo phương thức tìm số nguyên tố
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);//sử dụng phương thức căn bậc 2 để tìm số nguyên tố
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
