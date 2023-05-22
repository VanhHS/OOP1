public class solesochan {
    public static void main(String[] args) {
        int num = 4;
        boolean n = isOddEven(num);
        if (n){
            System.out.println("La so chan");
        }else {
            System.out.println("la so le");
        }
    }
    public static boolean isOddEven(int n){
        if(n % 2 == 0){
            return true;
        }else
            return false;
    }
}
