/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.helloworld;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTap15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int may, nguoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("=====TRO CHOI DOAN SO=====");
        Random rd = new Random();
        int dem = 0, dung = 0;
        String tiep = "y";
        while ("y".equals(tiep)) {
            may = rd.nextInt(11);
            System.out.println("May da chon so xong " + may);
            System.out.print("Ban doan so bao nhieu? ");
            nguoi = sc.nextInt();
            dem++;
            if (nguoi == may) {
                System.out.println("Ban doan chinh xac");
                dung++;
            } else {
                System.out.println("Ban doan sai");
            }
            System.out.println("Ban co muon choi tiep khong?(y/n)");
            tiep = sc.next();
        }
        System.out.println("Tro choi ket thuc, so lan doan cua ban: " + dem
                + "\nSo lan doan dung: " + dung);
    }

}
