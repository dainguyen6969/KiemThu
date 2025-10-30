package com.example.kiemthufinal.service;

import com.example.kiemthufinal.model.SanPham;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {

    SanPhamService sanPhamService = new SanPhamService();
    @Test
    public void themSanPhamHopLe() {
        SanPham sanPham = new SanPham("TH001", "ten", 2025, 12f, 3, "laptop");
        assertTrue(sanPhamService.themSanPham(sanPham));
    }

    @Test
    public void themSanPhamVoiSoLuongLaAm() {
        SanPham sanPham = new SanPham("TH001", "ten", 2025, 12f, -1, "laptop");
        assertFalse(sanPhamService.themSanPham(sanPham));
    }

    @Test
    public void themSanPhamSoLuongCanBien1() {
        SanPham sanPham = new SanPham("TH001", "ten", 2025, 12f, 101, "laptop");
        assertFalse(sanPhamService.themSanPham(sanPham));
    }

    @Test
    public void themSanPhamVoiSoLuongCanBien2() {
        SanPham sanPham = new SanPham("TH001", "ten", 2025, 12f, 100, "laptop");
        assertTrue(sanPhamService.themSanPham(sanPham));
    }

    @Test
    public void testDeTrongSanPham() {
        SanPham sanPham = new SanPham("", "", null, null, null, "");
        assertFalse(sanPhamService.themSanPham(sanPham));
    }
}