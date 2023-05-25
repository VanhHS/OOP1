public class Computer {
    private String computerCode = "MT0001";
    private String computerName = "máy tính mặc định";
    private double computerWeight = 2;
    private int ram = 8;
    private String cpu = "i39100f";
    private String operatingSystem = "window";
    private int hardDrive = 128;
    private double computerPrice = 1000000;
    public Computer(){

    }

    public Computer(String computerCode) {
        this.computerCode = computerCode;
    }

    public Computer(String computerCode, String computerName) {
        this.computerCode = computerCode;
        this.computerName = computerName;
    }

    public Computer (String computerCode, String computerName, double computerWeight) {
        this.computerCode = computerCode;
        this.computerName = computerName;
        this.computerWeight = computerWeight;
    }

    public Computer(String computerCode, String computerName, double computerWeight, int ram) {
        this.computerCode = computerCode;
        this.computerName = computerName;
        this.computerWeight = computerWeight;
        this.ram = ram;
    }

    public Computer(String computerCode, String computerName, double computerWeight, int ram, int hardDrive) {
        this.computerCode = computerCode;
        this.computerName = computerName;
        this.computerWeight = computerWeight;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    public Computer(String computerCode, String computerName, double computerWeight, int ram, String cpu, int hardDrive) {
        this.computerCode = computerCode;
        this.computerName = computerName;
        this.computerWeight = computerWeight;
        this.ram = ram;
        this.cpu = cpu;
        this.hardDrive = hardDrive;
    }

    public Computer(String computerCode, String computerName,  double computerWeight, int ram, String cpu, String operatingSystem, int hardDrive) {
        this.computerCode = computerCode;
        this.computerName = computerName;
        this.computerWeight = computerWeight;
        this.ram = ram;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.hardDrive = hardDrive;
    }

    public Computer(String computerCode, String computerName, double computerWeight, int ram, String cpu, String operatingSystem, int hardDrive, int computerPrice) {
        this.computerCode = computerCode;
        this.computerName = computerName;
        this.computerWeight = computerWeight;
        this.ram = ram;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.hardDrive = hardDrive;
        this.computerPrice = computerPrice;
    }

    public String getComputerCode() {
        return computerCode;
    }

    public void setComputerCode(String computerCode) {
        this.computerCode = computerCode;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setComputerWeight(double computerWeight) {
        this.computerWeight = computerWeight;
    }

    public double getComputerWeight() {
        return computerWeight;
    }

    public double getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(double computerPrice) {
        this.computerPrice = computerPrice;
    }
}
