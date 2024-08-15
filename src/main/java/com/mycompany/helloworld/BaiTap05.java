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
public class BaiTap05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=====TINH TIEN TAXI=====");
        System.out.print("Nhap so km: ");
        double km = sc.nextDouble();
        double tienTra = 0;
        if(km <= 1 && km >= 0){
            tienTra = 15000; 
        }
        else if(km > 1 && km <= 5){
            tienTra = 15000 + 13500 * (km - 1);
        }
        else if(km > 5){
            tienTra = 15000 + 13500 * 4 + 11000 * (km - 5);
        }
        if(km > 120){
            tienTra = tienTra * 0.9;
        }
        System.out.print("So tien phai tra: " + tienTra);
    }
    
}
