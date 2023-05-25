public class AppComputer {
    public static void main(String[] args) {
        Computer objMT1 = new Computer();
        objMT1.setComputerName("Dell");
        objMT1.setComputerPrice(2000000);

        System.out.println("Ma may tinh la" + objMT1.getComputerCode());
        System.out.println("Ten may la " + objMT1.getComputerName());
        System.out.println("Can nang cua may la" + objMT1.getComputerWeight());
        System.out.println("Ram may co" + objMT1.getRam());
        System.out.println("Cpu cua may la " + objMT1.getCpu());
        System.out.println("He dieu hanh cua may la" + objMT1.getOperatingSystem());
        System.out.println("O cung cua may la" + objMT1.getHardDrive());
        System.out.println("Gia cua may la" + objMT1.getComputerPrice());

        Computer objMT2 = new Computer("MT0002","Macbook",1.4);
        objMT2.setRam(16);

        System.out.println("Ma may tinh la" + objMT2.getComputerCode());
        System.out.println("Ten may la " + objMT2.getComputerName());
        System.out.println("Can nang cua may la" + objMT2.getComputerWeight());
        System.out.println("Ram may co" + objMT2.getRam());
        System.out.println("Cpu cua may la " + objMT2.getCpu());
        System.out.println("He dieu hanh cua may la" + objMT2.getOperatingSystem());
        System.out.println("O cung cua may la" + objMT2.getHardDrive());
        System.out.println("Gia cua may la" + objMT2.getComputerPrice());
    }
}
