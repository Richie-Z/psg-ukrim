/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.richie.psg_ukrim.pertemuan_pertama;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Richie-PC
 */
public class Madlib {

    private Scanner scan = new Scanner(System.in);
    private String name;
    private final String[] SCEN = {
        "%s pada hari %s pergi ke Kota Palangkaraya",
        "%s pergi memancing bareng temannya pada hari %s",
        "%s meninggal pada hari %s",
        "Oh tidak %s pada hari %s menghilang :("
    };
    private final int MIN = 0, MAX = this.SCEN.length - 1;

    public Madlib() {
        System.out.println("Nama kau siapa?!");
        this.name =  this.nameValidator(this.scan.nextLine());
    }

    private String simpleScenario() {
        int key = randomizerNumber();
        return this.SCEN[key];
    }

    private int randomizerNumber() {
        int a = (int) (Math.random() * ((this.MAX - this.MIN) + 1)) + this.MIN;
        if (a > this.MAX) {
            return randomizerNumber();
        }
        return a;
    }

    private String nameValidator(String name) {
        name = name + " ";
        return name.split(" ")[0];
    }
    private String getDayIndo(){
        String[] hari = {"Minggu","Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu"};
        Date d =new Date();
        return hari[d.getDay()];
    }
    private void main(){
          System.out.printf(this.simpleScenario(), this.name, this.getDayIndo());
    }
    public static void main(String[] args) {
        Madlib r = new Madlib();
        r.main();
    }
}
