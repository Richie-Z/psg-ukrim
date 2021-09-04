/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_ketiga;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Patern {

    private final Scanner SC = new Scanner(System.in);

    public void rightTriangle() {
        System.out.println("Masukan Jumlah Baris : ");
        int row = SC.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void triangle() {
        System.out.println("Masukan Jumlah Baris : ");
        int row = SC.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void main() {
        System.out.println("Pilih [1/2]");
        System.out.println("1. Right Triangle ");
        System.out.println("2. Triangle ");
        int pilihan = SC.nextInt();
        switch(pilihan){
            case 1 :
                this.rightTriangle();
                break;
            case 2 :
                this.triangle();
                break;
            default :
                System.out.println("PILIH YANG BENER!!");
                this.main();
                break;
        }
    }

    public static void main(String[] args) {
        Patern pt = new Patern();
        pt.main();
    }
}
