package BaiTap2Sao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class XoaKyTuLapLaiTrongChuoi {
    public static String XoaKyTuTrung(String input){
        if(input == null){
            return null;
        }

        Map<Character,Boolean> seen = new HashMap<>();
        //không thể sử dụng String result = ""; vì không sử dụng được method append
        StringBuilder result = new StringBuilder();
        int n = input.length();
        for(int i = 0 ; i < n; i++){
            char c = input.charAt(i);
            if(!seen.containsKey(c)){
                seen.put(c,true); // đánh dấu
                result.append(c);// thêm ký tự vào kết quả
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String input = scanner.nextLine();

        String result = XoaKyTuTrung(input);
        System.out.println("Chuỗi sau khi xóa ký tự trùng: " + result);
    }
}
