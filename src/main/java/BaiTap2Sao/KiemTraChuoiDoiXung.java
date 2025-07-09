package BaiTap2Sao;

import java.util.Scanner;

public class KiemTraChuoiDoiXung {

    //Hàm kiểm tra chuỗi đối xứng
    public static boolean laDoiXung (String input){
        //kỹ thuật 2 con trỏ:
        int inputIndexTrai = 0;//trỏ vào ký tự đầu tiên của chuỗi
        int inputIndexPhai = input.length() - 1;//trỏ vào ký tự cuối cùng của chuỗi

        while (inputIndexTrai<inputIndexPhai){
            if(input.charAt(inputIndexTrai) != input.charAt(inputIndexPhai)){
                return false;
            }
            //Xét các cặp tiếp theo
            inputIndexTrai++;
            inputIndexPhai--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra: ");
        String input = scanner.nextLine();

        boolean kiemTraDoiXung = laDoiXung(input);
        System.out.println(kiemTraDoiXung);
    }
}
