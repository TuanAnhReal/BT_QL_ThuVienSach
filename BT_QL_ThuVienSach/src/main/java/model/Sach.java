/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Sach {

    private int tenSach;
    private String tacGia;
    private Date namXB;
    private String theLoai;
    private String soLuong;

    public Sach(int tenSach, String tacGia, Date namXB, String theLoai, String soLuong) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXB = namXB;
        this.theLoai = theLoai;
        this.soLuong = soLuong;
    }

    public int getTenSach() {
        return tenSach;
    }

    public void setTenSach(int tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Date getNamXB() {
        return namXB;
    }

    public void setNamXB(Date namXB) {
        this.namXB = namXB;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "Sach{" + "tenSach=" + tenSach + ", tacGia=" + tacGia + ", namXB=" + namXB + ", theLoai=" + theLoai + ", soLuong=" + soLuong + '}';
    }
    
}
