public class IsPrime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 13;
        boolean result = isPrime(number);
        System.out.println(result); // In ra true nếu number là số nguyên tố, false nếu không phải
    }
}