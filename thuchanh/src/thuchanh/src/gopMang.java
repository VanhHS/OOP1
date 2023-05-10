public class gopMang {
    public static void main(String[] args) {
        int[] mang1= new int[2];
        mang1[0] = 1;
        mang1[1] = 2;
        //Khởi tạo mảng 1
        int[] mang2= new int[2];
        mang2[0] = 3;
        mang2[1] = 4;
        //Khởi tạo mạng 2
        int[] mang3 = new int[mang1.length + mang2.length];
        for (int i = 0, j = 0; i < mang3.length; i++){//Dùng vòng lặp for để gán giá trị cho mảng 3
            if(i < mang1.length) {//Dùng if để gán giá trị cho 2 phần tử đầu
                mang3[i] = mang1[i];
                continue;
            }
            mang3[i] = mang2[j];// i đang = 2 thì j =2
            j++;
        }
        for (int a = 0 ; a < mang3.length; a++)
        System.out.println(mang3[a]);//in ra mảng 3
    }
}
