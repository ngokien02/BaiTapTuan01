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
public class BaiTap06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap lan luot 2 so nguyen: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Nhap 1 phep tinh: ");
        String toanTu = sc.next();
        double kq = 0;
        switch(toanTu){
            case "+":
                kq = a + b;
                break;
            case "-":
                kq = a - b;
                break;
            case "*":
                kq = a * b;
                break;
            case "/":
                if(b != 0){
                    kq = a / b;
                }
                else{
                    System.out.println("Khong the chia cho 0!");
                }
                break;
            default:
                System.out.println("Nhap sai toan tu!");
                break;
        }
        System.out.println("Ket qua phep tinh: " + kq);
    }
    
}
