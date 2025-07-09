package BaiTap1Sao;

import java.util.Scanner;

public class TinhTongCacSoChan {
    public static int tongChan(int n){
        int tong = 0;
        //duyệt qua vòng lặp
        for (int i = 0; i <= n; i+=2){
            tong += i;
        }
        return tong;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số n: ");
        int n = scanner.nextInt();

        int result = tongChan(n);
        System.out.println("Tổng chẵn: " + result);
    }
}
