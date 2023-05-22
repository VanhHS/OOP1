public class isOddEven {
    public static boolean isOddEven(int number){
        if(number % 2 ==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 24;
        boolean result = isOddEven(number);
        System.out.println(result); // In ra true nếu number là số chẵn, false nếu không phải
    }
}
