public class Mobile {
    int id;
    String brand;
    String color;
    int height;
    int width;
    int thickness;
    int energy;

    public Mobile() {
        this.id=66788;
        this.brand="nokia";
        this.color="blue";
        this.height=60;
        this.width=30;
        this.thickness=1;
        this.energy=10;
    }public Mobile(String brand) {
        this.id=72191;
        this.brand=brand;
        this.color="blue";
        this.height=60;
        this.width=30;
        this.thickness=1;
        this.energy=10;
    }public Mobile(String brand, String color) {
        this.id=66788;
        this.brand=brand;
        this.color=color;
        this.height=60;
        this.width=30;
        this.thickness=1;
        this.energy=10;
    }

    public Mobile(int id, String brand, String color, int height, int weight, int thickness, int energy) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.height = height;
        this.width = weight;
        this.thickness = thickness;
        this.energy = energy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width= width;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else if (energy > 100) {
            this.energy = 100;
        } else {
            this.energy = energy;
        }
    }
}
class AppMobile {
    public static void main(String[] args) {
        Mobile objMobile1 = new Mobile();
        objMobile1.setBrand("Samsung");
        objMobile1.setColor("Yellow");
        objMobile1.setWidth(15);
        System.out.printf("id: " + objMobile1.getId());
        System.out.printf("brand : " + objMobile1.getBrand());
        System.out.printf("color: " + objMobile1.getColor());
        System.out.printf("height: " + objMobile1.getHeight());
        System.out.printf("weight: " + objMobile1.getWidth());
        System.out.printf("thickness: " + objMobile1.getThickness());
        System.out.printf("energy: " + objMobile1.getEnergy());

        Mobile objMobile2 = new Mobile("Apple");
        objMobile2.setHeight(12);
        objMobile2.setWidth(20);
        objMobile2.setEnergy(100);
        System.out.printf("id: " + objMobile2.getId());
        System.out.printf("brand : " + objMobile2.getBrand());
        System.out.printf("color: " + objMobile2.getColor());
        System.out.printf("height: " + objMobile2.getHeight());
        System.out.printf("weight: " + objMobile2.getWidth());
        System.out.printf("thickness: " + objMobile2.getThickness());
        System.out.printf("energy: " + objMobile2.getEnergy());
    }
}