/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_kedua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Maximal {

    private static Scanner sc = new Scanner(System.in);

    public static void psgWay() {
        int bil1, bil2, bil3, biggestNumber = 0;
        System.out.println("Masukkan angka pertama : ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan angka kedua : ");
        bil2 = sc.nextInt();
        System.out.println("Masukkan angka ketiga : ");
        bil3 = sc.nextInt();
        if (compareThreeItem(bil1, bil2, bil3)) {
            biggestNumber = bil1;
        } else if (compareThreeItem(bil2, bil1, bil3)) {
            biggestNumber = bil2;
        } else if (compareThreeItem(bil3, bil1, bil2)) {
            biggestNumber = bil3;
        }
        System.out.printf("Angka terbesar : %d", biggestNumber);
    }

    public static void lazyWay() {
        List<Integer> al = new ArrayList<Integer>();
        String[] index = {"pertama", "kedua", "ketiga"};
        for (String i : index) {
            System.out.printf("Masukkan angka %s : %n", i);
            al.add(sc.nextInt());
        }
        Collections.sort(al, Collections.reverseOrder());
        System.out.printf("Angka terbesar : %d", al.get(0));
    }

    public static Boolean compareThreeItem(int b1, int b2, int b3) {
        return b1 > b2 && b1 > b3;
    }

    public static void main(String[] args) {
        Maximal.psgWay();
//        Maximal.lazyWay();      // lazy way
    }
}
