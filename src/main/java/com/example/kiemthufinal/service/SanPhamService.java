package com.example.kiemthufinal.service;

import com.example.kiemthufinal.model.SanPham;

public class SanPhamService {
    public boolean themSanPham(SanPham sanPham) {
        if(sanPham == null) {
            return false;
        }

        if(checkDeTrong(sanPham.getMa()) ||
                checkDeTrong(sanPham.getTen()) ||
                checkDeTrong(String.valueOf(sanPham.getNamBaoHanh())) ||
                checkDeTrong(String.valueOf(sanPham.getGia())) ||
                checkDeTrong(sanPham.getDanhMuc())) {
            return false;
        }

        int soLuong = sanPham.getSoLuong();
        if(soLuong < 1 || soLuong > 100) {
            return false;
        }

        return true;
    }
    private Boolean checkDeTrong(String s) {
        return s == null || s.trim().isEmpty();
    }
}
