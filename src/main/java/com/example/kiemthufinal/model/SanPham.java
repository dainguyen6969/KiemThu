package com.example.kiemthufinal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    private String ma;
    private String ten;
    private Integer namBaoHanh;
    private Float gia;
    private Integer soLuong;
    private String danhMuc;
}
