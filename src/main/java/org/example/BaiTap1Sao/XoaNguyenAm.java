package org.example.BaiTap1Sao;

import java.util.Scanner;

public class XoaNguyenAm {

    public static boolean isNguyenAm(char kyTu){
        kyTu = Character.toLowerCase(kyTu); // chuyển về chữ thường để kiểm tra
        return kyTu == 'a' || kyTu == 'e' || kyTu == 'o' || kyTu == 'i' || kyTu == 'u';
    }

    public static String chuoiKhongNguyenAm(String input){
        String output = ""; // kết quả
        for (int i = 0; i < input.length(); i++ ){
            char kyTu = input.charAt(i); // lấy ký tự trong chuỗi thông qua index
            System.out.println("chuỗi ký tự: " + kyTu);
            if(!isNguyenAm(kyTu)){ // kiểm tra xem có phải nguyên âm hay không
                output += kyTu; // đưa ký tự vào chuỗi nếu không phải nguyên âm
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần xử lý: ");
        String input = scanner.nextLine();

        String output = chuoiKhongNguyenAm(input);
        System.out.println("Chuối sau khi xử lý: " + output);
    }
}
