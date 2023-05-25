public class AppHocSinh {
    public static void main(String[] args) {
        HocSinh objHS1 = new HocSinh();


        objHS1.setMaHocSinh("HS00001");//Gán giá chị cho chuỗi là phải có láy kép
        objHS1.setTenHocSinh("Nguyễn Văn Nam");
        objHS1.setTuoi(15);

        System.out.println("Mã học sinh objHS1:" + objHS1.getMaHocSinh());
        System.out.println("Tên học sinh objHS1:"+ objHS1.getTenHocSinh());
        System.out.println("Tuổi học sinh objHS1:" + objHS1.getTuoi());
        System.out.println("Giới tính học sinh objHS1:" + objHS1.getGender());



        HocSinh objHS2 = new HocSinh();
        objHS2.setTenHocSinh("Phạm Thanh Mai");
        objHS2.setGender(false);
        System.out.println("Mã học sinh objHS2:" + objHS2.getMaHocSinh());
        System.out.println("Tên học sinh objHS2:"+ objHS2.getTenHocSinh());
        System.out.println("Tuổi học sinh objHS2:" + objHS2.getTuoi());
        System.out.println("Giới tính học sinh objHS2" + objHS2.getGender());

    }
}
