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
public class BaiTap16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a;
        int n = nhapLength();
        a = new int[n];
        
        System.out.print("Mang phat sinh: ");
        mangRD(a, n);
        xuatMang(a);
        
        System.out.print("\nMang sau sap xep tang: ");
        sapXepTang(a);
        xuatMang(a);
        
        System.out.print("\nTong cac phan tu cua mang: " + tinhTong(a, n));
        
        System.out.print("\nCo " + demSoLe(a) + " so le trong mang");
        
        System.out.print("\nPhan tu lon nhat cua mang: " + timMax(a));
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
    public static int tinhTong(int[] a, int n){
        int tong = 0;
        for(int x : a){
            tong += x;
        }
        return tong;
    }
    public static int demSoLe(int[] a){
        int dem = 0;
        for(int x : a){
            if(x % 2 != 0){
                dem++;
            }
        }
        return dem;
    }
    public static int timMax(int[]a){
        int max = 0;
        for(int x : a){
            if(x > max){
                max = x;
            }
        }
        return max;
    }
}
