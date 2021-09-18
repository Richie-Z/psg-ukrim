/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_keempat;

import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class MenebakAngka {

    public static Scanner sc = new Scanner(System.in);
    public static final int TRUTH_VAL = 0;
    public static int myGuess = 0;

    public static void gasKeun() {
        System.out.println("Masukan nilai tebakan anda:");
        myGuess = sc.nextInt();
        System.out.printf("Nilai tebakan anda : %d %n", myGuess);
        System.out.printf("Tebakan anda : %s", (myGuess == TRUTH_VAL) ? "Benar" : "Salah");
    }

    public static void aljabarBoolean() {
        System.out.println("Masukan nilai antara 9 sampai 18 :");
        myGuess = sc.nextInt();
        System.out.printf("Tebakan anda : %s", (myGuess >= 9 && myGuess <= 18) ? "Benar" : "Salah");
    }

    public static void main(String[] args) {
        MenebakAngka.gasKeun();
        MenebakAngka.aljabarBoolean();
    }
}
