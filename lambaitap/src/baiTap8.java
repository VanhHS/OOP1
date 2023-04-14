public class baiTap8 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 10, 2, 3, 1, 6, 11};

//        for (int num :) {
//            if (isPrime(num)) {
//
//            }
//        }
    }

    static boolean isPrime(int number) {
        boolean check = true;

        if (number == 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                check = false;
            }
        }
        return check;
    }
}
