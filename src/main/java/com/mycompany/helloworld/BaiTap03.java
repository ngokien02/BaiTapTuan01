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
public class BaiTap03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhap vao 3 so nguyen: \n");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int min = 0;
        if(a < b && a < c){
            min = a;
        }
        if(b < a && b < c){
            min = b;
        }
        if(c < a && c < b){
            min = c;
        }
        System.out.print("So nho nhat trong 3 so vua nhap la: " + min);
    }
    
}
