package com.richie.psg_ukrim.lomba1;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Jawaban_2 {

    public static void main(String[] args) {
        int bulan, tahun;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan bulan : ");
        bulan = sc.nextInt();
        System.out.print("Masukan tahun : ");
        tahun = sc.nextInt();

        String sebutanBulan = "";

        switch (bulan) {
            case 1:
                sebutanBulan = "Januari";
                break;
            case 2:
                sebutanBulan = "Februari";
                break;
            case 3:
                sebutanBulan = "Maret";
                break;
            case 4:
                sebutanBulan = "April";
                break;
            case 5:
                sebutanBulan = "Mei";
                break;
            case 6:
                sebutanBulan = "Juni";
                break;
            case 7:
                sebutanBulan = "Juli";
                break;
            case 8:
                sebutanBulan = "Agustus";
                break;
            case 9:
                sebutanBulan = "September";
                break;
            case 10:
                sebutanBulan = "Oktober";
                break;
            case 11:
                sebutanBulan = "November";
                break;
            case 12:
                sebutanBulan = "Desember";
                break;
            default:
                System.out.println("Bulan tidak Valid");
                sebutanBulan = "Invalid";
                break;

        }
        if (tahun % 4 == 0 && (tahun % 400 == 0 || tahun % 100 != 0)) {
            if (bulan == 2) {
                System.out.println("Jumlah hari pada bulan " + sebutanBulan + " " + tahun + " : 29 hari");
            } else if (bulan % 2 != 0) {
                System.out.println("Jumlah hari pada bulan " + sebutanBulan + " " + tahun + " : 31 hari");
            } else {
                System.out.println("Jumlah hari pada bulan " + sebutanBulan + " " + tahun + " : 30 hari");
            }
        } else {
            if (bulan == 2) {
                System.out.println("Jumlah hari pada bulan " + sebutanBulan + " " + tahun + " : 28 hari");
            } else if (bulan % 2 != 0) {
                System.out.println("Jumlah hari pada bulan " + sebutanBulan + " " + tahun + " : 31 hari");
            } else {
                System.out.println("Jumlah hari pada bulan " + sebutanBulan + " " + tahun + " : 30 hari");
            }
        }
    }
}
