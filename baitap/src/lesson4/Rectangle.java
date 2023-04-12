package lesson4;

import java.lang.reflect.AccessibleObject;

public class Rectangle {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat1 = new HinhChuNhat(2,3);
        HinhChuNhat hinhChuNhat2 = new HinhChuNhat();
        hinhChuNhat2.setHeight(5);
        hinhChuNhat2.setWidth(6);
        System.out.println(hinhChuNhat2.tinhChuVi());
        System.out.println(hinhChuNhat2.tinhDienTich());

//        System.out.println("Chu vi la: " + hinhChuNhat1.tinhChuVi());
//        System.out.println("Dien tich la: " + hinhChuNhat1.tinhDienTich());
    }

}

class HinhChuNhat{
    public double tinhChuVi(){
        return (height + width) * 2;
    }

    public double tinhDienTich(){
        return height * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;
    private double height;
    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public HinhChuNhat() {
    }
}