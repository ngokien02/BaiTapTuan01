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
public class BaiTap07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int soNgay = 0; 
        int thang, nam;
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("\nNhap nam: ");
        nam = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 2:
                if(nam % 4 == 0){
                    soNgay = 29;
                }else{
                    soNgay = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            default:
                System.out.print("\nThang nhap khong hop le!");
        }
        System.out.println("\nNam " + nam + " - thang " + thang + " co "
        + soNgay + " ngay");
    }
    
}
