package BaiTap2Sao;

import java.util.Scanner;

public class KiemTraChuoiDoiXung {

    //Hàm kiểm tra chuỗi đối xứng
    public static boolean laDoiXung (String input){
        int inputIndexTrai = 0;
        int inputIndexPhai = input.length() - 1;

        while (inputIndexTrai<inputIndexPhai){
            if(input.charAt(inputIndexTrai) != input.charAt(inputIndexPhai)){
                return false;
            }
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
