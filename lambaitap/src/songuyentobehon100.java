public class songuyentobehon100 {
    public static void main(String[] args) {
        int i;
        boolean check = true;
        //khoi tao bien
        for (i = 2; i< 100; i++) {//khoi tao dieu kien cho bien count
            check = true;
            int j = 2;
            while (j <= Math.sqrt(i)) {//kiem tra so nguyen to
                if (i % j == 0) {
                    check = false;
                }
                j++;
            }
            if (check) {
                System.out.println("So nt: " + i);

            }
        }
    }
}
