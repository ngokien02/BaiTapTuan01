/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.helloworld;

/**
 *
 * @author Admin
 */
public class BaiTap13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s1 = 0, s2 = 0;
        System.out.println("Cac so tu 10 -> 99 co tich cua 2 chu so bang 2 lan tong cua 2 chu so do: ");
        for (int i = 10; i <= 99; i++) {
            s1 = i / 10;
            s2 = i % 10;
            int tich = s1 * s2;
            int tong = s1 + s2;
            if(tich == tong * 2){
                System.out.print(i + " ");
            }
        }
    }
    
}
