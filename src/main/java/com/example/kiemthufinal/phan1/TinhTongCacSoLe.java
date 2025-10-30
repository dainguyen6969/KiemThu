package com.example.kiemthufinal.phan1;

public class TinhTongCacSoLe {
    public static int sum(int[] arr) throws IllegalAccessException {
        int soLe = 0;
        for(int soHonHop: arr) {
            if(soHonHop % 2 == 0 || soHonHop < 1 || soHonHop > 1000) {
                throw new IllegalAccessException("Khong duoc phep chua so le va be hon mot hoac lon hon 1000");
            } else {
                soLe += soHonHop;
            }
        }
        return soLe;
    }
}
