public class test2 {
    public static void main(String[] args) {
        int count = 1;
        int i = 0;
        while (i <= 1000) {
            i++;
            if (i  == 400) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
