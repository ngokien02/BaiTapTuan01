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
public class BaiTap17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = nhapLength();
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        nhapMang(a, sc);
        xuatMang(a);
        System.out.print("Trung binh gia tri mang: " + trungBinh(a));
        System.out.print("\nPhan tu nho nhat mang: " + timMin(a));
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
        }while(n < 1 || n > 20);
        return n;
    }
    public static void nhapMang(int[] a, Scanner sc){
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int[] a){
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + " ";
        }
        System.out.print(s);
    }
    public static int trungBinh(int[] a){
        int tb = 0;
        int tong = 0;
        for(int x : a){
            tong += x;
        }
        tb = tong / a.length;
        return tb;
    }
    public static int timMin(int[]a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
}
