package BaiTap1Sao;

import java.util.Scanner;

public class InChuCaiDauTienCuaTu {
    public static String getFirstLetter (String input){
        //xóa khoảng trắng đầu và cuối chuỗi sau đó tách chuỗi thành tưng mảng từ
        String[] words = input.trim().split("\\s+");

        //kiểm tra rỗng
        if(input.trim().isEmpty()){
            return "";
        }

        String result = "";
        for (String word : words){
            result += word.charAt(0) + " ";
        }
        return  result.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi cần tách: ");
        String input = scanner.nextLine();

        String result = getFirstLetter(input);
        System.out.println("Kết quả: " + result);
    }
}
