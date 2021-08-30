/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_kedua;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class DigitAngka {

    private static Scanner sc = new Scanner(System.in);

    public static void psgWay() {
        System.out.println("Masukkan sebuah digit angka : ");
        int digit = sc.nextInt();
        switch (digit) {
            case 0:
                System.out.println("Nol");
                break;
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            default:
                System.out.println("Hanya menerima digit 0 - 9 ");
                break;
        }
    }

    public static void lazyWay() {
        System.out.println("Masukkan sebuah digit angka : ");
        int digit = sc.nextInt();
        if (digit > 9 || digit < 0) {
            System.out.println("Hanya menerima digit 0 - 9");
            return;
        }
        String[] terbilang = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"};
        System.out.println(terbilang[digit]);
    }

    public static void main(String[] args) {
        DigitAngka.psgWay();
//        DigitAngka.lazyWay();   // lazy way
    }
}
