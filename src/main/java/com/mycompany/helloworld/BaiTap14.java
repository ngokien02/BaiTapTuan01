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
public class BaiTap14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double n = 1, dem = 0, sum = 0;
        while (n < 0 || n > 0) {
            System.out.print("Nhap 1 so thuc khac 0(Nhap 0 de ket thuc): ");
            n = sc.nextDouble();
            dem++;
            sum += n;
        }
        double tb = sum / (dem - 1);
        System.out.printf("\nTrung binh cac so vua nhap la: %.3f", tb);
    }

}
