public class findMaxScore {
    public  static  int findMaxScore(int n []){
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
    int[] n = {5,1,4,8,6,9};
    int a = findMaxScore(n);
        System.out.println(a);
    }
}
