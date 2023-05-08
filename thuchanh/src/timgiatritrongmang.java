import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory",  "Zoe", "Emily"};
        //khởi tạo mảng tên của học sinh
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {//dùng for để duyệt mảng students
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + "is: "+ i);
                //in ra tên học sinh nếu tên học sinh có tring mảng
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found "+ input_name +"in the list");
            // in ra nếu không có tên học sinh
        }
    }
}
