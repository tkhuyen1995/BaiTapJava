package BaiTap2Sao;

import java.util.Scanner;

public class TinhThue {
    public static double tinhThue(double thuNhap){
        double soThue = 0;
        if (thuNhap > 0 && thuNhap <= 5000000){
            soThue = thuNhap * 0.05;
        } else if (thuNhap > 5000000 && thuNhap <= 10000000) {
            soThue = thuNhap * 0.1;
        } else if (thuNhap > 10000000 && thuNhap <= 18000000) {
            soThue = thuNhap * 0.15;
        } else if (thuNhap > 1800000 && thuNhap <= 32000000) {
            soThue = thuNhap * 0.2;
        } else if (thuNhap > 3200000 && thuNhap <= 52000000) {
            soThue = thuNhap * 0.25;
        } else if (thuNhap > 5200000 && thuNhap <= 80000000) {
            soThue = thuNhap * 0.3;
        } else if (thuNhap > 8000000) {
            soThue = thuNhap * 0.35;
        }else {
            System.out.println("Vui lòng nhập lại thu nhập hằng năm");
        }
        return soThue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thu nhập hằng năm: ");
        double thuNhap = scanner.nextDouble();

        double soThue = tinhThue(thuNhap);
        System.out.println("Số thuế phải trả: " + soThue);

    }
}
