public class print1ToN {
    public static void main(String[] args) {
        int N = 10;// Khởi tọa biến N và gán giá trị cho N
        for (int i = 1; i<= N; i++) {//Khởi tạo vòng lặp for khởi tạo biến điều khiển ,khởi tạo điều kiện để in ra biến i , khởi tạo câu lệnh điều chỉnh biến điều khiển
            System.out.println(i);
        }
        int i = 1;
        while (i <= N ) {//Khởi tạo vòng lặp while để duyệt điều kiện
            System.out.println();
            i++;//sử dụng toán tử ++ để tăng giá trị của biến i lên
        }
    }
}
