/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTap19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = nhapLength();
        int[] a = new int[n];
        
        mangRD(a, n);
        System.out.print("\nMang ban dau: ");
        xuatMang(a);
        
        System.out.print("\nMang sau khi sap xep tang: ");
        sapXepTang(a);
        xuatMang(a);
        
        lietKeUocSo(a, sc);
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
        for(int x : a){
            System.out.print(x + " ");
        }
    }
    public static void mangRD(int[] a, int n){
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(101);
        }
    }
    public static void sapXepTang(int[]a){
        Arrays.sort(a);
    }
    public static void lietKeUocSo(int[]a, Scanner sc){
        System.out.print("\n\nNhap so nguyen x: ");
        int x = sc.nextInt();
        System.out.print("Cac phan tu la uoc so cua x: ");
        for(int y : a){
            if(x % y == 0){
                System.out.print(y + " ");
            }
        }
    }
}
