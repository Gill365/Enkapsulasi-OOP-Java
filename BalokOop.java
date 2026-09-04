/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balokoop;


public class BalokOop {  

    
    public static void main(String[] args) {
        Balok blk1 = new Balok();
        blk1.setUkuran(2,4,8);
        System.out.println("OBJEK 1");
        blk1.tampilData();
        System.out.println();
        
        Balok blk2 = new Balok();           // jumTotalBalok otomatis +1
        blk2.setUkuran(8, 4, 12);
        
// isi data SEKALIGUS jumVolumeBalok otomatis +
        System.out.println("OBJEK 2");
        blk2.tampilData();
        System.out.println();
        
        Balok blk3 = new Balok() ;
        blk3.setUkuran(12, 6, 2);
        System.out.println("OBJEK 3");
        
        blk3.tampilData();
        System.out.println();
        
        System.out.println("Jumlah Total Obyek Balok yang dibuat "+ Balok.jumTotalBalok);
        System.out.println("Jumlah Total Volume Balok = " + Balok.jumVolumeBalok);
    }
}
