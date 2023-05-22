public class isSquare {
    public static boolean isSquare(int n){
        double sq = Math.sqrt(n);
        return ((sq - Math.floor(sq))==0);
    }
    public static void main(String[] args) {

    }
}
