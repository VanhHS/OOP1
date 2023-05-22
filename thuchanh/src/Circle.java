import java.lang.constant.Constable;

public class Circle {
    double radius;
    String color;
    public Circle( double radius) {//khoi tao doi tuong co tham so
        this.radius = radius;
    }
    public String color(String color){//khoi taao phuong thuc co tham so co dau ra
        this.color =color;
        return color;
    }
    public double getRadius(){// khoi tao phuong thuc 0 tham so co dau ra
        return radius;
    }
    public double getArea(){//khoi tao phuong thuc 0 tham so co dau ra
        return Math.PI * this.radius * this.radius;
    }
}
