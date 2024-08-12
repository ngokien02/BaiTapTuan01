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
public class BaiTap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, soDao;
        String kq = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("=====KIEM TRA DOI XUNG=====");
        System.out.print("Nhap so nguyen duong n: ");
        n = sc.nextInt();
        soDao = TimSoDao(n);
        if(soDao == n){
            kq = "Doi xung";
        }
        else{
            kq = "Khong doi xung";
        }
        System.out.println(n + "la so " + kq);
    }
    private static int TimSoDao(int n){
        int soDao = 0;
        while(n > 0){
            soDao = soDao * 10 + n%10;
            n = n / 10;
        }
        return soDao;
    }
}
