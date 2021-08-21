/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_pertama;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class MoneyNominal {

    private Scanner scan = new Scanner(System.in);
    private final int[] COIN = {500, 200, 100, 50, 10, 5};
    private int money;
    private List<Integer> pembagian = new ArrayList<>();
    private HashMap<Integer, Integer> hm = new HashMap<>();

    public MoneyNominal() {
        System.out.println("Input Nominal : ");
        this.money = this.scan.nextInt();
        this.pecahinGan();
        this.indexing();
    }
    
    public void pecahinGan() {
        for (int i = 0; i < this.COIN.length; i++) {
            int now = this.COIN[i];
            if (this.money >= now) {
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

    public void indexing() {
        int cur = this.pembagian.get(0);
        int num = 1;
        for (int i = 1; i < this.pembagian.size(); i++) {
            int now = this.pembagian.get(i);
            if (cur == now) {
                num++;
            } else {
                num = 1;
            }
            cur = now;
            this.hm.put(now, num);
        }
    }

    public void main() {
        for (Map.Entry<Integer, Integer> e : this.hm.entrySet()) {
            System.out.printf("%d : %d %n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        MoneyNominal mn = new MoneyNominal();
        mn.main();
    }
}
