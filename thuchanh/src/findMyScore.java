public class findMyScore {
    public static void main(String[] args) {
        int[] mang = new int[5];
        mang[0] = 5;
        mang[1] = 6;
        mang[2] = 2;
        mang[3] = 3;
        mang[4] = 8;
        findMyScore(mang);
    }

    public static void findMyScore(int[] mang) {//định nghĩa 
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] > min) {
                min = mang[i];
            }
        }
        System.out.println(min);
    }
}
