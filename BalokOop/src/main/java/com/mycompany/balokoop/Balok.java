/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.balokoop;

/**
 *
 * @author sosok
 */
public class Balok {
    public double panjang;
    protected double lebar;
    double tinggi;
    public static double jumVolumeBalok;
    public static int jumTotalBalok;
    
    public Balok(){
        jumTotalBalok++;
    }
    
    public void setUkuran(double p, double l, double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
        
        jumVolumeBalok += hitungVolume();
    }
    
    public double hitungVolume(){
        double volume = panjang * lebar * tinggi;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * ((panjang*lebar) + (panjang*tinggi)+ (lebar*tinggi));
        return luasPermukaan;
    }
    
    public double hitungDiagonalRuang(){
        double hitungDiagonal = Math.sqrt(Math.pow(panjang,2) + Math.pow(lebar,2) + Math.pow(tinggi,2));
        return hitungDiagonal;
    }
    
    double hitungDiagonalSisiDepan(){
       double diagonalSisiDepan = Math.sqrt(Math.pow(panjang,2) + Math.pow(tinggi,2));
       return diagonalSisiDepan;
    }
    
    protected double hitungDiagonalSisiSamping(){
        double diagonalSisiSamping = Math.sqrt(Math.pow(lebar, 2)+ Math.pow(tinggi,2));
        return diagonalSisiSamping;
    }

    private double hitungDiagonalSisiAtas(){
        double diagonalSisiAtas = Math.sqrt(Math.pow(panjang,2)+ Math.pow(lebar,2));
        return diagonalSisiAtas;
    }
    
    public void tampilData(){
        System.out.println("Panjang = "+ panjang);
        System.out.println("Lebar = "+ lebar);
        System.out.println("Tinggi = "+ tinggi);
        System.out.println("Volume = "+ hitungVolume());
        System.out.println("Luas Permukaan = "+ hitungLuasPermukaan());
        System.out.println("Diagonal Ruang = "+ hitungDiagonalRuang());
        System.out.println("Diagonal Sisi Depan = "+ hitungDiagonalSisiDepan());
        System.out.println("Samping = "+ hitungDiagonalSisiSamping());
        System.out.println("Diagonal Sisi Atas   : " + hitungDiagonalSisiAtas());
    }
    
    
    
    
    
    
}
