public class Fan {
    public final static int slow = 1;
    public final static int medium = 2;
    public final static int fast =3;
    private int speed ;
    private boolean on ;
    private double radius;
    private String color ;
    public Fan(){
        this.speed=slow;
        this.on=false;
        this.radius=5;
        this.color="blue";
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(on){
            return "Speed: " + this.speed +"Color :" + this.color + "Radius" +this.radius+"fan is on";
        }else {
            return "Speed :" + this.speed +"Color :" + this.color + "Radius" +this.radius+"fan is of";
        }
    }
}