public class haimuoisonguyentodautien {
    public static void main(String[] args) {
        int i;
        int count = 0;
        boolean check = true;
        //khoi tao bien
        for (i = 2; count < 20; i++) {//khoi tao dieu kien cho bien count
            check = true;
            int j = 2;
            while (j <= Math.sqrt(i)) {//kiem tra so nguyen to
                if (i % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println("So nt: " + i);
                count++;//bien cout + them 1 den khi count < 20
            }
        }
    }
}
