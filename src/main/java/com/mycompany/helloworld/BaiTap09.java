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
public class BaiTap09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int n = sc.nextInt();
        int dem = 0;
        if(n <= 0){
            System.out.print("\nN phai lon hon 0!");
            return;
        }
        else{
            for (int i = 1; i <= n; i++) {
                if(n % i == 0){
                    dem++;
                }
            }
        }
        System.out.print("So uoc so cua " + n + " la: " + dem);
    }
    
}
