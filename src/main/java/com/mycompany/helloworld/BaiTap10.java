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
public class BaiTap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen duong: ");
        int n = sc.nextInt();
        if(soNguyenTo(n)){
            System.out.print(n + " la so nguyen to");
        }
        else{
            System.out.print(n + " khong phai la so nguyen to");
        }
    }
    public static Boolean soNguyenTo(int so){
        if(so < 2){
            return false;
        }
        for (int i = 2; i < so; i++) {
            if(so % i == 0){
                return false;
            }
        }
        return true;
    }
}
