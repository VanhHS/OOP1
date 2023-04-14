public class baiTap6plus7 {
    public static void main(String[] args) {
        int[] arr = {3,4,6,10,2,3,1,3,6};
        int[] new_arr = removeElement(arr,2);

        for (int num: new_arr) {
            System.out.println(num);
        }
    }
    static int[] removeElement(int[] arr, int index) {
        int[] new_arr = new int[arr.length - 1];

        for (int i = 0,j = 0; i < new_arr.length; i++, j ++){
            if(i==index) {
                j++;
            }
            new_arr[i] = arr[j];
        }
        return new_arr;
    }
    static int[] copyArr(int[] arr) {
        int[] new_arr = new int[arr.length];

        for (int i  = 0; i < new_arr.length; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }
}
