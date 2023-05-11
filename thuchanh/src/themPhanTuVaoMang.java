import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        int array[] = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        int number = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number you want to add: ");
        number = scanner.nextInt();//Gán giá trị cho number cần chèn
        System.out.print("Enter position: ");
        index = scanner.nextInt();//gán vị trí cho number
        if(index <= -1 && index >= array.length -1){
            System.out.println("Phi logic làm lại đmm");
            //điều kiện
        }
        int newArray[] = new int[5];//tạo mảng mới để thêm số mới
        for (int i = 0,j=0; i < newArray.length; i++) {
            if(i == index){
                newArray[i]= number;// gán number cho vị trí cần gán
                continue;
            }
          newArray[i] = array[j];//tiếp tục gán cho mảng mới
          j++;
        }


        System.out.print("mang moi: ");
        for (int j = 0; j < newArray.length; j++) {
            System.out.println(newArray[j] + "\t");//in ra mảng mới
        }
    }
}
