/*
 * Richie Zakaria
 */
package com.richie.psg_ukrim.lomba1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Jawaban_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan tahun : ");
        int tahun = sc.nextInt();
        if (tahun % 4 == 0 && (tahun % 400 == 0 || tahun % 100 != 0)) {
            System.out.println(tahun + " adalah leap year");
        } else {
            System.out.println(tahun + " bukan leap year");
        }
    }
}
