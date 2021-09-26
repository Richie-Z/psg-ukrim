package com.richie.psg_ukrim.lomba1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Jawaban_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = sc.nextInt();
        int hasilBalik = 0;
        for (int i = angka; i != 0; i /= 10) {
            hasilBalik = hasilBalik * 10 + i % 10;
        }
        System.out.println("Hasil : " + hasilBalik);
    }
}
