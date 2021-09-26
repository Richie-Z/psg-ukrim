package com.richie.psg_ukrim.lomba1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Jawaban_1 {

    public static void main(String[] args) {
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        min = sc.nextInt();
        System.out.print("Masukan angka kedua : ");
        max = sc.nextInt();

        for (int i = min + 1; i < max; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " genap");
            } else {
                System.out.println(i + " ganjil");
            }
        }
    }
}
