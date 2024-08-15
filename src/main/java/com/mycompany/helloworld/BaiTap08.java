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
public class BaiTap08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N de tinh tong tu 1 -> N: ");
        int n = sc.nextInt();
        int tong = 0;
        if (n < 1) {
            System.out.print("N khong hop le!");
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                tong += i;
            }
        }

        System.out.print("\nTong tu 1 -> N: " + tong);
    }

}
