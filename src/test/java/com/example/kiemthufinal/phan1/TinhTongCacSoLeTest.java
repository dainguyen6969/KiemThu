package com.example.kiemthufinal.phan1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongCacSoLeTest {
    TinhTongCacSoLe tinhTongCacSoLe = new TinhTongCacSoLe();

    @Test
    public void testHopLe() throws IllegalAccessException {
        int [] arr = {1, 3};
        assertEquals(4, tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testSoChan() throws IllegalAccessException {
        int [] arr = {2, 4};
        assertThrows(IllegalAccessException.class, () -> tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testDeTrong() throws IllegalAccessException {
        int [] arr = {};
        assertEquals(0, tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testCanbien() throws IllegalAccessException {
        int [] arr = {1, 999};
        assertEquals(1000, tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testSoAm() throws IllegalAccessException {
        int [] arr = {-1};
        assertThrows(IllegalAccessException.class, () -> tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testVoiSoKhong() throws IllegalAccessException {
        int [] arr = {};
        assertEquals(0, tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testVoiCacSoHonHop() throws IllegalAccessException {
        int [] arr = {1, 3, 4};
        assertThrows(IllegalAccessException.class, () -> tinhTongCacSoLe.sum(arr));
    }

    @Test
    public void testNgoaiLeLonHon1000() throws IllegalAccessException {
        int [] arr = {1001};
        assertThrows(IllegalAccessException.class, () -> tinhTongCacSoLe.sum(arr));
    }
}