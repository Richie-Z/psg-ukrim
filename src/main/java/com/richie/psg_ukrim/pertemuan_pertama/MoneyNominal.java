/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_pertama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class MoneyNominal {

    private Scanner scan = new Scanner(System.in);
    private int[] idCoin = {500, 200, 100, 50, 10};
    private int money;
    private List<Integer> pembagian = new ArrayList<>();

    public MoneyNominal() {
        System.out.println("Input Nominal : ");
        this.money = this.scan.nextInt();
        this.pecahinGan();
        this.print();
    }

    public void pecahinGan() {
        for (int i = 0; i < this.idCoin.length; i++) {
            int now = this.idCoin[i];
            if (this.money > now) {
                this.minusGan(now);
            }
            if (this.money < now) {
                continue;
            } else if (this.money == 0) {
                break;
            }
        }
    }

    public void minusGan(int now) {
        this.money -= now;
        this.pembagian.add(now);
        if (this.money >= now) {
            this.minusGan(now);
        }
    }

    public void print() {
        int cur = this.pembagian.get(0);
        int num = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 1; i < this.pembagian.size(); i++) {
            int now = this.pembagian.get(i);
            if (cur == now) {
                num++;
            }else{
                num = 1;
            }
            cur = now;

            hm.put(now, num);
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        MoneyNominal mn = new MoneyNominal();
    }
}
