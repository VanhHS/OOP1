public class phuongthuclonnhat {

    public static int findMax(int[] arr) {//khoi tao phuong thuc tim gia tri lon nhat
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 5, 15, 2};
        int max = findMax(arr);//goi phuong thuc
        System.out.println("Max value: " + max);
    }

}
