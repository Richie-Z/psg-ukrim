package com.richie.psg_ukrim.lomba1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Jawaban_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka : ");
        int angka = sc.nextInt();
        String binary = "";
        while (angka > 0) {
            int modul = angka % 2;
            System.out.println(angka + "/" + 2 + "=" + (int) angka / 2 + " sisa " + modul);
            binary += modul;
            angka = angka / 2;
        }
        System.out.println("Hasil : " + binary);
        int hasilBalik = 0;
        String hasil = "";
        for (int i = Integer.parseInt(binary); i != 0; i /= 10) {
            int logic = hasilBalik * 10 + i % 10;
            hasil += (logic == 0) ? "0" : logic;
        }
        System.out.println("Hasil : " + hasil);
    }
}
