public class AppMobile {
    public static void main(String[] args) {
            Mobile objMobile1 =new Mobile();

            System.out.println("Thông tin điện thoại 1");

            objMobile1.setHangSanXuat("SamSung");
            System.out.println("Hãng điện thoại : " + objMobile1.getHangSanXuat());
            objMobile1.setMauSac("Vàng");
            System.out.println("Màu điện thoại : " + objMobile1.getMauSac());
            objMobile1.setChieuRong(15);
            System.out.println("Chiều rộng điện thoại : " + objMobile1.getChieuRong());

            Mobile objMobile2 =new Mobile("Iphone");

            System.out.println("Thông tin điện thoại 2");

            objMobile2.setChieuDai(12);
            System.out.println("Chiều dài điện thoại : " + objMobile2.getChieuDai());
            objMobile2.setChieuRong(20);
            System.out.println("Chiều rộng điện thoại : " + objMobile2.getChieuRong());
            objMobile2.setMucNangLuong(100);
            System.out.println("Mức năng lượng của điện thoại : " + objMobile2.getMucNangLuong());
    }
}
