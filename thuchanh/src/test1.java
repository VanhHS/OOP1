public class test1 {
    public static void main(String[] args) {
        int[] n = {4, 1, 5, 3,6,3};
        int []a =sort(n);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
        public static int[] sort ( int n[]){
            int i, j, temp;
            for (i = 0; i < n.length - i; i++) {
                for (j = 0; j < n.length - i - 1; j++) {
                    if (n[j] > n[j + 1]) {
                        temp = n[j];
                        n[j] = n[j + 1];
                        n[j + 1] = temp;
                    }
                }
            }
            return n;
        }
}
