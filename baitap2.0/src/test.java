public class test {
    public static void main(String[] args) {
        // Cú pháp khai báo mảng đối tượng
        //ten_class ten_mang[] = new ten_class[do_dai_mang];
        Mobile arrMobile[] = new Mobile[10];
        // ten_class ten_doi_tuong = new ten_class();
        // ten_mang[vi_tri] = new ten_class();
        // Cách mạng
        for (int i = 0; i < arrMobile.length; i++) {
            arrMobile[i].display();
        }
        // Khai báo 1 mảng đối tượng Mobile có độ dài bằng 10
        // Theme 5 đối tượng Mobile vào mảng đối tượng trên
    }
}
