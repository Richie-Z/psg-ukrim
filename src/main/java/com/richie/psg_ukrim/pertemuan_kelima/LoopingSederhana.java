/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_kelima;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class LoopingSederhana {

    public static Scanner sc = new Scanner(System.in);
    public static int min = 0, max = 0;

    public static void Looping() {
        System.out.println("Masukan nilai min : ");
        min = sc.nextInt();
        System.out.println("Masukan nilai max : ");
        max = sc.nextInt();
        int hasil = 0;
        for (int i = min; i <= max; i++) {
            hasil += i;
        }
        System.out.println("Hasil : " + hasil);
    }

    public static void main(String[] args) {
        LoopingSederhana.Looping();
    }
}
