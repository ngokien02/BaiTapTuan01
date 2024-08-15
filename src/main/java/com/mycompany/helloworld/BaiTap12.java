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
public class BaiTap12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = 0, temp, min = 9, max = 0;
        while(n <= 0){
            System.out.print("Nhap so nguyen duong n: ");
            n = sc.nextInt();
        }
        while(n > 0){
            temp = n % 10;
            if(temp < min) min = temp;
            if(temp > max) max = temp;
            n = n / 10;
        }
        System.out.print("\nChu so lon nhat la " + max 
        + "\nChu so nho nhat la " + min);
    }
    
}
