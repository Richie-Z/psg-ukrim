package com.richie.psg_ukrim.lomba1;

/**
 *
 * @author Richie-PC
 */
public class Jawaban_5 {

    public static void main(String[] args) {
        int fak1 = 1, fak2 = 2, fak3 = 3;
        int fixFak1 = 0, fixFak2 = 0, fixFak3 = 0;
        for (int i = 0; i < fak1; i++) {
            fixFak1 = fak1 * (fak1 - 1);
            if(fixFak1 == 0){
                fixFak1 = 1;
            }
        }
        for (int i = 0; i < fak2; i++) {
            fixFak2 = fak2 * (fak2 - 1);
            if(fixFak2 == 0){
                fixFak2 = 1;
            }
        }
        for (int i = 0; i < fak3; i++) {
            fixFak3 = fak3 * (fak3 - 1);
            if(fixFak3 == 0){
                fixFak3 = 1;
            }
        }
        double e = 1 + (double) 1 / fixFak1 + (double) 2 / fixFak2 + (double) 3 / fixFak3;
        System.out.println(e);
    }

}
