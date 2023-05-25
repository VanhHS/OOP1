public class AppTemperature {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.setC(25);

        System.out.println("Nhiệt độ F =" + temperature.cSangF());
        System.out.println("Nhiệt độ F =" + temperature.cSangKelvin());
    }
}
