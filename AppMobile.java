public class AppMobile {
    public static void main(String[] args) {
        Mobile objMobile1 = new Mobile();
        objMobile1.setHangSanXuat("SamSung");
        objMobile1.setMau("MàuVang");
        objMobile1.setDoRong(15);

        System.out.println("Hang san xuat cua objMobile1 la:" + objMobile1.getHangSanXuat());
        System.out.println("Ma cua objMobile1 la" + objMobile1.getMaDienThoai());
        System.out.println("Mau cua objMobile1 la" + objMobile1.getMau());
        System.out.println("Chieu dai cua objMobile1" + objMobile1.getDoDai());
        System.out.println("Chieu rong cua objMobile1" + objMobile1.getDoRong());
        System.out.println("Do day cua objMobile1" + objMobile1.getDoDay());
        System.out.println("Muc nang luong objMobile1 " + objMobile1.getMucNangLuong());

        Mobile objMobile2 = new Mobile("Apple");

        objMobile2.setDoDai(12);
        objMobile2.setDoRong(20);
        objMobile2.setMucNangLuong(100);

        System.out.println("Hang san xuat cua objMobile2 la:" + objMobile2.getHangSanXuat());
        System.out.println("Ma cua objMobile2 la" + objMobile2.getMaDienThoai());
        System.out.println("Mau cua objMobile2 la" + objMobile2.getMau());
        System.out.println("Chieu dai cua objMobile2x" + objMobile2.getDoDai());
        System.out.println("Chieu rong cua objMobile2" + objMobile2.getDoRong());
        System.out.println("Do day cua objMobile2" + objMobile2.getDoDay());
        System.out.println("Muc nang luong objMobile2 " + objMobile2.getMucNangLuong());

    }
}
