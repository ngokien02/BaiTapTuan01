/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTap02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double diemToan, diemVan, diemAnh, diemTB;
        String xepLoai = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem mon toan: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhap diem mon van: ");
        diemVan = sc.nextDouble();
        System.out.print("Nhap diem mon anh: ");
        diemAnh = sc.nextDouble();
        diemTB = (diemToan + diemVan + diemAnh) / 3;
        if(diemTB >= 0 && diemTB < 4){
            xepLoai = "Xep loai yeu";
        }
        else if(diemTB >= 4 && diemTB < 6.5){
            xepLoai = "Xep loai trung binh";
        }
        else if(diemTB >= 6.5 && diemTB < 8){
            xepLoai = "Xep loai kha";
        }
        else if(diemTB >= 8 && diemTB < 10){
            xepLoai = "Xep loai gioi";
        }
        else{
            xepLoai = "Diem nhap khong hop le, khong the xep loai";
        }
        System.out.printf("Diem trung binh %.2f %s", diemTB, xepLoai);
    }
    
}
