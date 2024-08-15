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
public class BaiTap18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = nhapLength(sc);
        int[] a = new int[n];
        nhapMang(a, sc);
        xuatMang(a);
        lietKe(a);
        tinhTrungBinh(a);
    }

    public static int nhapLength(Scanner sc) {
        int n;
        boolean flag = true;
        do {
            if (flag) {
                System.out.print("Nhap do dai mang: ");
                n = sc.nextInt();
            } else {
                System.out.print("Sai dieu kien, vui long nhap lai: ");
                n = sc.nextInt();
            }
            flag = false;
        } while (n < 1 || n > 20);
        return n;
    }

    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }
        System.out.print("Mang vua nhap: " + s);
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
    public static void lietKe(int[] a){
        System.out.print("\nCac phan tu khong phai so nguyen to: ");
        for (int i = 0; i < a.length; i++) {
            if(!soNguyenTo(a[i])){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void tinhTrungBinh(int[] a){
        double snt = 0, dem = 0;
        System.out.print("\nCac so nguyen to: ");
        for (int i = 0; i < a.length; i++) {
            if(soNguyenTo(a[i])){
                snt += a[i];
                dem++;
                System.out.print(a[i] + " ");
            }
        }
        double tb = snt / dem;
        System.out.printf("\nTrung binh cac so nguyen to trong mang: %.2f", tb);
    }
}
