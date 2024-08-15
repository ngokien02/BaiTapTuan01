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
public class BaiTap20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = nhapLength();
        int[] a = new int[n];
        
        nhapMang(a, sc);
        xuatMang(a);
        viTri(a, sc);
        kiemTraTangDan(a);
    }
    public static int nhapLength(){
        int n;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            if (flag) {
                System.out.print("Nhap do dai mang: ");
                n = sc.nextInt();
            }
            else{
                System.out.print("Sai dieu kien, vui long nhap lai: ");
                n = sc.nextInt();
            }
            flag = false;
        }while(n < 0 || n > 20);
        return n;
    }
    public static void xuatMang(int[]a){
        System.out.print("Mang da nhap: ");
        for(int x : a){
            System.out.print(x + " ");
        }
    }
    public static void nhapMang(int[] a, Scanner sc){
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    public static void viTri(int[] a, Scanner sc){
        int khongXuatHien = 0;
        System.out.print("\nNhap so nguyen x: ");
        int x = sc.nextInt();
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                System.out.print("x co xuat hien trong mang a, vi tri dau tien cua x la a[" + i + "]");
                break;
            }
            else{
                khongXuatHien++;
            }
        }
        if(khongXuatHien == a.length){
            System.out.print("x khong xuat hien trong mang a");
        }
    }
    public static void kiemTraTangDan(int[] a){
        int kt = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] < a[i - 1]){
                kt++;
                break;
            }
        }
        if(kt > 0){
            System.out.print("\nMang khong tang dan");
        }
        else{
            System.out.print("\nMang co tang dan");
        }
    }
}
