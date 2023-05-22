import org.w3c.dom.css.Rect;

import java.awt.*;
import java.util.Scanner;

public class Rectangle {
    double width, height;//khởi tạo biến

    public Rectangle() {

    }

    public Rectangle(double width ,double height)//khoi tao doi tuong cua lop
    //khởi tạo đối tượng có tham số
    {
        this.height = height;
        this.width = width;
    }

    public double getArea() {//khoi tao phuong thuc 0 tham so, co dau ra
        return this.height * this.width;
    }

    public double getPerimeter() {//khoi tao phuong thuc 0 tham so, co dau ra
        return (this.height + this.width) * 2;
    }

    public String disPlay() {//khoi tao phuong thuc  0 tham so , co dau ra
        return "Rectangle {" + "width" + width + "height" + height + "}";
    }

}
