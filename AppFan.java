public class AppFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.fast);//de lay hang so can set cho hang so thuoc tinh static
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("quat 1 :" + fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("quat 2 :" + fan2.toString());
    }
}
